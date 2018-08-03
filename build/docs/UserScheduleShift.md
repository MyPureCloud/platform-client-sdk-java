---
title: UserScheduleShift
---
## UserScheduleShift


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the schedule shift. This is only for the case of updating and deleting an existing shift |  [optional] |
| **startDate** | [**Date**](Date.html) | Start time in UTC for this shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **lengthInMinutes** | **Integer** | Length of this shift in minutes |  [optional] |
| **activities** | [**List&lt;UserScheduleActivity&gt;**](UserScheduleActivity.html) | List of activities in this shift |  [optional] |
| **delete** | **Boolean** | If marked true for updating this schedule shift, it will be deleted |  [optional] |
| **manuallyEdited** | **Boolean** | Whether the shift was set as manually edited |  [optional] |
{: class="table table-striped"}



