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
| **planningGroupsVersion** | **Integer** |  |  [optional] |
| **weekCount** | **Integer** |  |  [optional] |
| **metadata** | [**WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata**](WfmBuShortTermForecastGenerateProgressTopicWfmVersionedEntityMetadata) |  |  [optional] |
| **canUseForScheduling** | **Boolean** |  |  [optional] |
{: class="table table-striped"}


## Enum: CreationMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMPORT | &quot;Import&quot; | 
| IMPORTEDHISTORICALWEIGHTEDAVERAGE | &quot;ImportedHistoricalWeightedAverage&quot; | 
| HISTORICALWEIGHTEDAVERAGE | &quot;HistoricalWeightedAverage&quot; | 
| ADVANCED | &quot;Advanced&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
