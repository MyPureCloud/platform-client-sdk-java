---
title: SchedulingRunResponse
---
## SchedulingRunResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **runId** | **String** | ID of the schedule run |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | Status of the schedule run |  [optional] |
| **percentComplete** | **Double** | Completion percentage of the schedule run |  [optional] |
| **targetWeek** | **String** | The start date of the week for which the scheduling is done in yyyy-MM-dd format |  [optional] |
| **scheduleId** | **String** | ID of the schedule |  [optional] |
| **scheduleDescription** | **String** | Description of the schedule run |  [optional] |
| **schedulingStartTime** | [**Date**](Date.html) | Start time of the schedule run. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **schedulingStartedBy** | [**UserReference**](UserReference.html) | User that started the schedule run |  [optional] |
| **schedulingCanceledBy** | [**UserReference**](UserReference.html) | User that canceled the schedule run |  [optional] |
| **schedulingCompletedTime** | [**Date**](Date.html) | Time at which the scheduling run was completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NONE | &quot;None&quot; |
| QUEUED | &quot;Queued&quot; |
| SCHEDULING | &quot;Scheduling&quot; |
| CANCELED | &quot;Canceled&quot; |
| FAILED | &quot;Failed&quot; |
| COMPLETE | &quot;Complete&quot; |
{: class="table table-striped"}


