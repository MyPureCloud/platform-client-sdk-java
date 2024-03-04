---
title: DialogflowCXAgent
---
## DialogflowCXAgent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **project** | <!----><!---->[**DialogflowCXProject**](DialogflowCXProject.html)<!----> | The project this Dialogflow CX agent belongs to. |  [optional] |
| **languages** | <!----><!---->**List&lt;String&gt;**<!----> | The supported languages of the Dialogflow CX agent.  Each value will be a language code in the country-locale format. e.g. en-us, es-us, fr-ca, etc. |  [optional] |
| **environments** | <!----><!---->[**List&lt;DialogflowCXEnvironment&gt;**](DialogflowCXEnvironment.html)<!----> | Available environments for this CX agent. |  [optional] |
| **integration** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The Integration this Dialogflow CX agent was referenced from. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



