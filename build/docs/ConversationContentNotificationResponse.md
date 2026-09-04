# ConversationContentNotificationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **originatingMessageId** | **String** | Reference to the ID of the original outbound notification message this response is for (e.g. the Apple requestIdentifier). |  |
| **referenceId** | **String** | The business context reference associated with the notification (e.g. order ID, case ID). May be empty if the provider does not return it. |  [optional] |
| **notificationStatus** | [**NotificationStatusEnum**](#Enum--NotificationStatusEnum) | The status of the notification response. |  |
| **notificationText** | **String** | The localized display text of the user's response (e.g. \"Yes\"). |  [optional] |


## Enum: NotificationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACCEPTED | &quot;Accepted&quot; | 
| DECLINED | &quot;Declined&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
