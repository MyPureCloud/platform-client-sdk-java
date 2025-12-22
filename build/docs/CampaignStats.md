# CampaignStats


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contactRate** | [**ConnectRate**](ConnectRate) | Information regarding the campaign's connect rate |  [optional] |
| **idleAgents** | **Integer** | Number of available agents not currently being utilized |  [optional] |
| **effectiveIdleAgents** | **Double** | Number of effective available agents not currently being utilized |  [optional] |
| **adjustedCallsPerAgent** | **Double** | Calls per agent adjusted by pace |  [optional] |
| **outstandingCalls** | **Integer** | Number of campaign calls currently ongoing |  [optional] |
| **scheduledCalls** | **Integer** | Number of campaign calls currently scheduled |  [optional] |
| **timeZoneRescheduledCalls** | **Integer** | Number of campaign calls currently timezone rescheduled |  [optional] |
| **filteredOutContactsCount** | **Integer** | Number of contacts that don't match filter. This is currently supported only for Campaigns with dynamic filter on. |  [optional] |
| **rightPartyContactsCount** | **Integer** | Information on the campaign's number of Right Party Contacts |  [optional] |
| **validAttempts** | **Integer** | Information on the campaign's valid attempts |  [optional] |
| **linesUtilization** | [**CampaignLinesUtilization**](CampaignLinesUtilization) | Information on the campaign's lines utilization |  [optional] |
| **businessCategoryMetrics** | [**CampaignBusinessCategoryMetrics**](CampaignBusinessCategoryMetrics) | Information on the campaign's business category metrics |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
