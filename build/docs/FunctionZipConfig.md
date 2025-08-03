# FunctionZipConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of zip upload. |  [optional] |
| **id** | **String** | Zip file Identifier |  [optional] |
| **name** | **String** | Zip file name |  [optional] |
| **dateCreated** | [**Date**](Date) | Date and time zip record was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **errorMessage** | **String** | Error message if upload failed. |  [optional] |
| **requestId** | **String** | Upload request id used for zip upload |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| TRANSFERRING | &quot;Transferring&quot; | 
| AVAILABLE | &quot;Available&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| INVALID | &quot;Invalid&quot; | 
| INVALIDFORMAT | &quot;InvalidFormat&quot; | 
| INVALIDFILE | &quot;InvalidFile&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
