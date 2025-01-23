# EmailMessageReply


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **to** | [**List&lt;EmailAddress&gt;**](EmailAddress) | The recipients of the email message. |  |
| **cc** | [**List&lt;EmailAddress&gt;**](EmailAddress) | The recipients that were copied on the email message. |  [optional] |
| **bcc** | [**List&lt;EmailAddress&gt;**](EmailAddress) | The recipients that were blind copied on the email message. |  [optional] |
| **from** | [**EmailAddress**](EmailAddress) | The sender of the email message. |  |
| **replyTo** | [**EmailAddress**](EmailAddress) | The receiver of the reply email message. |  [optional] |
| **subject** | **String** | The subject of the email message. |  [optional] |
| **attachments** | [**List&lt;Attachment&gt;**](Attachment) | The attachments of the email message. |  [optional] |
| **textBody** | **String** | The text body of the email message. |  |
| **htmlBody** | **String** | The html body of the email message. |  [optional] |
| **time** | [**Date**](Date) | The time when the message was received or sent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **historyIncluded** | **Boolean** | Indicates whether the history of previous emails of the conversation is included within the email bodies of this message. |  [optional] |
| **emailSizeBytes** | **Integer** | Indicates an estimation of the size of the current email as a whole, in its final, ready to be sent form. |  [optional] |
| **maxEmailSizeBytes** | **Integer** | Indicates the maximum allowed size for an email to be send via SMTP server, based on the email domain configuration |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
