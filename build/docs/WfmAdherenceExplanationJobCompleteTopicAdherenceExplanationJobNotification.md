---
title: WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationJobNotification
---
## WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationJobNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **adherenceExplanation** | <!----><!---->[**WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification**](WfmAdherenceExplanationJobCompleteTopicAdherenceExplanationChangedNotification.html)<!----> |  |  [optional] |
| **downloadUrl** | <!----><!---->**String**<!----> |  |  [optional] |
| **error** | <!----><!---->[**WfmAdherenceExplanationJobCompleteTopicErrorBody**](WfmAdherenceExplanationJobCompleteTopicErrorBody.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADDEXPLANATION | &quot;AddExplanation&quot; | 
| UPDATEEXPLANATION | &quot;UpdateExplanation&quot; | 
| QUERYAGENTEXPLANATIONS | &quot;QueryAgentExplanations&quot; | 
| QUERYBUEXPLANATIONS | &quot;QueryBuExplanations&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



