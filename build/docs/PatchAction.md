---
title: PatchAction
---
## PatchAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | Media type of action. |  |
| **actionTemplate** | <!----><!---->[**ActionMapActionTemplate**](ActionMapActionTemplate.html)<!----> | Action template associated with the action map. |  [optional] |
| **actionTargetId** | <!----><!---->**String**<!----> | Action target ID. |  [optional] |
| **isPacingEnabled** | <!----><!---->**Boolean**<!----> | Whether this action should be throttled. |  [optional] |
| **props** | <!----><!---->[**PatchActionProperties**](PatchActionProperties.html)<!----> | Additional properties. |  [optional] |
| **architectFlowFields** | <!----><!---->[**ArchitectFlowFields**](ArchitectFlowFields.html)<!----> | Architect Flow Id and input contract. |  [optional] |
| **webMessagingOfferFields** | <!----><!---->[**PatchWebMessagingOfferFields**](PatchWebMessagingOfferFields.html)<!----> | Admin-configurable fields of a web messaging offer action. |  [optional] |
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



