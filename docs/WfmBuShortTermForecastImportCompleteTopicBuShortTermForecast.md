# WfmBuShortTermForecastImportCompleteTopicBuShortTermForecast


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **weekDate** | **String** |  |  [optional] |
| **creationMethod** | [**CreationMethodEnum**](#Enum--CreationMethodEnum) |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **legacy** | **Boolean** |  |  [optional] |
| **referenceStartDate** | [**Date**](Date) |  |  [optional] |
| **sourceDays** | [**List&lt;WfmBuShortTermForecastImportCompleteTopicForecastSourceDayPointer&gt;**](WfmBuShortTermForecastImportCompleteTopicForecastSourceDayPointer) |  |  [optional] |
| **modifications** | [**List&lt;WfmBuShortTermForecastImportCompleteTopicBuForecastModification&gt;**](WfmBuShortTermForecastImportCompleteTopicBuForecastModification) |  |  [optional] |
| **timeZone** | **String** |  |  [optional] |
| **planningGroupsVersion** | **Integer** |  |  [optional] |
| **weekCount** | **Integer** |  |  [optional] |
| **metadata** | [**WfmBuShortTermForecastImportCompleteTopicWfmVersionedEntityMetadata**](WfmBuShortTermForecastImportCompleteTopicWfmVersionedEntityMetadata) |  |  [optional] |
| **canUseForScheduling** | **Boolean** |  |  [optional] |


## Enum: CreationMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMPORT | &quot;Import&quot; | 
| IMPORTEDHISTORICALWEIGHTEDAVERAGE | &quot;ImportedHistoricalWeightedAverage&quot; | 
| HISTORICALWEIGHTEDAVERAGE | &quot;HistoricalWeightedAverage&quot; | 
| ADVANCED | &quot;Advanced&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
