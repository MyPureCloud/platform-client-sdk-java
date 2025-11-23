# Pattern


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Pattern type (Daily/Weekly) |  |
| **interval** | **Integer** | The interval of days between the occurrences for Daily pattern type, and weeks between the occurrences for Weekly |  |
| **daysOfWeek** | [**List<DaysOfWeekEnum>**](#Enum--DaysOfWeekEnum) | The day(s) of week the occurrence should be repeated. Required to set for Weekly pattern type. E.g. [\"Monday\", \"Wednesday\"] |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 


## Enum: DaysOfWeekEnum

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




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
