# WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationJobNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **adherenceExplanation** | [**WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification**](WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification) |  |  [optional] |
| **downloadUrl** | **String** |  |  [optional] |
| **error** | [**WfmAdherenceExplanationJobCompleteTopicErrorBody**](WfmAdherenceExplanationJobCompleteTopicErrorBody) |  |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADDEXPLANATION | &quot;AddExplanation&quot; | 
| UPDATEEXPLANATION | &quot;UpdateExplanation&quot; | 
| QUERYAGENTEXPLANATIONS | &quot;QueryAgentExplanations&quot; | 
| QUERYBUEXPLANATIONS | &quot;QueryBuExplanations&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
