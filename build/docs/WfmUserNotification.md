---
title: WfmUserNotification
---
## WfmUserNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The immutable globally unique identifier for the object. |  |
| **mutableGroupId** | <!----><!---->**String**<!----> | The group ID of the notification (mutable, may change  on update) |  |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp for this notification. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of this notification |  [optional] |
| **shiftTrade** | <!----><!---->[**ShiftTradeNotification**](ShiftTradeNotification.html)<!----> | A shift trade notification.  Only set if type == ShiftTrade |  [optional] |
| **timeOffRequest** | <!----><!---->[**TimeOffRequestNotification**](TimeOffRequestNotification.html)<!----> | A time off request notification.  Only set if type == TimeOffRequest |  [optional] |
| **adherenceExplanation** | <!----><!---->[**AdherenceExplanationNotification**](AdherenceExplanationNotification.html)<!----> | An adherence explanation notification.  Only set if type == AdherenceExplanation |  [optional] |
| **markedAsRead** | <!----><!---->**Boolean**<!----> | Whether this notification has been marked \"read\" |  |
| **agentNotification** | <!----><!---->**Boolean**<!----> | Whether this notification is for an agent |  [optional] |
| **otherNotificationIdsInGroup** | <!----><!---->**List&lt;String&gt;**<!----> | Other notification IDs in group.  This field is only populated in real-time notifications |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ADHERENCEEXPLANATION | &quot;AdherenceExplanation&quot; | 
| SHIFTTRADE | &quot;ShiftTrade&quot; | 
| TIMEOFFREQUEST | &quot;TimeOffRequest&quot; | 
{: class="table table-striped"}



