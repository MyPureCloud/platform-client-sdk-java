---
title: ActionMapAction
---
## ActionMapAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **actionTemplate** | <!----><!---->[**ActionMapActionTemplate**](ActionMapActionTemplate.html)<!----> | Action template associated with the action map. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | Media type of action. |  [optional] |
| **actionTargetId** | <!----><!---->**String**<!----> | Action target ID. |  [optional] |
| **isPacingEnabled** | <!----><!---->**Boolean**<!----> | Whether this action should be throttled. |  [optional] |
| **props** | <!----><!---->[**ActionProperties**](ActionProperties.html)<!----> | Additional properties. |  [optional] |
| **architectFlowFields** | <!----><!---->[**ArchitectFlowFields**](ArchitectFlowFields.html)<!----> | Architect Flow Id and input contract. |  [optional] |
| **webMessagingOfferFields** | <!----><!---->[**WebMessagingOfferFields**](WebMessagingOfferFields.html)<!----> | Admin-configurable fields of a web messaging offer action. |  [optional] |
| **openActionFields** | <!----><!---->[**OpenActionFields**](OpenActionFields.html)<!----> | Admin-configurable fields of an open action. |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEBCHAT | &quot;webchat&quot; | 
| WEBMESSAGINGOFFER | &quot;webMessagingOffer&quot; | 
| CONTENTOFFER | &quot;contentOffer&quot; | 
| INTEGRATIONACTION | &quot;integrationAction&quot; | 
| ARCHITECTFLOW | &quot;architectFlow&quot; | 
| OPENACTION | &quot;openAction&quot; | 
{: class="table table-striped"}



