# IpAddressRange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **cidr** | **String** |  |  [optional] |
| **service** | [**ServiceEnum**](#Enum--ServiceEnum) |  |  [optional] |
| **region** | **String** |  |  [optional] |
| **direction** | [**DirectionEnum**](#Enum--DirectionEnum) | The direction of traffic for the IP range from the perspective of Genesys Cloud (e.g. inbound to Genesys; outbound from Genesys) |  [optional] |


## Enum: ServiceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| API | &quot;api&quot; | 
| DATA_ACTIONS | &quot;data-actions&quot; | 
| SMTP | &quot;smtp&quot; | 
| IMAP | &quot;imap&quot; | 
| GRAPHAPI | &quot;graphapi&quot; | 
| AUDIOHOOK | &quot;audiohook&quot; | 
| OPEN_MESSAGING | &quot;open-messaging&quot; | 
| TTS_CONNECTOR | &quot;tts-connector&quot; | 
| AUDIO_CONNECTOR | &quot;audio-connector&quot; | 
| BYOT_STT | &quot;byot-stt&quot; | 
| BOT_CONNECTOR | &quot;bot-connector&quot; | 
| BYO_SMPP | &quot;byo-smpp&quot; | 
| ENCRYPTION | &quot;encryption&quot; | 


## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 
| BOTH | &quot;both&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
