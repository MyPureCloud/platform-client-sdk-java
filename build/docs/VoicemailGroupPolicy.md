---
title: VoicemailGroupPolicy
---
## VoicemailGroupPolicy


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** |  |  [optional] |
| **group** | [**Group**](Group.html) | The group associated with the policy |  [optional] |
| **enabled** | **Boolean** | Whether voicemail is enabled for the group |  [optional] |
| **sendEmailNotifications** | **Boolean** | Whether email notifications are sent to group members when a new voicemail is received |  [optional] |
| **rotateCallsSecs** | **Integer** | How many seconds to ring before rotating to the next member in the group |  [optional] |
| **stopRingingAfterRotations** | **Integer** | How many rotations to go through |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


