---
title: ExternalMetricDataUnprocessedItem
---
## ExternalMetricDataUnprocessedItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **userId** | <!----><!---->**String**<!----> | The user ID. Must provide either userId or userEmail, but not both. |  [optional] |
| **userEmail** | <!----><!---->**String**<!----> | The user main email used in user's GenesysCloud account. Must provide either userId or userEmail, but not both. |  [optional] |
| **metricId** | <!----><!---->**String**<!----> | The ID of the external metric definition |  |
| **dateOccurred** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The date of the metric data. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **value** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> | The value of the metric data. When value is null, the metric data will be deleted. |  |
| **count** | <!----><!---->**Integer**<!----> | The number of data points. The default value is 0 when type is Cumulative and the metric data already exists, otherwise 1. When total count reaches 0, the metric data will be deleted. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the metric data. The default value is Total. |  [optional] |
| **message** | <!----><!---->**String**<!----> | The error message |  [optional] |
| **code** | <!----><!---->**String**<!----> | The error code |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TOTAL | &quot;Total&quot; | 
| CUMULATIVE | &quot;Cumulative&quot; | 
{: class="table table-striped"}



