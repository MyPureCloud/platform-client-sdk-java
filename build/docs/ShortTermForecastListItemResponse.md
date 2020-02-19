---
title: ShortTermForecastListItemResponse
---
## ShortTermForecastListItemResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **weekDate** | <!----><!---->**String**<!----> | The weekDate of the short term forecast in yyyy-MM-dd format |  |
| **description** | <!----><!---->**String**<!----> | The description of the short term forecast |  [optional] |
| **creationMethod** | [**CreationMethodEnum**](#CreationMethodEnum)<!----> | The method used to create this forecast |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Metadata for this forecast |  |
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



