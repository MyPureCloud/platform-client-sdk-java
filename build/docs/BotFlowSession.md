---
title: BotFlowSession
---
## BotFlowSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the bot session. |  [optional] |
| **flow** | <!----><!---->[**Entity**](Entity.html)<!----> | The flow associated to this bot session. |  [optional] |
| **channel** | <!----><!---->[**BotChannel**](BotChannel.html)<!----> | Channel-specific information that describes the message channel/provider. |  [optional] |
| **language** | <!----><!---->**String**<!----> | The initial language of operation for the session. |  [optional] |
| **endLanguage** | <!----><!---->**String**<!----> | The language of the session at the time the session ended |  [optional] |
| **botResult** | [**BotResultEnum**](#BotResultEnum)<!----> | The reason for session termination. |  [optional] |
| **botResultCategory** | [**BotResultCategoryEnum**](#BotResultCategoryEnum)<!----> | The category of result for the session. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp indicating when the session was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversation** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The conversation details, across potentially multiple Bot Flow sessions. |  [optional] |
{: class="table table-striped"}


<a name="BotResultEnum"></a>

## Enum: BotResultEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| EXITREQUESTEDBYUSER | &quot;ExitRequestedByUser&quot; | 
| EXITREQUESTEDBYBOT | &quot;ExitRequestedByBot&quot; | 
| EXITERROR | &quot;ExitError&quot; | 
| EXITRECOGNITIONFAILURE | &quot;ExitRecognitionFailure&quot; | 
| DISCONNECTREQUESTEDBYUSER | &quot;DisconnectRequestedByUser&quot; | 
| DISCONNECTREQUESTEDBYBOT | &quot;DisconnectRequestedByBot&quot; | 
| DISCONNECTSESSIONEXPIRED | &quot;DisconnectSessionExpired&quot; | 
| DISCONNECTERROR | &quot;DisconnectError&quot; | 
| DISCONNECTRECOGNITIONFAILURE | &quot;DisconnectRecognitionFailure&quot; | 
| TRANSFERTOACD | &quot;TransferToACD&quot; | 
{: class="table table-striped"}


<a name="BotResultCategoryEnum"></a>

## Enum: BotResultCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| USEREXIT | &quot;UserExit&quot; | 
| BOTEXIT | &quot;BotExit&quot; | 
| ERROR | &quot;Error&quot; | 
| RECOGNITIONFAILURE | &quot;RecognitionFailure&quot; | 
| USERDISCONNECT | &quot;UserDisconnect&quot; | 
| BOTDISCONNECT | &quot;BotDisconnect&quot; | 
| SESSIONEXPIRED | &quot;SessionExpired&quot; | 
| TRANSFER | &quot;Transfer&quot; | 
{: class="table table-striped"}



