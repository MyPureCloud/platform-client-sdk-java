---
title: IntradayQueryDataCommand
---
## IntradayQueryDataCommand


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | [**Date**](Date.html) | Start date of the requested date range in ISO-8601 format |  |
| **endDate** | [**Date**](Date.html) | End date of the requested date range in ISO-8601 format.  Must be within the same 7 day schedule week as defined by the management unit&#39;s start day of week |  |
| **metrics** | [**List&lt;IntradayMetric&gt;**](IntradayMetric.html) | The metrics to validate |  |
| **queueIds** | **List&lt;String&gt;** | The queue IDs for which to fetch data.  Omitting or passing an empty list will return all available queues |  [optional] |
| **intervalLengthMinutes** | **Integer** | The period/interval for which to aggregate the data.  Optional, defaults to 15 |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


