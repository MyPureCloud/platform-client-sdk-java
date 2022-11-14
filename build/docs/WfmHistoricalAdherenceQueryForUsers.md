---
title: WfmHistoricalAdherenceQueryForUsers
---
## WfmHistoricalAdherenceQueryForUsers


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | Beginning of the date range to query in ISO-8601 format |  |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | End of the date range to query in ISO-8601 format. If it is not set, end date will be set to current time |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | The time zone, in olson format, to use in defining days when computing adherence. The results will be returned as UTC timestamps regardless of the time zone input. |  |
| **userIds** | <!----><!---->**List&lt;String&gt;**<!----> | The userIds to report on |  |
| **includeExceptions** | <!----><!---->**Boolean**<!----> | Whether user exceptions should be returned as part of the results |  [optional] |
{: class="table table-striped"}



