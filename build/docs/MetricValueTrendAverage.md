---
title: MetricValueTrendAverage
---
## MetricValueTrendAverage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStartWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The targeted start workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEndWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The targeted end workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateReferenceWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The targeted reference workday. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **division** | <!----><!---->[**Division**](Division.html)<!----> | The targeted division for the metrics |  [optional] |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The targeted user for the metrics |  [optional] |
| **timezone** | <!----><!---->**String**<!----> | The time zone used for aggregating metric values |  [optional] |
| **result** | <!----><!---->[**WorkdayValuesMetricItem**](WorkdayValuesMetricItem.html)<!----> | The metric value trend and average |  [optional] |
| **performanceProfile** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The targeted performance profile for the average points |  [optional] |
| **metric** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The targeted performance profile for the average points |  [optional] |
{: class="table table-striped"}



