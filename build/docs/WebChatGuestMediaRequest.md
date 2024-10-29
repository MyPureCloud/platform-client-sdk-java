# WebChatGuestMediaRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **types** | [**List<TypesEnum>**](#Enum--TypesEnum) | The types of media being requested. |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the media request, one of PENDING|ACCEPTED|DECLINED|TIMEDOUT|CANCELLED|ERRORED. |  |
| **communicationId** | **String** | The ID of the new media communication, if applicable. |  [optional] |
| **securityKey** | **String** | The security information related to a media request. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypesEnum

| Name | Value |
| ---- | ----- |
| COBROWSE | &quot;COBROWSE&quot; |
| SCREENSHARE | &quot;SCREENSHARE&quot; |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| ACCEPTED | &quot;ACCEPTED&quot; | 
| DECLINED | &quot;DECLINED&quot; | 
| TIMEDOUT | &quot;TIMEDOUT&quot; | 
| CANCELLED | &quot;CANCELLED&quot; | 
| ERRORED | &quot;ERRORED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:213.0.0_
