# WfmBuShortTermForecastCopyCompleteTopicBuShortTermForecast


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **weekDate** | **String** |  |  [optional] |
| **creationMethod** | [**CreationMethodEnum**](#Enum--CreationMethodEnum) |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **legacy** | **Boolean** |  |  [optional] |
| **referenceStartDate** | [**Date**](Date) |  |  [optional] |
| **sourceDays** | [**List&lt;WfmBuShortTermForecastCopyCompleteTopicForecastSourceDayPointer&gt;**](WfmBuShortTermForecastCopyCompleteTopicForecastSourceDayPointer) |  |  [optional] |
| **modifications** | [**List&lt;WfmBuShortTermForecastCopyCompleteTopicBuForecastModification&gt;**](WfmBuShortTermForecastCopyCompleteTopicBuForecastModification) |  |  [optional] |
| **timeZone** | **String** |  |  [optional] |
| **planningGroupsVersion** | **Long** |  |  [optional] |
| **weekCount** | **Long** |  |  [optional] |
| **metadata** | [**WfmBuShortTermForecastCopyCompleteTopicWfmVersionedEntityMetadata**](WfmBuShortTermForecastCopyCompleteTopicWfmVersionedEntityMetadata) |  |  [optional] |
| **canUseForScheduling** | **Boolean** |  |  [optional] |


## Enum: CreationMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMPORT | &quot;Import&quot; | 
| IMPORTEDHISTORICALWEIGHTEDAVERAGE | &quot;ImportedHistoricalWeightedAverage&quot; | 
| HISTORICALWEIGHTEDAVERAGE | &quot;HistoricalWeightedAverage&quot; | 
| ADVANCED | &quot;Advanced&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
