# V2MobiusRulesTopicRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **userId** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **notifications** | [**List&lt;V2MobiusRulesTopicAlertNotification&gt;**](V2MobiusRulesTopicAlertNotification) |  |  [optional] |
| **conditions** | [**V2MobiusRulesTopicCondition**](V2MobiusRulesTopicCondition) |  |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **inAlarm** | **Boolean** |  |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) |  |  [optional] |
| **dateCreated** | [**Date**](Date) |  |  [optional] |
| **sendExitingAlarmNotification** | **Boolean** |  |  [optional] |
| **waitBetweenNotificationMs** | **Integer** |  |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONVERSATIONMETRICS | &quot;ConversationMetrics&quot; | 
| USERPRESENCE | &quot;UserPresence&quot; | 
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| CREATE | &quot;CREATE&quot; | 
| UPDATE | &quot;UPDATE&quot; | 
| DELETE | &quot;DELETE&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
