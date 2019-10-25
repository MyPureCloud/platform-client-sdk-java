---
title: ObservationMetricData
---
## ObservationMetricData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | <!----><!---->**String**<!----> |  |  [optional] |
| **qualifier** | <!----><!---->**String**<!----> |  |  [optional] |
| **stats** | <!----><!---->[**StatisticalSummary**](StatisticalSummary.html)<!----> |  |  [optional] |
| **truncated** | <!----><!---->**Boolean**<!----> | Flag for a truncated list of observations. If truncated, the first half of the list of observations will contain the oldest observations and the second half the newest observations. |  [optional] |
| **observations** | <!----><!---->[**List&lt;ObservationValue&gt;**](ObservationValue.html)<!----> | List of observations sorted by timestamp in ascending order. This list may be truncated. |  [optional] |
{: class="table table-striped"}



