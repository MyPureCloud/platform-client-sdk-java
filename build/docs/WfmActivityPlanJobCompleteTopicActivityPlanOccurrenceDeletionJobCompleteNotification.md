---
title: WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification
---
## WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceDeletionJobCompleteNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **activityPlan** | <!----><!---->[**WfmActivityPlanJobCompleteTopicActivityPlanReference**](WfmActivityPlanJobCompleteTopicActivityPlanReference.html)<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **exceptions** | <!----><!---->[**List&lt;WfmActivityPlanJobCompleteTopicActivityPlanJobException&gt;**](WfmActivityPlanJobCompleteTopicActivityPlanJobException.html)<!----> |  |  [optional] |
| **error** | <!----><!---->[**WfmActivityPlanJobCompleteTopicErrorBody**](WfmActivityPlanJobCompleteTopicErrorBody.html)<!----> |  |  [optional] |
| **occurrence** | <!----><!---->[**WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference**](WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNPLAN | &quot;RunPlan&quot; | 
| DELETEOCCURRENCE | &quot;DeleteOccurrence&quot; | 
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



