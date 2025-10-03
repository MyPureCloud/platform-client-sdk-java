# PredictorModelBrief


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type of the model. |  [optional] |
| **dateModified** | [**Date**](Date) | The date the model was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **retrainingErrors** | [**List&lt;PredictorModelRetrainingError&gt;**](PredictorModelRetrainingError) | The model's retraining errors. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the model |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;voice&quot; | 
| EMAIL | &quot;email&quot; | 
| MESSAGE | &quot;message&quot; | 


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRAINED | &quot;Trained&quot; | 
| ERROR | &quot;Error&quot; | 
| INVALIDDATASET | &quot;InvalidDataset&quot; | 
| INACTIVE | &quot;Inactive&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
