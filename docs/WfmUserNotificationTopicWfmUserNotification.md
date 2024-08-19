# WfmUserNotificationTopicWfmUserNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **mutableGroupId** | **String** |  |  [optional] |
| **timestamp** | [**Date**](Date) |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **shiftTrade** | [**WfmUserNotificationTopicShiftTradeNotification**](WfmUserNotificationTopicShiftTradeNotification) |  |  [optional] |
| **timeOffRequest** | [**WfmUserNotificationTopicTimeOffRequestNotification**](WfmUserNotificationTopicTimeOffRequestNotification) |  |  [optional] |
| **adherenceExplanation** | [**WfmUserNotificationTopicAdherenceExplanationNotification**](WfmUserNotificationTopicAdherenceExplanationNotification) |  |  [optional] |
| **alternativeShift** | [**WfmUserNotificationTopicAlternativeShiftNotification**](WfmUserNotificationTopicAlternativeShiftNotification) |  |  [optional] |
| **agentNotification** | **Boolean** |  |  [optional] |
| **otherNotificationIdsInGroup** | **List&lt;String&gt;** |  |  [optional] |
| **markedAsRead** | **Boolean** |  |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SHIFTTRADE | &quot;ShiftTrade&quot; | 
| TIMEOFFREQUEST | &quot;TimeOffRequest&quot; | 
| ADHERENCEEXPLANATION | &quot;AdherenceExplanation&quot; | 
| ALTERNATIVESHIFT | &quot;AlternativeShift&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
