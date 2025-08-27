# LexV2BotAlias


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **region** | **String** | The Lex V2 bot region |  |
| **aliasId** | **String** | The Lex V2 bot alias Id |  |
| **bot** | [**LexV2Bot**](LexV2Bot) | The Lex V2 bot this is an alias for |  [optional] |
| **botVersion** | **String** | The version of the Lex V2 bot this alias points at |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the Lex V2 bot alias |  [optional] |
| **language** | **String** | The target language of the Lex V2 bot |  [optional] |
| **intents** | [**List&lt;LexV2Intent&gt;**](LexV2Intent) | An array of Intents associated with this bot alias |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATING | &quot;Creating&quot; | 
| AVAILABLE | &quot;Available&quot; | 
| DELETING | &quot;Deleting&quot; | 
| FAILED | &quot;Failed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
