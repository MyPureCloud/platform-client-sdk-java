# CampaignDiagnostics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **callableContacts** | [**CallableContactsDiagnostic**](CallableContactsDiagnostic) | Campaign properties that can impact which contacts are callable |  [optional] |
| **queueUtilizationDiagnostic** | [**QueueUtilizationDiagnostic**](QueueUtilizationDiagnostic) | Information regarding the campaign's queue |  [optional] |
| **ruleSetDiagnostics** | [**List&lt;RuleSetDiagnostic&gt;**](RuleSetDiagnostic) | Information regarding the campaign's rule sets |  [optional] |
| **outstandingInteractionsCount** | **Integer** | Current number of outstanding interactions on the campaign |  [optional] |
| **scheduledInteractionsCount** | **Integer** | Current number of scheduled interactions on the campaign |  [optional] |
| **timeZoneRescheduledCallsCount** | **Integer** | Current number of time zone rescheduled calls on the campaign |  [optional] |
| **filteredOutContactsCount** | **Integer** | Number of contacts that don't match filter. This is currently supported only for Campaigns with dynamic filter on. |  [optional] |
| **campaignSkillStatistics** | [**CampaignSkillStatistics**](CampaignSkillStatistics) | Information regarding the campaign's skills |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
