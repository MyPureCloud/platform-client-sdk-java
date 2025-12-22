# DecisionTableExecutionRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **inputs** | **Map&lt;String, Object&gt;** | The JSON input data for executing the decision table. Must be valid according to the execution input contract defined on the table. In the case of enum decision table columns the enum options key should be provided as the value, not the enum options label as this can be changed. For business rules queue columns both “queue” and “id” keys will be required regardless of the queue attribute key and these do not change. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
