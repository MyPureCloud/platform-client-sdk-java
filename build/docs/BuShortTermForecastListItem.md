---
title: BuShortTermForecastListItem
---
## BuShortTermForecastListItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **weekDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The start week date of this forecast in yyyy-MM-dd.  Must fall on the start day of week for the associated business unit. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **weekCount** | <!----><!---->**Integer**<!----> | The number of weeks this forecast covers |  [optional] |
| **creationMethod** | [**CreationMethodEnum**](#CreationMethodEnum)<!----> | The method by which this forecast was created |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of this forecast |  [optional] |
| **legacy** | <!----><!---->**Boolean**<!----> | Whether this forecast contains modifications on legacy metrics |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Metadata for this forecast |  [optional] |
| **canUseForScheduling** | <!----><!---->**Boolean**<!----> | Whether this forecast can be used for scheduling |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="CreationMethodEnum"></a>

## Enum: CreationMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMPORT | &quot;Import&quot; | 
| IMPORTEDHISTORICALWEIGHTEDAVERAGE | &quot;ImportedHistoricalWeightedAverage&quot; | 
| HISTORICALWEIGHTEDAVERAGE | &quot;HistoricalWeightedAverage&quot; | 
| ADVANCED | &quot;Advanced&quot; | 
{: class="table table-striped"}



