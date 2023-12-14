---
title: V2FlowExecutionDataFlowidTopicFlowExecutionHistory
---
## V2FlowExecutionDataFlowidTopicFlowExecutionHistory


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **executionId** | <!----><!---->**String**<!----> | The execution identifier which represents this unique instance of the flow that ran. |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> | The Genesys Cloud conversation identifier associated with this flow instance execution data. |  [optional] |
| **divisionId** | <!----><!---->**String**<!----> | The division identifier for the division associated with the flow for this flow instance. |  [optional] |
| **endDateTime** | <!----><!---->[**Date**](Date.html)<!----> | The end date time for this flow instance execution data. |  [optional] |
| **endpoint** | <!----><!---->**String**<!----> | The public endpoint a user can use to retrieve the full historical log from the service. |  [optional] |
| **errors** | <!----><!---->[**List&lt;V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo&gt;**](V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo.html)<!----> | If the flow invoked error handling, an array of errors. |  [optional] |
| **execution** | <!----><!---->[**List&lt;V2FlowExecutionDataFlowidTopicExecution&gt;**](V2FlowExecutionDataFlowidTopicExecution.html)<!----> | An array of execution items that describe what happened when an Architect flow action container ran such as a flow, task, state or bot. |  [optional] |
| **flowExitReason** | <!----><!---->**String**<!----> | Provides information about why a flow ended. |  [optional] |
| **flowId** | <!----><!---->**String**<!----> | The flow identifier for this flow instance execution data.  This is the identifier of the flow configuration that users load up in Architect. |  [optional] |
| **flowIsDebug** | <!----><!---->**Boolean**<!----> | Whether the flow that ran for this flow instance execution data was in debug mode. |  [optional] |
| **executionItemsTruncated** | <!----><!---->**Boolean**<!----> | If true, the execution items in this event have been truncated to be deliverable. |  [optional] |
| **flowType** | <!----><!---->**String**<!----> | The flow type of the Architect flow that was run. |  [optional] |
| **flowVersion** | <!----><!---->**String**<!----> | The version of the flow for this flow instance execution data. Typically this is a numeric value like 1.0 represented as a string but can also be 'debug' |  [optional] |
| **messageType** | [**MessageTypeEnum**](#MessageTypeEnum)<!----> | If applicable, the type of message platform from which the message originated. |  [optional] |
| **invokingContext** | <!----><!---->[**V2FlowExecutionDataFlowidTopicInvokingContext**](V2FlowExecutionDataFlowidTopicInvokingContext.html)<!----> |  |  [optional] |
| **startDateTime** | <!----><!---->[**Date**](Date.html)<!----> | The start date time for this flow instance execution data. |  [optional] |
| **warnings** | <!----><!---->[**List&lt;V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo&gt;**](V2FlowExecutionDataFlowidTopicFlowErrorWarningInfo.html)<!----> | If the flow encountered a warning during execution, this is an array of the warnings. |  [optional] |
{: class="table table-striped"}


<a name="MessageTypeEnum"></a>

## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| SMS | &quot;sms&quot; | 
| TWITTER | &quot;twitter&quot; | 
| FACEBOOK | &quot;facebook&quot; | 
| INSTAGRAM | &quot;instagram&quot; | 
| LINE | &quot;line&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| WEBMESSAGING | &quot;webmessaging&quot; | 
| OPEN | &quot;open&quot; | 
{: class="table table-striped"}



