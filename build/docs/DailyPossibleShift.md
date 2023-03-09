---
title: DailyPossibleShift
---
## DailyPossibleShift


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dayOfWeek** | [**DayOfWeekEnum**](#DayOfWeekEnum)<!----> | Day of the shift |  [optional] |
| **earliestShiftStartMinutesFromMidnight** | <!----><!---->**Integer**<!----> | Minutes of the earliest shift start from midnight. Note that midnight is 12:00 am in the time zone specified in the timeZone field (in the top level of the response) |  [optional] |
| **required** | <!----><!---->**Boolean**<!----> | Whether this is a required shift |  [optional] |
| **minimumPaidTimeMinutes** | <!----><!---->**Integer**<!----> | Minimum paid time in minutes of this daily shift |  [optional] |
| **maximumPaidTimeMinutes** | <!----><!---->**Integer**<!----> | Maximum paid time in minutes of this daily shift |  [optional] |
| **intervalScheduleProbabilities** | <!----><!---->**List&lt;Integer&gt;**<!----> | The percentage of being scheduled in each interval between the earliest shift start and latest shift end. Range of the values: [0, 100]. |  [optional] |
{: class="table table-striped"}


<a name="DayOfWeekEnum"></a>

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
{: class="table table-striped"}



