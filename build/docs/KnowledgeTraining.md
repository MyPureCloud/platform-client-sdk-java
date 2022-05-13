---
title: KnowledgeTraining
---
## KnowledgeTraining


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **dateTriggered** | <!----><!---->[**Date**](Date.html)<!----> | Trigger date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | <!----><!---->[**Date**](Date.html)<!----> | Training completed date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Training status. |  [optional] |
| **languageCode** | <!----><!---->**String**<!----> | Language of the documents that are trained. |  [optional] |
| **knowledgeBase** | <!----><!---->[**KnowledgeBase**](KnowledgeBase.html)<!----> | Knowledge Base that the training belongs to. |  [optional] |
| **errorMessage** | <!----><!---->**String**<!----> | Any error message during the Training or Promote action. |  [optional] |
| **knowledgeDocumentsState** | [**KnowledgeDocumentsStateEnum**](#KnowledgeDocumentsStateEnum)<!----> | State of the Trained Documents, which can be one of these Draft, Active, Discarded, Archived. |  [optional] |
| **datePromoted** | <!----><!---->[**Date**](Date.html)<!----> | Trained Documents Promoted date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUED | &quot;Queued&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}


<a name="KnowledgeDocumentsStateEnum"></a>

## Enum: KnowledgeDocumentsStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| ACTIVE | &quot;Active&quot; | 
| DISCARDED | &quot;Discarded&quot; | 
| ARCHIVED | &quot;Archived&quot; | 
{: class="table table-striped"}



