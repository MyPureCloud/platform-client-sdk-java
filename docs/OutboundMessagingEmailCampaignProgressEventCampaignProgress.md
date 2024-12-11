# OutboundMessagingEmailCampaignProgressEventCampaignProgress


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaign** | [**OutboundMessagingEmailCampaignProgressEventUriReference**](OutboundMessagingEmailCampaignProgressEventUriReference) |  |  [optional] |
| **numberOfContactsCalled** | [**BigDecimal**](BigDecimal) | The number of contacts that have been called so far |  [optional] |
| **numberOfContactsMessaged** | [**BigDecimal**](BigDecimal) | The number of contacts that have been messaged so far |  [optional] |
| **totalNumberOfContacts** | [**BigDecimal**](BigDecimal) | The total number of contacts in the contact list |  [optional] |
| **percentage** | **Integer** | numberOfContactsContacted/totalNumberOfContacts*100 |  [optional] |
| **numberOfContactsSkipped** | **Map&lt;String, Integer&gt;** | A map of skipped reasons and the number of contacts associated with each. |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:216.0.0_
