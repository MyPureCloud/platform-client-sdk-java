# EvaluationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **conversation** | [**ConversationReference**](ConversationReference) |  |  [optional] |
| **evaluationForm** | [**EvaluationFormResponse**](EvaluationFormResponse) | Evaluation form used for evaluation. |  [optional] |
| **evaluator** | [**User**](User) |  |  [optional] |
| **agent** | [**User**](User) |  |  [optional] |
| **calibration** | [**Calibration**](Calibration) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **answers** | [**EvaluationScoringSet**](EvaluationScoringSet) |  |  [optional] |
| **agentHasRead** | **Boolean** |  |  [optional] |
| **assignee** | [**User**](User) |  |  [optional] |
| **assigneeApplicable** | **Boolean** | Indicates whether an assignee is applicable for the evaluation. Set to false when assignee is not applicable. |  [optional] |
| **releaseDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **assignedDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **changedDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **revisionCreatedDate** | [**Date**](Date) | Date of when evaluation revision is created. Null if there is no revision. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **queue** | [**Queue**](Queue) |  |  [optional] |
| **mediaType** | [**List<MediaTypeEnum>**](#Enum--MediaTypeEnum) | List of different communication types used in conversation. |  [optional] |
| **rescore** | **Boolean** | Is only true when evaluation is re-scored. |  [optional] |
| **conversationDate** | [**Date**](Date) | Date of conversation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversationEndDate** | [**Date**](Date) | End date of conversation if it had completed before evaluation creation. Null if created before the conversation ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **neverRelease** | **Boolean** | Signifies if the evaluation is never to be released. This cannot be set true if release date is also set. |  [optional] |
| **assigned** | **Boolean** | Set to false to unassign the evaluation. This cannot be set to false when assignee is also set. |  [optional] |
| **dateAssigneeChanged** | [**Date**](Date) | Date when the assignee was last changed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **resourceId** | **String** | Only used for email evaluations. Will be null for all other evaluations. |  [optional] |
| **resourceType** | [**ResourceTypeEnum**](#Enum--ResourceTypeEnum) | The type of resource. Only used for email evaluations. Will be null for evaluations on all other resources. |  [optional] |
| **redacted** | **Boolean** | Is only true when the user making the request does not have sufficient permissions to see evaluation |  [optional] |
| **isScoringIndex** | **Boolean** |  |  [optional] |
| **authorizedActions** | **List&lt;String&gt;** | List of user authorized actions on evaluation. Possible values: assign, edit, editScore, editAgentSignoff, delete, release, viewAudit |  [optional] |
| **hasAssistanceFailed** | **Boolean** | Is true when evaluation assistance didn't execute successfully |  [optional] |
| **evaluationSource** | [**EvaluationSource**](EvaluationSource) | The source that created the evaluation. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| INPROGRESS | &quot;INPROGRESS&quot; | 
| FINISHED | &quot;FINISHED&quot; | 
| INREVIEW | &quot;INREVIEW&quot; | 
| RETRACTED | &quot;RETRACTED&quot; | 
{: class="table table-striped"}


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| CALL | &quot;CALL&quot; |
| CALLBACK | &quot;CALLBACK&quot; |
| CHAT | &quot;CHAT&quot; |
| COBROWSE | &quot;COBROWSE&quot; |
| EMAIL | &quot;EMAIL&quot; |
| MESSAGE | &quot;MESSAGE&quot; |
| SOCIAL_EXPRESSION | &quot;SOCIAL_EXPRESSION&quot; |
| VIDEO | &quot;VIDEO&quot; |
| SCREENSHARE | &quot;SCREENSHARE&quot; |
{: class="table table-striped"}


## Enum: ResourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
