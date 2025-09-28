# InboundDomainPatchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mailFromSettings** | [**MailFromResult**](MailFromResult) | The DNS settings if the inbound domain is using a custom Mail From. These settings can only be used on InboundDomains where subDomain is false. |  [optional] |
| **customSMTPServer** | [**DomainEntityRef**](DomainEntityRef) | The custom SMTP server integration to use when sending outbound emails from this domain. |  [optional] |
| **imapSettings** | [**ImapSettings**](ImapSettings) | The IMAP server integration and settings to use for processing inbound emails. |  [optional] |
| **emailSetting** | [**EmailSettingReference**](EmailSettingReference) | The email settings to associate with this domain. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
