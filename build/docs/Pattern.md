---
title: Pattern
---
## Pattern


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Pattern type (Daily/Weekly) |  |
| **interval** | <!----><!---->**Integer**<!----> | The interval of days between the occurrences for Daily pattern type, and weeks between the occurrences for Weekly |  |
| **daysOfWeek** | <!---->[**List&lt;DaysOfWeekEnum&gt;**](#DaysOfWeekEnum)<!----> | The day(s) of week the occurrence should be repeated. Required to set for Weekly pattern type. E.g. [\"Monday\", \"Wednesday\"] |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
{: class="table table-striped"}


<a name="DaysOfWeekEnum"></a>

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
{: class="table table-striped"}



