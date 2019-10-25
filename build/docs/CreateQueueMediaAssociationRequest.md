---
title: CreateQueueMediaAssociationRequest
---
## CreateQueueMediaAssociationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **queue** | <!----><!---->[**QueueReference**](QueueReference.html)<!----> | The queue to associate with the service goal group |  [optional] |
| **mediaTypes** | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!----> | The media types of the given queue to associate with the service goal group |  [optional] |
{: class="table table-striped"}


<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| VOICE | &quot;Voice&quot; |
| CHAT | &quot;Chat&quot; |
| EMAIL | &quot;Email&quot; |
| CALLBACK | &quot;Callback&quot; |
| MESSAGE | &quot;Message&quot; |
{: class="table table-striped"}



