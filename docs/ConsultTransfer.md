# ConsultTransfer


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **speakTo** | [**SpeakToEnum**](#Enum--SpeakToEnum) | Determines to whom the initiating participant is requesting to speak. Defaults to DESTINATION |  |
| **consultingUserId** | **String** | The user ID of the person who wants to talk before completing the transfer. Could be the same of the context user ID |  [optional] |
| **destination** | [**Destination**](Destination) | Destination. Specify one and only one parameter from the list below. |  |


## Enum: SpeakToEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DESTINATION | &quot;DESTINATION&quot; | 
| OBJECT | &quot;OBJECT&quot; | 
| BOTH | &quot;BOTH&quot; | 
| CONFERENCE | &quot;CONFERENCE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
