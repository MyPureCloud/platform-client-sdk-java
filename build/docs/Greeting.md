# Greeting


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Greeting type |  |
| **ownerType** | [**OwnerTypeEnum**](#Enum--OwnerTypeEnum) | Greeting owner type |  |
| **owner** | [**DomainEntity**](DomainEntity) | Greeting owner |  |
| **audioFile** | [**GreetingAudioFile**](GreetingAudioFile) |  |  [optional] |
| **audioTTS** | **String** |  |  [optional] |
| **createdDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | **String** |  |  [optional] |
| **modifiedDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STATION | &quot;STATION&quot; | 
| VOICEMAIL | &quot;VOICEMAIL&quot; | 
| NAME | &quot;NAME&quot; | 


## Enum: OwnerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| ORGANIZATION | &quot;ORGANIZATION&quot; | 
| GROUP | &quot;GROUP&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
