---
title: AsyncWeekScheduleResponse
---
## AsyncWeekScheduleResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum) | The status of the request |  [optional] |
| **result** | [**WeekSchedule**](WeekSchedule.html) | Week schedule result. The value will be null if the data is sent through notification or if response is large. |  [optional] |
| **operationId** | **String** | The operation id to watch for on the notification topic if status == Processing |  [optional] |
| **downloadUrl** | **String** | The url to fetch the result for large responses. The value will be null if result contains the data |  [optional] |
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


