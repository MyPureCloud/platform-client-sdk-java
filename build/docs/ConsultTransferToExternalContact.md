# ConsultTransferToExternalContact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **speakTo** | [**SpeakToEnum**](#Enum--SpeakToEnum) | Determines to whom the initiating participant is requesting to speak. Defaults to DESTINATION |  |
| **consultingUserId** | **String** | The user ID of the person who wants to talk before completing the transfer. Could be the same of the context user ID |  [optional] |
| **contactId** | **String** | The external contact id. |  |
| **phoneType** | [**PhoneTypeEnum**](#Enum--PhoneTypeEnum) | The external contact phone type. |  |


## Enum: SpeakToEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DESTINATION | &quot;DESTINATION&quot; | 
| OBJECT | &quot;OBJECT&quot; | 
| BOTH | &quot;BOTH&quot; | 
| CONFERENCE | &quot;CONFERENCE&quot; | 


## Enum: PhoneTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WORKPHONE | &quot;WorkPhone&quot; | 
| CELLPHONE | &quot;CellPhone&quot; | 
| HOMEPHONE | &quot;HomePhone&quot; | 
| OTHERPHONE | &quot;OtherPhone&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
