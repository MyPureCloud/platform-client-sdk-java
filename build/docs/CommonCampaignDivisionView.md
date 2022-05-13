---
title: CommonCampaignDivisionView
---
## CommonCampaignDivisionView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the Campaign. |  [optional] |
| **division** | <!----><!---->[**Division**](Division.html)<!----> | The division to which this entity belongs. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | The media type used for this campaign. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;email&quot; | 
| SMS | &quot;sms&quot; | 
| VOICE | &quot;voice&quot; | 
{: class="table table-striped"}



