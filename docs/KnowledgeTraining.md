# KnowledgeTraining


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **dateTriggered** | [**Date**](Date) | Trigger date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | [**Date**](Date) | Training completed date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Training status. |  [optional] |
| **languageCode** | **String** | Language of the documents that are trained. |  [optional] |
| **knowledgeBase** | [**KnowledgeBase**](KnowledgeBase) | Knowledge Base that the training belongs to. |  [optional] |
| **errorMessage** | **String** | Any error message during the Training or Promote action. |  [optional] |
| **knowledgeDocumentsState** | [**KnowledgeDocumentsStateEnum**](#Enum--KnowledgeDocumentsStateEnum) | State of the Trained Documents, which can be one of these Draft, Active, Discarded, Archived. |  [optional] |
| **datePromoted** | [**Date**](Date) | Trained Documents Promoted date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUED | &quot;Queued&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 


## Enum: KnowledgeDocumentsStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| ACTIVE | &quot;Active&quot; | 
| DISCARDED | &quot;Discarded&quot; | 
| ARCHIVED | &quot;Archived&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
