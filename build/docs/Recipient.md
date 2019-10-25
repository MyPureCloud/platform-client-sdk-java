---
title: Recipient
---
## Recipient


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **flow** | <!----><!---->[**Flow**](Flow.html)<!----> | An automate flow object which defines the set of actions to be taken, when a message is received by this provisioned phone number. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date this recipient was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date this recipient was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **createdBy** | <!----><!---->[**User**](User.html)<!----> | User that created this recipient |  [optional] |
| **modifiedBy** | <!----><!---->[**User**](User.html)<!----> | User that modified this recipient |  [optional] |
| **messengerType** | [**MessengerTypeEnum**](#MessengerTypeEnum)<!----> | The messenger type for this recipient |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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
{: class="table table-striped"}



