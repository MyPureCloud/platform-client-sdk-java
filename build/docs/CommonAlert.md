---
title: CommonAlert
---
## CommonAlert


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who created the rule that triggered the alert. |  |
| **rule** | <!----><!---->[**AlertRuleProperties**](AlertRuleProperties.html)<!----> | The properties of the rule that triggered the alert. |  |
| **notifications** | <!----><!---->[**List&lt;AlertNotification&gt;**](AlertNotification.html)<!----> | The collection of notification methods and the ids of users who were notified by those methods. |  |
| **dateStart** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the alert was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateEnd** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the alert ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> | Indicates if an alert is currently active. |  |
| **unread** | <!----><!---->**Boolean**<!----> | Indicates if an alert has not been read. |  |
| **waitBetweenNotificationMs** | <!----><!---->**Long**<!----> | The amount of time to wait between notification. Time is in milliseconds. |  |
| **muted** | <!----><!---->**Boolean**<!----> | Flag indicating if the alert is in a muted state. |  |
| **snoozed** | <!----><!---->**Boolean**<!----> | Flag indicating if the alert is in a snoozed state. |  |
| **dateMutedUntil** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp of when the mute status of the alert should end. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateSnoozedUntil** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp of when the snooze status of the alert should end. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **conditions** | <!----><!---->[**CommonRuleConditions**](CommonRuleConditions.html)<!----> | The conditions that make up the rule. |  |
| **conversationId** | <!----><!---->**String**<!----> | The id of the conversation instance that caused the alert to trigger. |  [optional] |
| **alertSummary** | <!----><!---->[**AlertSummary**](AlertSummary.html)<!----> | Summary of the alert status of the entities defined in the conditions.  Is set when rule has instance-based or team member based rule predicates |  [optional] |
| **ruleUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



