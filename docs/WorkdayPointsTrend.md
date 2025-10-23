# WorkdayPointsTrend


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStartWorkday** | [**LocalDate**](LocalDate) | The start workday for the query range for the gamification points trend. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEndWorkday** | [**LocalDate**](LocalDate) | The end workday for the query range for the gamification points trend. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **user** | [**UserReference**](UserReference) | The targeted user for the query |  [optional] |
| **dayOfWeek** | [**DayOfWeekEnum**](#Enum--DayOfWeekEnum) | Aggregated for same day comparison |  [optional] |
| **averagePoints** | **Double** | The total average points |  [optional] |
| **trend** | [**List&lt;WorkdayPointsTrendItem&gt;**](WorkdayPointsTrendItem) | Daily points trends |  [optional] |


## Enum: DayOfWeekEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUNDAY | &quot;Sunday&quot; | 
| MONDAY | &quot;Monday&quot; | 
| TUESDAY | &quot;Tuesday&quot; | 
| WEDNESDAY | &quot;Wednesday&quot; | 
| THURSDAY | &quot;Thursday&quot; | 
| FRIDAY | &quot;Friday&quot; | 
| SATURDAY | &quot;Saturday&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
