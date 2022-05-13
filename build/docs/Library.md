---
title: Library
---
## Library


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The library name. |  |
| **version** | <!----><!---->**Integer**<!----> | Current version for this resource. |  [optional] |
| **createdBy** | <!----><!---->[**User**](User.html)<!----> | User that created the library. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date and time the response was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **responseType** | [**ResponseTypeEnum**](#ResponseTypeEnum)<!----> | This value is deprecated. Responses representing message templates may be added to any library. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ResponseTypeEnum"></a>

## Enum: ResponseTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MESSAGINGTEMPLATE | &quot;MessagingTemplate&quot; | 
| CAMPAIGNSMSTEMPLATE | &quot;CampaignSmsTemplate&quot; | 
| CAMPAIGNEMAILTEMPLATE | &quot;CampaignEmailTemplate&quot; | 
{: class="table table-striped"}



