---
title: ReportingTurn
---
## ReportingTurn


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userInput** | <!----><!---->**String**<!----> | The chosen user input associated with this reporting turn. |  [optional] |
| **botPrompts** | <!----><!---->**List&lt;String&gt;**<!----> | The bot prompts associated with this reporting turn. |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> | The bot session ID that this reporting turn is grouped under. |  [optional] |
| **askAction** | <!----><!---->[**ReportingTurnAction**](ReportingTurnAction.html)<!----> | The bot flow 'ask' action associated with this reporting turn (e.g. AskForIntent). |  [optional] |
| **intent** | <!----><!---->[**ReportingTurnIntent**](ReportingTurnIntent.html)<!----> | The intent and associated slots detected during this reporting turn. |  [optional] |
| **knowledge** | <!----><!---->[**ReportingTurnKnowledge**](ReportingTurnKnowledge.html)<!----> | The knowledge data captured during this reporting turn. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp indicating when the original turn was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **askActionResult** | [**AskActionResultEnum**](#AskActionResultEnum)<!----> | Result of the bot flow 'ask' action. |  [optional] |
| **sessionEndDetails** | <!----><!---->[**SessionEndDetails**](SessionEndDetails.html)<!----> | The details related to end of bot flow session. |  [optional] |
| **conversation** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The conversation details, across potentially multiple Bot Flow sessions. |  [optional] |
{: class="table table-striped"}


<a name="AskActionResultEnum"></a>

## Enum: AskActionResultEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESSCOLLECTION | &quot;SuccessCollection&quot; | 
| SUCCESSCONFIRMATIONYES | &quot;SuccessConfirmationYes&quot; | 
| SUCCESSCONFIRMATIONNO | &quot;SuccessConfirmationNo&quot; | 
| NOMATCHCOLLECTION | &quot;NoMatchCollection&quot; | 
| NOMATCHCONFIRMATION | &quot;NoMatchConfirmation&quot; | 
| AGENTREQUESTEDBYUSER | &quot;AgentRequestedByUser&quot; | 
| CONFIRMATIONREQUIRED | &quot;ConfirmationRequired&quot; | 
| ERROR | &quot;Error&quot; | 
| EXPRESSIONERROR | &quot;ExpressionError&quot; | 
| NOINPUTCOLLECTION | &quot;NoInputCollection&quot; | 
| NOINPUTCONFIRMATION | &quot;NoInputConfirmation&quot; | 
| DISAMBIGUATIONREQUIRED | &quot;DisambiguationRequired&quot; | 
| SUCCESSDISAMBIGUATION | &quot;SuccessDisambiguation&quot; | 
| SUCCESSDISAMBIGUATIONNONE | &quot;SuccessDisambiguationNone&quot; | 
| NOMATCHDISAMBIGUATION | &quot;NoMatchDisambiguation&quot; | 
| NOINPUTDISAMBIGUATION | &quot;NoInputDisambiguation&quot; | 
{: class="table table-striped"}



