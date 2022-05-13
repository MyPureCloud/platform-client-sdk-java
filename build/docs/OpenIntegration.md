---
title: OpenIntegration
---
## OpenIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | A unique Integration Id. |  |
| **name** | <!----><!---->**String**<!----> | The name of the Open messaging integration. |  |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.html)<!----> | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | <!----><!---->[**MessagingSettingReference**](MessagingSettingReference.html)<!----> |  |  [optional] |
| **outboundNotificationWebhookUrl** | <!----><!---->**String**<!----> | The outbound notification webhook URL for the Open messaging integration. |  |
| **outboundNotificationWebhookSignatureSecretToken** | <!----><!---->**String**<!----> | The outbound notification webhook signature secret token. |  |
| **webhookHeaders** | <!----><!---->**Map&lt;String, String&gt;**<!----> | The user specified headers for the Open messaging integration. |  [optional] |
| **status** | <!----><!---->**String**<!----> | The status of the Open Integration |  [optional] |
| **recipient** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The recipient associated to the Open messaging Integration. This recipient is used to associate a flow to an integration |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date this Integration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User reference that created this Integration |  [optional] |
| **modifiedBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User reference that last modified this Integration |  [optional] |
| **createStatus** | [**CreateStatusEnum**](#CreateStatusEnum)<!----> | Status of asynchronous create operation |  [optional] |
| **createError** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Error information returned, if createStatus is set to Error |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="CreateStatusEnum"></a>

## Enum: CreateStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INITIATED | &quot;Initiated&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



