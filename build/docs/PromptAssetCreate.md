# PromptAssetCreate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **promptId** | **String** | Associated prompt ID |  [optional] |
| **language** | **String** | The prompt language. |  |
| **mediaUri** | **String** | URI of the resource audio |  [optional] |
| **ttsString** | **String** | Text to speech of the resource |  [optional] |
| **text** | **String** | Text of the resource |  [optional] |
| **uploadStatus** | [**UploadStatusEnum**](#Enum--UploadStatusEnum) | Audio upload status |  [optional] |
| **uploadUri** | **String** | Deprecated. This was use for uploading the resource audio. |  [optional] |
| **languageDefault** | **Boolean** | Whether or not this resource locale is the default for the language |  [optional] |
| **tags** | [**Map&lt;String, List&lt;String&gt;&gt;**](List) |  |  [optional] |
| **durationSeconds** | **Double** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: UploadStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;created&quot; | 
| UPLOADED | &quot;uploaded&quot; | 
| TRANSCODED | &quot;transcoded&quot; | 
| TRANSCODEFAILED | &quot;transcodeFailed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
