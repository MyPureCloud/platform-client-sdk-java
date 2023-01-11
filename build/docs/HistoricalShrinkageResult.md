---
title: HistoricalShrinkageResult
---
## HistoricalShrinkageResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | Beginning of the date range that was queried, in ISO-8601 format |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | End of the date range that was queried, in ISO-8601 format. If it was not set, end date will be set to the queried time |  [optional] |
| **totalScheduledDurationSeconds** | <!----><!---->**Integer**<!----> | Total duration in seconds for which agents in the management unit are scheduled |  [optional] |
| **totalLoggedInDurationSeconds** | <!----><!---->**Integer**<!----> | Total duration in seconds for which agents in the management unit are actually logged-in |  [optional] |
| **aggregatedShrinkage** | <!----><!---->[**HistoricalShrinkageAggregateResponse**](HistoricalShrinkageAggregateResponse.html)<!----> | Aggregated shrinkage data for all the activity categories |  [optional] |
| **shrinkageForActivityCategories** | <!----><!---->[**List&lt;HistoricalShrinkageActivityCategoryResponse&gt;**](HistoricalShrinkageActivityCategoryResponse.html)<!----> | Shrinkage for activity categories |  [optional] |
| **businessUnitIds** | <!----><!---->**List&lt;String&gt;**<!----> | List of all business units of all the agents in response |  [optional] |
{: class="table table-striped"}



