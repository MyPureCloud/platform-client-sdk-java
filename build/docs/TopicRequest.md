# TopicRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The topic name |  |
| **description** | **String** | The topic description |  [optional] |
| **strictness** | [**StrictnessEnum**](#Enum--StrictnessEnum) | The topic strictness, default value is 72 |  [optional] |
| **programIds** | **List&lt;String&gt;** | The ids of programs associated to the topic |  [optional] |
| **tags** | **List&lt;String&gt;** | The topic tags |  [optional] |
| **dialect** | **String** | The topic dialect |  |
| **participants** | [**ParticipantsEnum**](#Enum--ParticipantsEnum) | The topic participants, default value is All |  [optional] |
| **phrases** | [**List&lt;Phrase&gt;**](Phrase) | The topic phrases |  [optional] |


## Enum: StrictnessEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| _1 | &quot;1&quot; | 
| _55 | &quot;55&quot; | 
| _65 | &quot;65&quot; | 
| _72 | &quot;72&quot; | 
| _85 | &quot;85&quot; | 
| _90 | &quot;90&quot; | 


## Enum: ParticipantsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXTERNAL | &quot;External&quot; | 
| INTERNAL | &quot;Internal&quot; | 
| ALL | &quot;All&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
