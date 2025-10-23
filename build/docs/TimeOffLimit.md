# TimeOffLimit


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity choice for the time off limit |  [optional] |
| **defaultLimitMinutes** | **Integer** | The default time off limit value in minutes per granularity interval |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the time off limit |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
