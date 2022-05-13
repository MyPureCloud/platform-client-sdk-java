---
title: MessagingIntegration
---
## MessagingIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | A unique Integration Id |  |
| **name** | <!----><!---->**String**<!----> | The name of the Integration |  |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.html)<!----> | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | <!----><!---->[**MessagingSettingReference**](MessagingSettingReference.html)<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the Integration |  [optional] |
| **messengerType** | [**MessengerTypeEnum**](#MessengerTypeEnum)<!----> | The type of Messaging Integration |  |
| **recipient** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The recipient associated to the Integration. This recipient is used to associate a flow to an integration |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date this Integration was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User reference that created this Integration |  [optional] |
| **modifiedBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User reference that last modified this Integration |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Version number required for updates. |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| ERROR | &quot;Error&quot; | 
| STARTING | &quot;Starting&quot; | 
| INCOMPLETE | &quot;Incomplete&quot; | 
| DELETING | &quot;Deleting&quot; | 
| DELETIONFAILED | &quot;DeletionFailed&quot; | 
{: class="table table-striped"}


<a name="MessengerTypeEnum"></a>

## Enum: MessengerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;sms&quot; | 
| FACEBOOK | &quot;facebook&quot; | 
| TWITTER | &quot;twitter&quot; | 
| LINE | &quot;line&quot; | 
| WHATSAPP | &quot;whatsapp&quot; | 
| WEBMESSAGING | &quot;webmessaging&quot; | 
| INSTAGRAM | &quot;instagram&quot; | 
| OPEN | &quot;open&quot; | 
{: class="table table-striped"}



