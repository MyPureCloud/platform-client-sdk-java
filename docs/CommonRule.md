# CommonRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Name of the rule |  |
| **description** | **String** | The description of the rule. |  [optional] |
| **enabled** | **Boolean** | Indicates if the rule is enabled. |  [optional] |
| **notifications** | [**List&lt;AlertNotification&gt;**](AlertNotification) | The alert notification types to trigger when alarm state changes as well as the users they will be sent to. |  [optional] |
| **sendExitingAlarmNotifications** | **Boolean** | Indicates if the alert will send a notification when it is closed. |  [optional] |
| **waitBetweenNotificationMs** | **Long** | The amount of time in milliseconds to wait between notification. |  [optional] |
| **conditions** | [**CommonRuleConditions**](CommonRuleConditions) | The set of metric conditions that would trigger an alert. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the rule. |  |
| **inAlarm** | **Boolean** | Indicates if the rule is in alarm state. |  [optional] |
| **user** | [**UserReference**](UserReference) | The entity that created the rule. |  [optional] |
| **version** | **Integer** | The current version number of the rule. |  [optional] |
| **dateCreated** | [**Date**](Date) | The creation date of the rule when the rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateLastModified** | [**Date**](Date) | The timestamp of the last update to the rule. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONVERSATIONMETRICS | &quot;ConversationMetrics&quot; | 
| USERPRESENCE | &quot;UserPresence&quot; | 
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; | 
| OPERATIONALCONSOLE | &quot;OperationalConsole&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
