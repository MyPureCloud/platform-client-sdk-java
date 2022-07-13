---
title: WfmHistoricalAdherenceQuery
---
## WfmHistoricalAdherenceQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | Beginning of the date range to query in ISO-8601 format |  |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | End of the date range to query in ISO-8601 format. If it is not set, end date will be set to current time |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | The time zone, in olson format, to use in defining days when computing adherence. If it is not set, the business unit time zone will be used. The results will be returned as UTC timestamps regardless of the time zone input. |  [optional] |
| **userIds** | <!----><!---->**List&lt;String&gt;**<!----> | The userIds to report on. If null or not set, adherence will be computed for all the users in management unit or requested teamIds |  [optional] |
| **includeExceptions** | <!----><!---->**Boolean**<!----> | Whether user exceptions should be returned as part of the results |  [optional] |
| **teamIds** | <!----><!---->**List&lt;String&gt;**<!----> | The teamIds to report on. If null or not set, adherence will be computed for requested users if applicable or otherwise all users in the management unit. Note: If teamIds is also specified, only adherence for users in the requested teams will be returned |  [optional] |
{: class="table table-striped"}



