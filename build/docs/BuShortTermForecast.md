# BuShortTermForecast


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **weekDate** | [**LocalDate**](LocalDate) | The start week date of this forecast in yyyy-MM-dd.  Must fall on the start day of week for the associated business unit. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **weekCount** | **Integer** | The number of weeks this forecast covers |  [optional] |
| **creationMethod** | [**CreationMethodEnum**](#Enum--CreationMethodEnum) | The method by which this forecast was created |  [optional] |
| **description** | **String** | The description of this forecast |  [optional] |
| **legacy** | **Boolean** | Whether this forecast contains modifications on legacy metrics |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Metadata for this forecast |  [optional] |
| **canUseForScheduling** | **Boolean** | Whether this forecast can be used for scheduling |  [optional] |
| **referenceStartDate** | [**Date**](Date) | The reference start date for interval-based data for this forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **sourceDays** | [**List&lt;ForecastSourceDayPointer&gt;**](ForecastSourceDayPointer) | The source day pointers for this forecast |  [optional] |
| **modifications** | [**List&lt;BuForecastModificationResponse&gt;**](BuForecastModificationResponse) | Any manual modifications applied to this forecast |  [optional] |
| **generationResults** | [**BuForecastGenerationResult**](BuForecastGenerationResult) | Generation result metadata |  [optional] |
| **timeZone** | **String** | The time zone for this forecast |  [optional] |
| **planningGroupsVersion** | **Integer** | The version of the planning groups that was used for this forecast |  [optional] |
| **planningGroups** | [**ForecastPlanningGroupsResponse**](ForecastPlanningGroupsResponse) | A snapshot of the planning groups used for this forecast as of the version number indicated |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: CreationMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMPORT | &quot;Import&quot; | 
| IMPORTEDHISTORICALWEIGHTEDAVERAGE | &quot;ImportedHistoricalWeightedAverage&quot; | 
| HISTORICALWEIGHTEDAVERAGE | &quot;HistoricalWeightedAverage&quot; | 
| ADVANCED | &quot;Advanced&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
