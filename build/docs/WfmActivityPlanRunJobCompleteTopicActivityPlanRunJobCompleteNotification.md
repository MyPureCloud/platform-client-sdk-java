---
title: WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification
---
## WfmActivityPlanRunJobCompleteTopicActivityPlanRunJobCompleteNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **activityPlan** | <!----><!---->[**WfmActivityPlanRunJobCompleteTopicActivityPlanReference**](WfmActivityPlanRunJobCompleteTopicActivityPlanReference.html)<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **exceptions** | <!----><!---->[**List&lt;WfmActivityPlanRunJobCompleteTopicActivityPlanJobException&gt;**](WfmActivityPlanRunJobCompleteTopicActivityPlanJobException.html)<!----> |  |  [optional] |
| **error** | <!----><!---->[**WfmActivityPlanRunJobCompleteTopicErrorBody**](WfmActivityPlanRunJobCompleteTopicErrorBody.html)<!----> |  |  [optional] |
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



