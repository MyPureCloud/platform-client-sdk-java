# CampaignPerformanceData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaign** | [**DomainEntityRef**](DomainEntityRef) | Identifier of the campaign |  |
| **division** | [**AddressableEntityRef**](AddressableEntityRef) | The division the campaign belongs to |  [optional] |
| **contactRate** | [**CampaignPerformanceDataContactRate**](CampaignPerformanceDataContactRate) | Information regarding the campaign's connect rate |  [optional] |
| **idleAgents** | **Integer** | Number of available agents not currently being utilized |  [optional] |
| **effectiveIdleAgents** | [**BigDecimal**](BigDecimal) | Number of effective available agents not currently being utilized |  [optional] |
| **adjustedCallsPerAgent** | [**BigDecimal**](BigDecimal) | Calls per agent adjusted by pace |  [optional] |
| **outstandingCalls** | **Integer** | Number of campaign calls currently ongoing |  [optional] |
| **scheduledCalls** | **Integer** | Number of campaign calls currently scheduled |  [optional] |
| **rightPartyContactsCount** | **Integer** | Information on the campaign's number of Right Party Contacts |  [optional] |
| **campaignStatus** | [**CampaignStatusEnum**](#Enum--CampaignStatusEnum) | The status of the campaign |  [optional] |
| **dialingMode** | [**DialingModeEnum**](#Enum--DialingModeEnum) | The strategy this Campaign will use for dialing |  [optional] |
| **progress** | [**CampaignPerformanceDataProgress**](CampaignPerformanceDataProgress) | Information on the campaign's progress |  [optional] |
| **linesUtilization** | [**CampaignLinesUtilization**](CampaignLinesUtilization) | Information on the campaign's lines utilization |  [optional] |
| **businessCategoryMetrics** | [**CampaignBusinessCategoryMetrics**](CampaignBusinessCategoryMetrics) | Information on the campaign's business category metrics |  [optional] |


## Enum: CampaignStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;on&quot; | 
| STOPPING | &quot;stopping&quot; | 
| OFF | &quot;off&quot; | 
| COMPLETE | &quot;complete&quot; | 
| INVALID | &quot;invalid&quot; | 
| FORCED_OFF | &quot;forced_off&quot; | 
| FORCED_STOPPING | &quot;forced_stopping&quot; | 


## Enum: DialingModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTLESS | &quot;agentless&quot; | 
| PREVIEW | &quot;preview&quot; | 
| POWER | &quot;power&quot; | 
| PREDICTIVE | &quot;predictive&quot; | 
| PROGRESSIVE | &quot;progressive&quot; | 
| EXTERNAL | &quot;external&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
