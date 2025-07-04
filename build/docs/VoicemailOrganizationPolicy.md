# VoicemailOrganizationPolicy


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether voicemail is enabled for this organization |  [optional] |
| **alertTimeoutSeconds** | **Integer** | The organization's default number of seconds to ring a user's phone before a call is transferred to voicemail |  [optional] |
| **pinConfiguration** | [**PINConfiguration**](PINConfiguration) | The configuration for user PINs to access their voicemail from a phone |  [optional] |
| **voicemailExtension** | **String** | The extension for voicemail retrieval.  The default value is *86. |  [optional] |
| **pinRequired** | **Boolean** | If this is true, a PIN is required when accessing a user's voicemail from a phone. |  [optional] |
| **interactiveResponseRequired** | **Boolean** | Whether user should be prompted with a confirmation prompt when connecting to a Group Ring call |  [optional] |
| **sendEmailNotifications** | **Boolean** | Whether email notifications are sent for new voicemails in the organization. If false, new voicemail email notifications are not be sent for the organization overriding any user or group setting. |  [optional] |
| **includeEmailTranscriptions** | **Boolean** | Whether to include the voicemail transcription in the notification email |  [optional] |
| **disableEmailPii** | **Boolean** | Removes any PII from emails. This overrides any analogous group configuration value. This is always true if HIPAA is enabled or unknown for an organization. |  [optional] |
| **maximumRecordingTimeSeconds** | **Integer** | Default value for the maximum length of time in seconds of a recorded voicemail |  [optional] |
| **modifiedDate** | [**Date**](Date) | The date the policy was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
