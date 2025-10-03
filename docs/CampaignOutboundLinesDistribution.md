# CampaignOutboundLinesDistribution


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaign** | [**AddressableEntityRef**](AddressableEntityRef) | The Campaign for which dialing group distribution information was requested |  [optional] |
| **maxOutboundLineCount** | **Integer** | Maximum outbound calls that can be placed for Campaign's Edge Group or Site |  [optional] |
| **maxLineUtilization** | [**BigDecimal**](BigDecimal) | Maximum ratio of dialer calls to Campaign's Edge Group or Site capacity |  [optional] |
| **availableOutboundLines** | **Integer** | Number of available outbound lines in Campaign's Edge Group or Site |  [optional] |
| **reservedLines** | **Integer** | Number of reserved outbound lines in Campaign's Edge Group or Site |  [optional] |
| **campaignsWithReservedLines** | [**List&lt;CampaignOutboundLinesReservation&gt;**](CampaignOutboundLinesReservation) | Information about campaigns with reserving lines in Campaign's Edge Group or Site |  [optional] |
| **campaignsWithDynamicallyAllocatedLines** | [**List&lt;CampaignOutboundLinesAllocation&gt;**](CampaignOutboundLinesAllocation) | Information about campaigns using dynamic lines allocation in Campaign's Edge Group or Site |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
