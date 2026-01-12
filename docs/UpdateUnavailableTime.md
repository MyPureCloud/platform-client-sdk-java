# UpdateUnavailableTime


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the unavailable time span. Should be specified to update or delete an existing unavailable time span or set to null when creating a new one |  [optional] |
| **timeSpan** | [**UnavailableTimesTimeSpan**](UnavailableTimesTimeSpan) | Exact date, time and length of the unavailability time in granularity of minutes. Must be specified when creating a new unavailable time span |  [optional] |
| **notes** | **String** | Comments explaining the unavailability time span |  [optional] |
| **delete** | **Boolean** | Whether the unavailable time should be deleted |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
