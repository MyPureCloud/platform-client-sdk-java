# ConversationContentPush


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **deviceType** | [**DeviceTypeEnum**](#Enum--DeviceTypeEnum) | The device type used to send the push notification |  |
| **deviceTokenId** | **String** | Unique Id of the device token |  |
| **deviceToken** | **String** | device token from the notification provider |  |
| **failedMessages** | [**List&lt;ConversationPushFailedMessageReferences&gt;**](ConversationPushFailedMessageReferences) | MessageIds failed to be sent which trigger the push event |  |
| **notificationMessage** | [**ConversationPushNotificationMessageLabel**](ConversationPushNotificationMessageLabel) | Title and body localized according to deployment |  |
| **pushProviderIntegration** | [**ConversationPushProviderIntegration**](ConversationPushProviderIntegration) | Push provider integrations details configured on the deployment |  |
| **expiration** | **Long** | The time to live of the pushed message |  |


## Enum: DeviceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ANDROID | &quot;Android&quot; | 
| IOS | &quot;IOS&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
