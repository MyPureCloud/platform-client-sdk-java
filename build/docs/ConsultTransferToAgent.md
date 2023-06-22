---
title: ConsultTransferToAgent
---
## ConsultTransferToAgent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **speakTo** | [**SpeakToEnum**](#SpeakToEnum)<!----> | Determines to whom the initiating participant is speaking. Defaults to DESTINATION |  |
| **consultingUserId** | <!----><!---->**String**<!----> | The user ID of the person who wants to talk before completing the transfer. Could be the same of the context user ID |  [optional] |
| **userId** | <!----><!---->**String**<!----> | The id of the internal user. |  [optional] |
| **userDisplayName** | <!----><!---->**String**<!----> | The name of the internal user. |  [optional] |
{: class="table table-striped"}


<a name="SpeakToEnum"></a>

## Enum: SpeakToEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DESTINATION | &quot;DESTINATION&quot; | 
| OBJECT | &quot;OBJECT&quot; | 
| BOTH | &quot;BOTH&quot; | 
| CONFERENCE | &quot;CONFERENCE&quot; | 
{: class="table table-striped"}



