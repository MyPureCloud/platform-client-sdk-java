# BuTimeOffLimitValuesForGranularityResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **timeOffLimit** | [**BuTimeOffLimitReference**](BuTimeOffLimitReference) | The ID of the time-off limit |  |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity choice for time-off limit |  |
| **limitValues** | [**List&lt;BuTimeOffLimitValues&gt;**](BuTimeOffLimitValues) | Values for time-off limit |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the time-off limit |  |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| FIFTEENMINUTES | &quot;FifteenMinutes&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
