---
title: VoicemailOrganizationPolicy
---
## VoicemailOrganizationPolicy


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether voicemail is enable for this organization |  [optional] |
| **alertTimeoutSeconds** | <!----><!---->**Integer**<!----> | The organization&#39;s default number of seconds to ring a user&#39;s phone before a call is transfered to voicemail |  [optional] |
| **pinConfiguration** | <!----><!---->[**PINConfiguration**](PINConfiguration.html)<!----> | The configuration for user PINs to access their voicemail from a phone |  [optional] |
| **voicemailExtension** | <!----><!---->**String**<!----> | The extension for voicemail retrieval.  The default value is *86. |  [optional] |
| **pinRequired** | <!----><!---->**Boolean**<!----> | If this is true, a PIN is required when accessing a user&#39;s voicemail from a phone. |  [optional] |
| **sendEmailNotifications** | <!----><!---->**Boolean**<!----> | Whether email notifications are sent for new voicemails in the organization. If false, new voicemail email notifications are not be sent for the organization overriding any user or group setting. |  [optional] |
| **modifiedDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the policy was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}



