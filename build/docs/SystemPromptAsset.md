# SystemPromptAsset


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **promptId** | **String** |  |  [optional] |
| **language** | **String** | The asset resource language |  |
| **durationSeconds** | **Double** |  |  [optional] |
| **mediaUri** | **String** |  |  [optional] |
| **ttsString** | **String** |  |  [optional] |
| **text** | **String** |  |  [optional] |
| **uploadUri** | **String** | Deprecated. This was use for uploading the resource audio. |  [optional] |
| **uploadStatus** | [**UploadStatusEnum**](#Enum--UploadStatusEnum) |  |  [optional] |
| **hasDefault** | **Boolean** |  |  [optional] |
| **languageDefault** | **Boolean** |  |  [optional] |
| **tags** | [**Map&lt;String, List&lt;String&gt;&gt;**](List) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: UploadStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;created&quot; | 
| UPLOADED | &quot;uploaded&quot; | 
| TRANSCODED | &quot;transcoded&quot; | 
| TRANSCODEFAILED | &quot;transcodeFailed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
