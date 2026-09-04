# AggregatedExportJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity of the exported data, defaults to day |  [optional] |
| **timeZone** | **String** | The requested time zone of the exported data, in Olson format. Defaults to business unit time zone |  [optional] |
| **delimiter** | **String** | The delimiter to use between fields in the export, defaults to comma |  [optional] |
| **planningGroupIds** | **List&lt;String&gt;** | The IDs of the planning groups to include in the export, defaults to all planning groups in the business unit |  [optional] |
| **dateStart** | [**Date**](Date) | Start date-time of the export range in ISO-8601 format |  [optional] |
| **dateEnd** | [**Date**](Date) | End date-time of the export range in ISO-8601 format |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FIFTEENMINUTES | &quot;FifteenMinutes&quot; | 
| THIRTYMINUTES | &quot;ThirtyMinutes&quot; | 
| SIXTYMINUTES | &quot;SixtyMinutes&quot; | 
| DAY | &quot;Day&quot; | 
| WEEK | &quot;Week&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
