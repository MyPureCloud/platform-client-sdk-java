# CommandStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **expiration** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **userId** | **String** |  |  [optional] |
| **statusCode** | [**StatusCodeEnum**](#Enum--StatusCodeEnum) |  |  [optional] |
| **commandType** | [**CommandTypeEnum**](#Enum--CommandTypeEnum) |  |  [optional] |
| **document** | [**Document**](Document) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;INPROGRESS&quot; | 
| COMPLETE | &quot;COMPLETE&quot; | 
| ERROR | &quot;ERROR&quot; | 
| CANCELING | &quot;CANCELING&quot; | 
| CANCELED | &quot;CANCELED&quot; | 


## Enum: CommandTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPLOAD | &quot;UPLOAD&quot; | 
| COPYDOCUMENT | &quot;COPYDOCUMENT&quot; | 
| MOVEDOCUMENT | &quot;MOVEDOCUMENT&quot; | 
| DELETEWORKSPACE | &quot;DELETEWORKSPACE&quot; | 
| DELETEDOCUMENT | &quot;DELETEDOCUMENT&quot; | 
| DELETETAG | &quot;DELETETAG&quot; | 
| UPDATETAG | &quot;UPDATETAG&quot; | 
| REINDEX | &quot;REINDEX&quot; | 
| CLEANUP | &quot;CLEANUP&quot; | 
| REPLACEDOCUMENT | &quot;REPLACEDOCUMENT&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
