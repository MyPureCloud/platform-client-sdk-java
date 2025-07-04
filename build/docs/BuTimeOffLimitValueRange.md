# BuTimeOffLimitValueRange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **timeOffLimit** | [**BuTimeOffLimitReference**](BuTimeOffLimitReference) | The ID of the time-off limit |  |
| **startDate** | [**LocalDate**](LocalDate) | Start date of the requested date range, in ISO-8601 format. The end date is determined by the size of interval lists |  |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity choice for time-off limit |  |
| **limitMinutesPerInterval** | **List&lt;Integer&gt;** | A list of time-off limit values in minutes per granularity interval |  |
| **allocatedMinutesPerInterval** | **List&lt;Integer&gt;** | A list of allocated time-off minutes per granularity interval |  |
| **waitlistedMinutesPerInterval** | **List&lt;Integer&gt;** | A list of waitlisted time-off minutes per granularity interval |  |
| **waitlistedRequestsPerInterval** | **List&lt;Integer&gt;** | The current number of waitlisted time-off requests for every interval per granularity |  |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata for the time-off limit |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
