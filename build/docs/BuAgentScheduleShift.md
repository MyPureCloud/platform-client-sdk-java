# BuAgentScheduleShift


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the shift |  [optional] |
| **startDate** | [**Date**](Date) | The start date of this shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthMinutes** | **Integer** | The length of this shift in minutes |  [optional] |
| **activities** | [**List&lt;BuAgentScheduleActivity&gt;**](BuAgentScheduleActivity) | The activities associated with this shift |  [optional] |
| **manuallyEdited** | **Boolean** | Whether this shift was manually edited. This is only set by clients and is used for rescheduling |  [optional] |
| **schedule** | [**BuScheduleReference**](BuScheduleReference) | The schedule to which this shift belongs |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
