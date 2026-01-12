# PatchPredictorRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **routingTimeoutSeconds** | **Integer** | Number of seconds allocated to predictive routing before attempting a different routing method. This is a value between 12 and 900 seconds. |  [optional] |
| **schedule** | [**PredictorSchedule**](PredictorSchedule) | The predictor schedule that determines when the predictor is used for routing interactions. |  [optional] |
| **workloadBalancingConfig** | [**PredictorWorkloadBalancing**](PredictorWorkloadBalancing) | The predictor balancing configuration to enable workload balancing |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
