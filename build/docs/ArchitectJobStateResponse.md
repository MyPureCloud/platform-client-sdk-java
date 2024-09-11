# ArchitectJobStateResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **flow** | [**AddressableEntityRef**](AddressableEntityRef) | Flow created from the Architect Job |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the Architect Job |  [optional] |
| **command** | [**CommandEnum**](#Enum--CommandEnum) | The command executed by the Architect Job |  [optional] |
| **messages** | [**List&lt;ArchitectJobMessage&gt;**](ArchitectJobMessage) | Warnings and Errors messages of the Architect Job |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REGISTERED | &quot;Registered&quot; | 
| STARTED | &quot;Started&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 


## Enum: CommandEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLISH | &quot;Publish&quot; | 
| CREATE | &quot;Create&quot; | 
| UPDATE | &quot;Update&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
