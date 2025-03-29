# PredictorModelRetrainingError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **errorCode** | [**ErrorCodeEnum**](#Enum--ErrorCodeEnum) | Error code describing model training failure. |  |
| **dateOfFirstOccurrence** | [**Date**](Date) | Date when the first retraining failure happened. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |


## Enum: ErrorCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOTENOUGHDATA | &quot;NotEnoughData&quot; | 
| SERVICEERROR | &quot;ServiceError&quot; | 
| UNKNOWNERROR | &quot;UnknownError&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
