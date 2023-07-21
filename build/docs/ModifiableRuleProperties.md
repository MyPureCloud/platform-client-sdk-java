---
title: ModifiableRuleProperties
---
## ModifiableRuleProperties


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | Name of the rule |  |
| **description** | <!----><!---->**String**<!----> | The description of the rule. |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | Indicates if the rule is enabled. |  [optional] |
| **notifications** | <!----><!---->[**List&lt;AlertNotification&gt;**](AlertNotification.html)<!----> | The alert notification types to trigger when alarm state changes as well as the users they will be sent to. |  [optional] |
| **sendExitingAlarmNotifications** | <!----><!---->**Boolean**<!----> | Indicates if the alert will send a notification when it is closed. |  [optional] |
| **waitBetweenNotificationMs** | <!----><!---->**Long**<!----> | The amount of time in milliseconds to wait between notification. |  [optional] |
| **conditions** | <!----><!---->[**CommonRuleConditions**](CommonRuleConditions.html)<!----> | The set of metric conditions that would trigger an alert. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



