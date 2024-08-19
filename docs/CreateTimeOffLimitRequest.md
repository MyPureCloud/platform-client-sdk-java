# CreateTimeOffLimitRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity choice for time off limit. If not specified, 'Daily' is assumed |  [optional] |
| **defaultLimitMinutes** | **Integer** | The default limit value in minutes per granularity. If not specified, then 0 is assumed, which means there are no time off minutes available |  [optional] |
{: class="table table-striped"}


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
