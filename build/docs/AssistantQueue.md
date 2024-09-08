---
title: AssistantQueue
---
## AssistantQueue


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the queue. |  |
| **mediaTypes** | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!----> | List of media Types in which the assistant is activated for this queue. |  |
| **assistant** | <!----><!---->[**Assistant**](Assistant.html)<!----> | Assistant to which the queue is assigned. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date when the assistant queue was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date when the assistant queue was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| CALL | &quot;Call&quot; |
| EMAIL | &quot;Email&quot; |
| MESSAGE | &quot;Message&quot; |
{: class="table table-striped"}



