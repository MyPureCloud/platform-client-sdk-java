---
title: ActionTemplate
---
## ActionTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | Name of the action template. |  |
| **description** | <!----><!---->**String**<!----> | Description of the action template's functionality. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | Media type of action described by the action template. |  |
| **state** | [**StateEnum**](#StateEnum)<!----> | Whether the action template is currently active, inactive or deleted. |  |
| **contentOffer** | <!----><!---->[**ContentOffer**](ContentOffer.html)<!----> | Properties used to configure an action of type content offer |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | Date when action template was created in ISO-8601 format. |  [optional] |
| **modifiedDate** | <!----><!---->[**Date**](Date.html)<!----> | Date when action template was last modified in ISO-8601 format. |  [optional] |
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


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| DELETED | &quot;Deleted&quot; | 
{: class="table table-striped"}



