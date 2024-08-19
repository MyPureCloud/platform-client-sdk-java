# ScheduleGenerationResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **failed** | **Boolean** | Whether the schedule generation run failed |  [optional] |
| **runId** | **String** | The ID of the schedule generation run. Reference this when requesting support |  [optional] |
| **messageCount** | **Integer** | The number of schedule generation messages for this schedule generation run |  [optional] |
| **messages** | [**List&lt;ScheduleGenerationMessage&gt;**](ScheduleGenerationMessage) | User facing messages related to the schedule generation run |  [optional] |
| **messageSeverities** | [**List&lt;SchedulerMessageTypeSeverity&gt;**](SchedulerMessageTypeSeverity) | The list of messages by severity in this schedule generation run |  [optional] |
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
