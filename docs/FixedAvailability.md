# FixedAvailability


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **availabilityRange** | [**AvailabilityRange**](AvailabilityRange) | The range of time of day the activity can be scheduled |  [optional] |
| **dateRange** | [**RequiredLocalDateRange**](RequiredLocalDateRange) | The range of date for which the activity plan could be scheduled |  [optional] |
| **daysOfWeek** | [**List<DaysOfWeekEnum>**](#Enum--DaysOfWeekEnum) | The days of week available for scheduling. Empty list or null means daysOfWeek is not considered |  [optional] |


## Enum: DaysOfWeekEnum

| Name | Value |
| ---- | ----- |
| SUNDAY | &quot;Sunday&quot; |
| MONDAY | &quot;Monday&quot; |
| TUESDAY | &quot;Tuesday&quot; |
| WEDNESDAY | &quot;Wednesday&quot; |
| THURSDAY | &quot;Thursday&quot; |
| FRIDAY | &quot;Friday&quot; |
| SATURDAY | &quot;Saturday&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
