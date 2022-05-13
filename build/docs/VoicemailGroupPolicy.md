---
title: VoicemailGroupPolicy
---
## VoicemailGroupPolicy


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **group** | <!----><!---->[**Group**](Group.html)<!----> | The group associated with the policy |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether voicemail is enabled for the group |  [optional] |
| **sendEmailNotifications** | <!----><!---->**Boolean**<!----> | Whether email notifications are sent to group members when a new voicemail is received |  [optional] |
| **disableEmailPii** | <!----><!---->**Boolean**<!----> | Removes any PII from group emails. This is overridden by the analogous organization configuration value. This is always true if HIPAA is enabled or unknown for an organization. |  [optional] |
| **rotateCallsSecs** | <!----><!---->**Integer**<!----> | How many seconds to ring before rotating to the next member in the group |  [optional] |
| **stopRingingAfterRotations** | <!----><!---->**Integer**<!----> | How many rotations to go through |  [optional] |
| **overflowGroupId** | <!----><!---->**String**<!----> | A fallback group to contact when all of the members in this group did not answer the call. |  [optional] |
| **groupAlertType** | [**GroupAlertTypeEnum**](#GroupAlertTypeEnum)<!----> | Specifies if the members in this group should be contacted randomly, in a specific order, or by round-robin. |  [optional] |
| **interactiveResponsePromptId** | <!----><!---->**String**<!----> | The prompt to use when connecting a user to a Group Ring call |  [optional] |
{: class="table table-striped"}


<a name="GroupAlertTypeEnum"></a>

## Enum: GroupAlertTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANDOM | &quot;RANDOM&quot; | 
| ROUND_ROBIN | &quot;ROUND_ROBIN&quot; | 
| SEQUENTIAL | &quot;SEQUENTIAL&quot; | 
{: class="table table-striped"}



