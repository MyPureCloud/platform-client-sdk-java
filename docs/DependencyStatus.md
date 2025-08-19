# DependencyStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **user** | [**User**](User) | User that initiated the build. |  [optional] |
| **client** | [**DomainEntityRef**](DomainEntityRef) | OAuth client that initiated the build. |  [optional] |
| **buildId** | **String** |  |  [optional] |
| **dateStarted** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **failedObjects** | [**List&lt;FailedObject&gt;**](FailedObject) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BUILDINCOMPLETE | &quot;BUILDINCOMPLETE&quot; | 
| BUILDINITIALIZING | &quot;BUILDINITIALIZING&quot; | 
| BUILDINPROGRESS | &quot;BUILDINPROGRESS&quot; | 
| NOTBUILT | &quot;NOTBUILT&quot; | 
| OPERATIONAL | &quot;OPERATIONAL&quot; | 
| OPERATIONALNEEDSREBUILD | &quot;OPERATIONALNEEDSREBUILD&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
