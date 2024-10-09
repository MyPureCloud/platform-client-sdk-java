# ConversationNotificationTemplateHeader


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Template header type. |  |
| **text** | **String** | Header text. For WhatsApp, ignored. |  [optional] |
| **media** | [**ConversationContentAttachment**](ConversationContentAttachment) | Media template header image. |  [optional] |
| **parameters** | [**List&lt;ConversationNotificationTemplateParameter&gt;**](ConversationNotificationTemplateParameter) | Template parameters for placeholders in template. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| MEDIA | &quot;Media&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
