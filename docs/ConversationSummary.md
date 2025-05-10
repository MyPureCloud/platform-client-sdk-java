# ConversationSummary


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | **String** | The text of the summary. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the conversation summary. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type of the conversation. |  [optional] |
| **language** | **String** | The language of the conversation. |  [optional] |
| **predictedWrapupCodes** | [**List&lt;ConversationSummaryWrapupCode&gt;**](ConversationSummaryWrapupCode) | The wrapup codes of the conversation summary. |  [optional] |
| **editedSummary** | [**ConversationEditedInput**](ConversationEditedInput) | The edited summary of the conversation. |  [optional] |
| **reason** | [**ConversationSummaryReason**](ConversationSummaryReason) | The reason of the conversation summary. |  [optional] |
| **followup** | [**ConversationSummaryFollowup**](ConversationSummaryFollowup) | The followup of the conversation summary. |  [optional] |
| **resolution** | [**ConversationSummaryResolution**](ConversationSummaryResolution) | The resolution of the conversation summary. |  [optional] |
| **dateCreated** | [**Date**](Date) | The created date of the summary. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **id** | **String** | The id of the summary. |  [optional] |
| **confidence** | **Float** | The AI confidence value. |  [optional] |
| **participants** | [**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef) | The list of participants. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| QUEUED | &quot;Queued&quot; | 
| STARTED | &quot;Started&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 
| PROCESSING | &quot;Processing&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;Email&quot; | 
| CALL | &quot;Call&quot; | 
| CHAT | &quot;Chat&quot; | 
| MESSAGE | &quot;Message&quot; | 
| WEBMESSAGING | &quot;Webmessaging&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:225.0.0_
