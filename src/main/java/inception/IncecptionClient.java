package inception;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.commons.io.IOUtils;
import org.tensorflow.framework.DataType;
import org.tensorflow.framework.TensorProto;
import org.tensorflow.framework.TensorShapeProto;
import tensorflow.serving.Model;
import tensorflow.serving.Predict;
import tensorflow.serving.PredictionServiceGrpc;
import io.grpc.StatusRuntimeException;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class IncecptionClient {

    // mvn protobuf:compile
    // mvn protobuf:compile-custom // compile service

    public static void main(String[] args) throws IOException {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("192.168.9.53", 9000)
                .usePlaintext(true).maxInboundMessageSize(100 * 1024 * 1024).build();

        PredictionServiceGrpc.PredictionServiceBlockingStub blockingStub =
                PredictionServiceGrpc.newBlockingStub(channel);

        Model.ModelSpec modelSpec = Model.ModelSpec.newBuilder()
                .setName("inception").setSignatureName("predict_images").build();

        TensorProto.Builder featuresTensorBuilder = TensorProto.newBuilder();

        String modelPath = "";
        if (args.length > 0){
            modelPath = args[0];
        } else {
            String url = IncecptionClient.class.getClassLoader()
                    .getResource("plane.jpg").getFile();
            modelPath = url;
        }
        FileInputStream inputStream = new FileInputStream(modelPath);
        byte[] bytes = IOUtils.toByteArray(inputStream);

        TensorShapeProto.Dim featuresDim1 = TensorShapeProto.Dim.newBuilder().setSize(1).build();
        TensorShapeProto featuresShape = TensorShapeProto.newBuilder().addDim(featuresDim1).build();

        org.tensorflow.framework.DataType dt = DataType.DT_STRING;
        TensorProto featuresTensorProto = featuresTensorBuilder
                .addStringVal(com.google.protobuf.ByteString.copyFrom(bytes))
                .setTensorShape(featuresShape).setDtype(dt).build();
        Predict.PredictRequest request = Predict.PredictRequest.newBuilder()
                .setModelSpec(modelSpec).putInputs("images", featuresTensorProto).build();

        try {
            Predict.PredictResponse response = blockingStub
                    .withDeadlineAfter(10, TimeUnit.SECONDS)
                    .predict(request);

            System.out.println(response);
        } catch (StatusRuntimeException e) {
            e.printStackTrace();
        }
        return;
    }
}
