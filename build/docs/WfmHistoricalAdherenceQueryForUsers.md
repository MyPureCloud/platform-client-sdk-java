---
title: WfmHistoricalAdherenceQueryForUsers
---
## WfmHistoricalAdherenceQueryForUsers


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | Beginning of the date range to query in ISO-8601 format |  |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | End of the date range to query in ISO-8601 format. If it is not set, end date will be set to current time |  [optional] |
| **timeZone** | <!----><!---->**String**<!----> | The time zone to use for returned results in olson format. If it is not set, the business unit time zone will be used to compute adherence |  [optional] |
| **userIds** | <!----><!---->**List&lt;String&gt;**<!----> | The userIds to report on. Note: Only one of [teamIds, userIds] can be requested |  |
| **teamIds** | <!----><!---->**List&lt;String&gt;**<!----> | The teamIds to report on. Note: Only one of [teamIds, userIds] can be requested |  |
| **includeExceptions** | <!----><!---->**Boolean**<!----> | Whether user exceptions should be returned as part of the results |  [optional] |
{: class="table table-striped"}



