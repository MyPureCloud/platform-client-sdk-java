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
| **value** | <!----><!---->**Double**<!----> | The value of the metric data. When value is null, the metric data will be deleted. |  |
| **count** | <!----><!---->**Integer**<!----> | The number of data points. The default value is 1. |  [optional] |
| **message** | <!----><!---->**String**<!----> | The error message |  [optional] |
| **code** | <!----><!---->**String**<!----> | The error code |  [optional] |
{: class="table table-striped"}



