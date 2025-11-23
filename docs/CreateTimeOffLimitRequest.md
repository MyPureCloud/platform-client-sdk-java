# CreateTimeOffLimitRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity choice for time off limit. If not specified, 'Daily' is assumed |  [optional] |
| **defaultLimitMinutes** | **Integer** | The default limit value in minutes per granularity. If not specified, then 0 is assumed, which means there are no time off minutes available |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| FIFTEENMINUTES | &quot;FifteenMinutes&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
