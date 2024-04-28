---
title: V2MobiusAlertsTopicAlert
---
## V2MobiusAlertsTopicAlert


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **rule** | <!----><!---->[**V2MobiusAlertsTopicAlertRuleProperties**](V2MobiusAlertsTopicAlertRuleProperties.html)<!----> |  |  [optional] |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **userId** | <!----><!---->**String**<!----> |  |  [optional] |
| **notifications** | <!----><!---->[**List&lt;V2MobiusAlertsTopicAlertNotification&gt;**](V2MobiusAlertsTopicAlertNotification.html)<!----> |  |  [optional] |
| **dateStart** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **dateEnd** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **conditions** | <!----><!---->[**V2MobiusAlertsTopicCondition**](V2MobiusAlertsTopicCondition.html)<!----> |  |  [optional] |
| **additionalProperties** | <!----><!---->**Map&lt;String, String&gt;**<!----> |  |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **unread** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **muted** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **snoozed** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **dateMutedUntil** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **dateSnoozedUntil** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum)<!----> |  |  [optional] |
| **alertSummary** | <!----><!---->[**V2MobiusAlertsTopicAlertSummary**](V2MobiusAlertsTopicAlertSummary.html)<!----> |  |  [optional] |
| **sendExitingAlarmNotification** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| CREATE | &quot;CREATE&quot; | 
| UPDATE | &quot;UPDATE&quot; | 
| DELETE | &quot;DELETE&quot; | 
| CLOSE | &quot;CLOSE&quot; | 
| RENOTIFY | &quot;RENOTIFY&quot; | 
| BULK_DELETE | &quot;BULK_DELETE&quot; | 
| BULK_UPDATE | &quot;BULK_UPDATE&quot; | 
| UNREAD_COUNT_UPDATE | &quot;UNREAD_COUNT_UPDATE&quot; | 
{: class="table table-striped"}



