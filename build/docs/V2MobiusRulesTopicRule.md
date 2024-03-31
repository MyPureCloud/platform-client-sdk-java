---
title: V2MobiusRulesTopicRule
---
## V2MobiusRulesTopicRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **userId** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **notifications** | <!----><!---->[**List&lt;V2MobiusRulesTopicAlertNotification&gt;**](V2MobiusRulesTopicAlertNotification.html)<!----> |  |  [optional] |
| **conditions** | <!----><!---->[**V2MobiusRulesTopicCondition**](V2MobiusRulesTopicCondition.html)<!----> |  |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **inAlarm** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum)<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **sendExitingAlarmNotification** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **waitBetweenNotificationMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONVERSATIONMETRICS | &quot;ConversationMetrics&quot; | 
| USERPRESENCE | &quot;UserPresence&quot; | 
| WORKFORCEMANAGEMENT | &quot;WorkforceManagement&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
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
{: class="table table-striped"}



