# TtsVoiceEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **displayName** | **String** | The display name of the TTS voice |  [optional] |
| **gender** | **String** | The gender of the TTS voice |  |
| **voiceType** | [**VoiceTypeEnum**](#Enum--VoiceTypeEnum) | The type of the TTS voice |  [optional] |
| **language** | **String** | The language supported by the TTS voice |  |
| **engine** | [**TtsEngineEntity**](TtsEngineEntity) | Ths TTS engine this voice belongs to |  |
| **isDefault** | **Boolean** | The voice is the default voice for its language |  [optional] |
| **supportedModels** | **List&lt;String&gt;** | The models supported by the TTS voice |  [optional] |
| **provider** | **String** | The provider of the TTS voice |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: VoiceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STANDARD | &quot;Standard&quot; | 
| NEURAL | &quot;Neural&quot; | 
| WAVENET | &quot;Wavenet&quot; | 
| GENERATIVE | &quot;Generative&quot; | 
| CHIRP3 | &quot;Chirp3&quot; | 
| GEMINI | &quot;Gemini&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:264.0.0_
