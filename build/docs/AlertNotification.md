---
title: AlertNotification
---
## AlertNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **recipient** | <!----><!---->**String**<!----> | The entity to receive the notification. |  |
| **notificationTypes** | <!---->[**List&lt;NotificationTypesEnum&gt;**](#NotificationTypesEnum)<!----> | The notification types the user will receive. |  |
| **locale** | <!----><!---->**String**<!----> | The locale whose language will be used when sending alerts.  Locale should be in theformat language_COUNTRY where language is always lower case and country is always upper case. |  [optional] |
{: class="table table-striped"}


<a name="NotificationTypesEnum"></a>

## Enum: NotificationTypesEnum

| Name | Value |
| ---- | ----- |
| SMS | &quot;Sms&quot; |
| DEVICE | &quot;Device&quot; |
| EMAIL | &quot;Email&quot; |
| PUSH | &quot;Push&quot; |
{: class="table table-striped"}



