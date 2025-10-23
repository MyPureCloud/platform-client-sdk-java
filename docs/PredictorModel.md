# PredictorModel


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **kpi** | **String** | The key performance indicator used in the model. |  [optional] |
| **queues** | [**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef) | The List of Queues that are assessed for Predictive Routing. |  [optional] |
| **dateCreated** | [**Date**](Date) | DateTime indicating when the model was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateTrained** | [**Date**](Date) | DateTime indicating when the model was last trained. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type of the model. |  [optional] |
| **features** | [**List&lt;PredictorModelFeature&gt;**](PredictorModelFeature) |  |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;voice&quot; | 
| EMAIL | &quot;email&quot; | 
| MESSAGE | &quot;message&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
