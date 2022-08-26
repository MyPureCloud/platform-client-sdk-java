---
title: DialogflowAgent
---
## DialogflowAgent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **project** | <!----><!---->[**DialogflowProject**](DialogflowProject.html)<!----> | The project this Dialogflow agent belongs to |  [optional] |
| **languages** | <!----><!---->**List&lt;String&gt;**<!----> | The supported languages of the Dialogflow agent |  [optional] |
| **intents** | <!----><!---->[**List&lt;DialogflowIntent&gt;**](DialogflowIntent.html)<!----> | An array of Intents associated with this agent |  [optional] |
| **environments** | <!----><!---->**List&lt;String&gt;**<!----> | Available environments for this agent |  [optional] |
| **integration** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The Integration this Dialogflow agent was referenced from. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



