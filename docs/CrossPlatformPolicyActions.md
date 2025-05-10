# CrossPlatformPolicyActions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **retainRecording** | **Boolean** | true to retain the recording associated with the conversation. Default = true |  [optional] |
| **deleteRecording** | **Boolean** | true to delete the recording associated with the conversation. If retainRecording = true, this will be ignored. Default = false |  [optional] |
| **alwaysDelete** | **Boolean** | true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default = false |  [optional] |
| **assignEvaluations** | [**List&lt;EvaluationAssignment&gt;**](EvaluationAssignment) |  |  [optional] |
| **assignMeteredEvaluations** | [**List&lt;MeteredEvaluationAssignment&gt;**](MeteredEvaluationAssignment) |  |  [optional] |
| **assignMeteredAssignmentByAgent** | [**List&lt;MeteredAssignmentByAgent&gt;**](MeteredAssignmentByAgent) |  |  [optional] |
| **assignCalibrations** | [**List&lt;CalibrationAssignment&gt;**](CalibrationAssignment) |  |  [optional] |
| **retentionDuration** | [**RetentionDuration**](RetentionDuration) |  |  [optional] |
| **mediaTranscriptions** | [**List&lt;MediaTranscription&gt;**](MediaTranscription) |  |  [optional] |
| **integrationExport** | [**IntegrationExport**](IntegrationExport) | Policy action for exporting recordings using an integration to 3rd party s3. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:225.0.0_
