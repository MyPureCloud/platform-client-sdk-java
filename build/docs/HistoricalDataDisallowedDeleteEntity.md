# HistoricalDataDisallowedDeleteEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **requestId** | **String** | The requestId associated with this disallowed entity |  [optional] |
| **reason** | [**ReasonEnum**](#Enum--ReasonEnum) | The error code explaining why the delete request for the requestId was disallowed |  [optional] |


## Enum: ReasonEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INVALIDREQUEST | &quot;InvalidRequest&quot; | 
| VALIDATIONINPROGRESS | &quot;ValidationInProgress&quot; | 
| DELETEINPROGRESS | &quot;DeleteInProgress&quot; | 
| REQUESTIDNOTFOUND | &quot;RequestIdNotFound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
