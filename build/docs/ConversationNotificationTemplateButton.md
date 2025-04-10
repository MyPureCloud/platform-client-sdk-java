# ConversationNotificationTemplateButton


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Specifies the type of the button. |  |
| **text** | **String** | Button text message. |  [optional] |
| **index** | **Long** | index of the button in the list. |  |
| **phoneNumber** | **String** | Button phone number. |  [optional] |
| **url** | **String** | Button URL link. |  [optional] |
| **parameters** | [**List&lt;ConversationNotificationTemplateParameter&gt;**](ConversationNotificationTemplateParameter) | Template parameters for placeholders in the button. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUICKREPLY | &quot;QuickReply&quot; | 
| PHONENUMBER | &quot;PhoneNumber&quot; | 
| URL | &quot;Url&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
