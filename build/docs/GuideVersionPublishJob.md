# GuideVersionPublishJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the job. |  [optional] |
| **errors** | [**List&lt;ErrorBody&gt;**](ErrorBody) | The list of errors in case of job failure. |  [optional] |
| **guide** | [**AddressableEntityRef**](AddressableEntityRef) |  |  [optional] |
| **guideVersion** | [**GuideVersion**](GuideVersion) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
