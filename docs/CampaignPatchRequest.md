# CampaignPatchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **outboundLineCount** | **Integer** | The number of outbound lines to be concurrently dialed. |  [optional] |
| **abandonRate** | [**BigDecimal**](BigDecimal) | The targeted compliance abandon rate percentage |  [optional] |
| **maxCallsPerAgent** | [**BigDecimal**](BigDecimal) | The maximum number of calls that can be placed per agent on this campaign |  [optional] |
| **dynamicLineBalancingSettings** | [**DynamicLineBalancingSettingsPatchRequest**](DynamicLineBalancingSettingsPatchRequest) | Dynamic line balancing settings |  [optional] |
| **queue** | [**AddressableEntityRef**](AddressableEntityRef) | The Queue for this Campaign to route calls to. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
