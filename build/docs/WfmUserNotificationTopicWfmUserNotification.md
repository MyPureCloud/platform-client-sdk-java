---
title: WfmUserNotificationTopicWfmUserNotification
---
## WfmUserNotificationTopicWfmUserNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **mutableGroupId** | <!----><!---->**String**<!----> |  |  [optional] |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **shiftTrade** | <!----><!---->[**WfmUserNotificationTopicShiftTradeNotification**](WfmUserNotificationTopicShiftTradeNotification.html)<!----> |  |  [optional] |
| **timeOffRequest** | <!----><!---->[**WfmUserNotificationTopicTimeOffRequestNotification**](WfmUserNotificationTopicTimeOffRequestNotification.html)<!----> |  |  [optional] |
| **adherenceExplanation** | <!----><!---->[**WfmUserNotificationTopicAdherenceExplanationNotification**](WfmUserNotificationTopicAdherenceExplanationNotification.html)<!----> |  |  [optional] |
| **agentNotification** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **otherNotificationIdsInGroup** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **markedAsRead** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SHIFTTRADE | &quot;ShiftTrade&quot; | 
| TIMEOFFREQUEST | &quot;TimeOffRequest&quot; | 
| ADHERENCEEXPLANATION | &quot;AdherenceExplanation&quot; | 
{: class="table table-striped"}



