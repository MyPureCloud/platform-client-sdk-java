# BuConvertTimeOffLimitGranularityJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity to convert the time-off limit to |  |
| **fullDayTimeOffStartTime** | **String** | The start time of full day time-off requests associated with this limit interval in HH:mm format.The value can be set only once when converting the time-off limit from daily granularity to fifteen minutes.Setting this value is allowed only for time-off limit with fifteen minutes granularity.When converting time-off limit from fifteen minutes to daily granularity, the existing value is reset. |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| FIFTEENMINUTES | &quot;FifteenMinutes&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
