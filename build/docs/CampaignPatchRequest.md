---
title: CampaignPatchRequest
---
## CampaignPatchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outboundLineCount** | <!----><!---->**Integer**<!----> | The number of outbound lines to be concurrently dialed. |  [optional] |
| **abandonRate** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> | The targeted compliance abandon rate percentage |  [optional] |
| **maxCallsPerAgent** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> | The maximum number of calls that can be placed per agent on this campaign |  [optional] |
| **dynamicLineBalancingSettings** | <!----><!---->[**DynamicLineBalancingSettingsPatchRequest**](DynamicLineBalancingSettingsPatchRequest.html)<!----> | Dynamic line balancing settings |  [optional] |
| **queue** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The Queue for this Campaign to route calls to. |  [optional] |
{: class="table table-striped"}



