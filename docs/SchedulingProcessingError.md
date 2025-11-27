# SchedulingProcessingError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **internalErrorCode** | [**InternalErrorCodeEnum**](#Enum--InternalErrorCodeEnum) | An internal code representing the type of error. BadJson for 'Unable to parse json.' NotFound for 'Resource not found.' Fail for 'An unexpected server error occured.' |  [optional] |
| **description** | **String** | A text description of the error |  [optional] |


## Enum: InternalErrorCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BADJSON | &quot;BadJson&quot; | 
| NOTFOUND | &quot;NotFound&quot; | 
| FAIL | &quot;Fail&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
