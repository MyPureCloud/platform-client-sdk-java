---
title: VoicemailUserPolicy
---
## VoicemailUserPolicy


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether the user has voicemail enabled |  [optional] |
| **alertTimeoutSeconds** | <!----><!---->**Integer**<!----> | The number of seconds to ring the user's phone before a call is transfered to voicemail |  [optional] |
| **pin** | <!----><!---->**String**<!----> | The user's PIN to access their voicemail. This property is only used for updates and never provided otherwise to ensure security |  [optional] |
| **modifiedDate** | <!----><!---->[**Date**](Date.html)<!----> | The date the policy was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **sendEmailNotifications** | <!----><!---->**Boolean**<!----> | Whether email notifications are sent to the user when a new voicemail is received |  [optional] |
{: class="table table-striped"}



