# WfmBuShortTermForecastGenerateProgressTopicBuShortTermForecast


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **weekDate** | **String** |  |  [optional] |
| **creationMethod** | [**CreationMethodEnum**](#Enum--CreationMethodEnum) |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **legacy** | **Boolean** |  |  [optional] |
| **referenceStartDate** | [**Date**](Date) |  |  [optional] |
| **sourceDays** | [**List&lt;WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer&gt;**](WfmBuShortTermForecastGenerateProgressTopicForecastSourceDayPointer) |  |  [optional] |
| **modifications** | [**List&lt;WfmBuShortTermForecastGenerateProgressTopicBuForecastModification&gt;**](WfmBuShortTermForecastGenerateProgressTopicBuForecastModification) |  |  [optional] |
| **timeZone** | **String** |  |  [optional] |
| **planningGroupsVersion** | **Long** |  |  [optional] |
| **weekCount** | **Long** |  |  [optional] |
| **metadata** | [**WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata**](WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata) |  |  [optional] |
| **canUseForScheduling** | **Boolean** |  |  [optional] |


## Enum: CreationMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMPORT | &quot;Import&quot; | 
| IMPORTEDHISTORICALWEIGHTEDAVERAGE | &quot;ImportedHistoricalWeightedAverage&quot; | 
| HISTORICALWEIGHTEDAVERAGE | &quot;HistoricalWeightedAverage&quot; | 
| ADVANCED | &quot;Advanced&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
