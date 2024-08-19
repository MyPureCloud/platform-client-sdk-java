# LexBotAlias


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **bot** | [**LexBot**](LexBot) | The Lex bot this is an alias for |  [optional] |
| **botVersion** | **String** | The version of the Lex bot this alias points at |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the Lex bot alias |  |
| **failureReason** | **String** | If the status is FAILED, Amazon Lex explains why it failed to build the bot |  [optional] |
| **language** | [**LanguageEnum**](#Enum--LanguageEnum) | The target language of the Lex bot |  [optional] |
| **intents** | [**List&lt;LexIntent&gt;**](LexIntent) | An array of Intents associated with this bot alias |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BUILDING | &quot;BUILDING&quot; | 
| READY | &quot;READY&quot; | 
| FAILED | &quot;FAILED&quot; | 
| NOT_BUILT | &quot;NOT_BUILT&quot; | 
{: class="table table-striped"}


## Enum: LanguageEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EN_US | &quot;en-US&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
