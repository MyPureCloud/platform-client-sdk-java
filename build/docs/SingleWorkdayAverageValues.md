---
title: SingleWorkdayAverageValues
---
## SingleWorkdayAverageValues


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The targeted workday for average value query. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **division** | <!----><!---->[**Division**](Division.html)<!----> | The targeted division for the metrics |  [optional] |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The targeted user for the metrics |  [optional] |
| **timezone** | <!----><!---->**String**<!----> | The time zone used for aggregating metric values |  [optional] |
| **results** | <!----><!---->[**List&lt;WorkdayValuesMetricItem&gt;**](WorkdayValuesMetricItem.html)<!----> | The metric value averages |  [optional] |
| **performanceProfile** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The targeted performance profile for the average points |  [optional] |
{: class="table table-striped"}



