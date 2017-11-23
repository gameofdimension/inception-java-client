# inception-java-client
java client for tensorflow serving's inception example

# input
![](src/main/resources/plane.jpg)

# output
```
outputs {
  key: "classes"
  value {
    dtype: DT_STRING
    tensor_shape {
      dim {
        size: 1
      }
      dim {
        size: 5
      }
    }
    string_val: "airliner"
    string_val: "wing"
    string_val: "warplane, military plane"
    string_val: "ambulance"
    string_val: "grasshopper, hopper"
  }
}
outputs {
  key: "scores"
  value {
    dtype: DT_FLOAT
    tensor_shape {
      dim {
        size: 1
      }
      dim {
        size: 5
      }
    }
    float_val: 9.509161
    float_val: 6.7006035
    float_val: 2.4520428
    float_val: 2.1905394
    float_val: 2.0213227
  }
}
```
