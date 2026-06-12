# Domains


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **authorizedDomains** | [**AuthorizedDomains**](AuthorizedDomains) | The authorized domains settings for email processing. |  [optional] |
| **allowExistingEmailParticipants** | **Boolean** | Allow reply and forward to recipients included in the previous email, ignoring the authorized domains list |  [optional] |
| **allowOutboundToAnyDomainAcd** | **Boolean** | Allow new outbound email (no existing conversation) to be sent to any domain, ignoring the authorized domains list.This setting applies only to new outbound emails sent on behalf of queue or agentless, NOT campaigns.This setting can only be true if allowExistingEmailParticipants is also true. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:255.1.0_
