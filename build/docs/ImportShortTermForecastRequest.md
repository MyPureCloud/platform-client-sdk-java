---
title: ImportShortTermForecastRequest
---
## ImportShortTermForecastRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileName** | <!----><!---->**String**<!----> | The file name, if applicable, this data was extracted from (display purposes only) |  [optional] |
| **description** | <!----><!---->**String**<!----> | Description for the imported forecast.  Pass an empty string for no description |  |
| **routeGroupList** | <!----><!---->[**RouteGroupList**](RouteGroupList.html)<!----> | The raw data to import |  |
| **partialUploadIds** | <!----><!---->**List&lt;String&gt;**<!----> | IDs of partial uploads to include in this imported forecast.  Only relevant for large forecasts |  [optional] |
{: class="table table-striped"}



