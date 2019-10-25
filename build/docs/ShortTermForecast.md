---
title: ShortTermForecast
---
## ShortTermForecast


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The id of the short term forecast |  |
| **weekDate** | <!----><!---->**String**<!----> | The weekDate of the short term forecast in yyyy-MM-dd format |  |
| **description** | <!----><!---->**String**<!----> | The description of the short term forecast |  [optional] |
| **creationMethod** | [**CreationMethodEnum**](#CreationMethodEnum)<!----> | The method used to create this forecast |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Metadata for this forecast |  |
| **sourceData** | <!----><!---->[**ListWrapperForecastSourceDayPointer**](ListWrapperForecastSourceDayPointer.html)<!----> | The source data references and metadata for this forecast |  [optional] |
| **referenceStartDate** | <!----><!---->[**Date**](Date.html)<!----> | ISO-8601 date that serves as the reference date for interval-based modifications |  [optional] |
| **modifications** | <!----><!---->[**ListWrapperWfmForecastModification**](ListWrapperWfmForecastModification.html)<!----> | The modifications that have been applied to this forecast |  [optional] |
| **generationResults** | <!----><!---->[**ForecastGenerationResult**](ForecastGenerationResult.html)<!----> | Forecast generation results, if applicable |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="CreationMethodEnum"></a>

## Enum: CreationMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| IMPORT | &quot;Import&quot; |
| HISTORICALWEIGHTEDAVERAGE | &quot;HistoricalWeightedAverage&quot; |
| ADVANCED | &quot;Advanced&quot; |
{: class="table table-striped"}



