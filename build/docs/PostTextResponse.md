---
title: PostTextResponse
---
## PostTextResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **botState** | [**BotStateEnum**](#BotStateEnum)<!----> | The state of the bot after completion of the request |  |
| **replyMessages** | <!----><!---->[**List&lt;PostTextMessage&gt;**](PostTextMessage.html)<!----> | The list of messages to respond with, if any |  [optional] |
| **intentName** | <!----><!---->**String**<!----> | The name of the intent the bot is either processing or has processed, this will be blank if no intent could be detected. |  [optional] |
| **slots** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Data parameters detected and filled by the bot. |  [optional] |
| **botCorrelationId** | <!----><!---->**String**<!----> | The optional ID specified in the request |  [optional] |
| **amazonLex** | <!----><!---->**Map&lt;String, Object&gt;**<!----> | Raw data response from AWS (if called) |  [optional] |
| **googleDialogFlow** | <!----><!---->**Map&lt;String, Object&gt;**<!----> | Raw data response from Google Dialogflow (if called) |  [optional] |
| **genesysDialogEngine** | <!----><!---->**Map&lt;String, Object&gt;**<!----> | Raw data response from Genesys' Dialogengine (if called) |  [optional] |
| **genesysBotConnector** | <!----><!---->**Map&lt;String, Object&gt;**<!----> | Raw data response from Genesys' BotConnector (if called) |  [optional] |
| **nuanceMixDlg** | <!----><!---->**Map&lt;String, Object&gt;**<!----> | Raw data response from Nuance Mix Dlg (if called) |  [optional] |
{: class="table table-striped"}


<a name="BotStateEnum"></a>

## Enum: BotStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
| MOREDATA | &quot;MoreData&quot; | 
{: class="table table-striped"}



