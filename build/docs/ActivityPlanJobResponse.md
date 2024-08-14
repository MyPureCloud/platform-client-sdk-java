---
title: ActivityPlanJobResponse
---
## ActivityPlanJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **activityPlan** | <!----><!---->[**ActivityPlanReference**](ActivityPlanReference.html)<!----> | The activity plan associated with this job |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the job |  |
| **exceptions** | <!----><!---->[**List&lt;ActivityPlanJobException&gt;**](ActivityPlanJobException.html)<!----> | The list of exceptions that occurred while running this activity plan job. These are exceptions that affect individual occurrences but didn't prevent the job from completing |  |
| **error** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Error details if status == 'Error'. These are errors that caused the job to fail to complete |  [optional] |
| **occurrence** | <!----><!---->[**ActivityPlanOccurrenceReference**](ActivityPlanOccurrenceReference.html)<!----> | The occurrence associated with this job if type == 'DeleteOccurrence' |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the job |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNPLAN | &quot;RunPlan&quot; | 
| DELETEOCCURRENCE | &quot;DeleteOccurrence&quot; | 
{: class="table table-striped"}



