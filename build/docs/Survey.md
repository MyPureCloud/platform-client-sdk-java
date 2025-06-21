# Survey


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **conversation** | [**ConversationReference**](ConversationReference) |  |  [optional] |
| **surveyForm** | [**SurveyForm**](SurveyForm) | Survey form used for this survey. |  [optional] |
| **agent** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **queue** | [**QueueReference**](QueueReference) |  |  [optional] |
| **answers** | [**SurveyScoringSet**](SurveyScoringSet) |  |  [optional] |
| **completedDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **surveyErrorDetails** | [**SurveyErrorDetails**](SurveyErrorDetails) | Additional information about what happened when the survey is in Error status. |  [optional] |
| **agentTeam** | [**Team**](Team) | The team that the agent belongs to |  [optional] |
| **surveyType** | [**SurveyTypeEnum**](#Enum--SurveyTypeEnum) | Type of the survey |  [optional] |
| **missingRequiredAnswer** | **Boolean** | True if any of the required questions for the survey form have not been answered. Null if survey is not finished. |  [optional] |
| **flow** | [**AddressableEntityRef**](AddressableEntityRef) | An Architect flow that executed in order to collect the answers for this survey. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| SENT | &quot;Sent&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| FINISHED | &quot;Finished&quot; | 
| OPTOUT | &quot;OptOut&quot; | 
| ERROR | &quot;Error&quot; | 
| EXPIRED | &quot;Expired&quot; | 


## Enum: SurveyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEB | &quot;Web&quot; | 
| VOICE | &quot;Voice&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
