# TestTopicPhraseJobs


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) |  |  [optional] |
| **createdBy** | [**AddressableEntityRef**](AddressableEntityRef) |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **action** | **String** |  |  [optional] |
| **entityType** | [**EntityTypeEnum**](#Enum--EntityTypeEnum) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNNING | &quot;Running&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 


## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TOPIC | &quot;TOPIC&quot; | 
| PROGRAM | &quot;PROGRAM&quot; | 
| PROGRAM_TOPIC_LINK | &quot;PROGRAM_TOPIC_LINK&quot; | 
| TOPIC_PHRASE | &quot;TOPIC_PHRASE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
