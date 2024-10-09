# AlertNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **recipient** | **String** | The entity to receive the notification. |  |
| **notificationTypes** | [**List<NotificationTypesEnum>**](#Enum--NotificationTypesEnum) | The notification types the user will receive. |  |
| **locale** | **String** | The locale whose language will be used when sending alerts.  Locale should be in theformat language_COUNTRY where language is always lower case and country is always upper case. |  [optional] |


## Enum: NotificationTypesEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;Sms&quot; |
| DEVICE | &quot;Device&quot; |
| EMAIL | &quot;Email&quot; |
| PUSH | &quot;Push&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
