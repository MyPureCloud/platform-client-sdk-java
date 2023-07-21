---
title: CommonAlertBulkUpdateRequest
---
## CommonAlertBulkUpdateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The action to take |  |
| **alertIds** | <!----><!---->**List&lt;String&gt;**<!----> | The user supplied alert ids to be muted |  |
| **muteSnooze** | <!----><!---->[**MuteSnoozeFields**](MuteSnoozeFields.html)<!----> | The fields need for a mute or snooze requests |  [optional] |
| **unread** | <!----><!---->[**UnreadFields**](UnreadFields.html)<!----> | The fields need for an unread update requests |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MUTE | &quot;Mute&quot; | 
| SNOOZE | &quot;Snooze&quot; | 
| UNREAD | &quot;Unread&quot; | 
{: class="table table-striped"}



