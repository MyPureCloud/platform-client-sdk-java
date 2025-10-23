# EdgeAutoUpdateConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeZone** | **String** | The timezone of the window in which any updates to the edges assigned to the site can be applied. The minimum size of the window is 2 hours. |  |
| **rrule** | **String** | The recurrence rule for updating the Edges assigned to the site. The only supported frequencies are daily and weekly. Weekly frequencies require a day list with at least oneday specified. All other configurations are not supported. |  |
| **start** | [**LocalDateTime**](LocalDateTime) | Date time is represented as an ISO-8601 string without a timezone. For example: yyyy-MM-ddTHH:mm:ss.SSS |  |
| **end** | [**LocalDateTime**](LocalDateTime) | Date time is represented as an ISO-8601 string without a timezone. For example: yyyy-MM-ddTHH:mm:ss.SSS |  |




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
