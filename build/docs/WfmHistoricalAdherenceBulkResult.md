---
title: WfmHistoricalAdherenceBulkResult
---
## WfmHistoricalAdherenceBulkResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | Beginning of the date range for this result in ISO-8601 format |  [optional] |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | End of the date range for this result in ISO-8601 format |  [optional] |
| **managementUnitId** | <!----><!---->**String**<!----> | The ID of the management unit for this result |  [optional] |
| **userResults** | <!----><!---->[**List&lt;WfmHistoricalAdherenceBulkUserResult&gt;**](WfmHistoricalAdherenceBulkUserResult.html)<!----> | The individual results for each user |  [optional] |
| **lookupIdToSecondaryPresenceId** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Map of secondary presence lookup ID to corresponding secondary presence ID |  [optional] |
{: class="table table-striped"}



