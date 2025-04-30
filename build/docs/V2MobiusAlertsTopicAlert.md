# V2MobiusAlertsTopicAlert


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **rule** | [**V2MobiusAlertsTopicAlertRuleProperties**](V2MobiusAlertsTopicAlertRuleProperties) |  |  [optional] |
| **id** | **String** |  |  [optional] |
| **userId** | **String** |  |  [optional] |
| **notifications** | [**List&lt;V2MobiusAlertsTopicAlertNotification&gt;**](V2MobiusAlertsTopicAlertNotification) |  |  [optional] |
| **dateStart** | [**Date**](Date) |  |  [optional] |
| **dateEnd** | [**Date**](Date) |  |  [optional] |
| **conditions** | [**V2MobiusAlertsTopicCondition**](V2MobiusAlertsTopicCondition) |  |  [optional] |
| **additionalProperties** | **Map&lt;String, String&gt;** |  |  [optional] |
| **active** | **Boolean** |  |  [optional] |
| **unread** | **Boolean** |  |  [optional] |
| **muted** | **Boolean** |  |  [optional] |
| **snoozed** | **Boolean** |  |  [optional] |
| **dateMutedUntil** | [**Date**](Date) |  |  [optional] |
| **dateSnoozedUntil** | [**Date**](Date) |  |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) |  |  [optional] |
| **alertSummary** | [**V2MobiusAlertsTopicAlertSummary**](V2MobiusAlertsTopicAlertSummary) |  |  [optional] |
| **sendExitingAlarmNotification** | **Boolean** |  |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
