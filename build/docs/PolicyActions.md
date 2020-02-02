---
title: PolicyActions
---
## PolicyActions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **retainRecording** | <!----><!---->**Boolean**<!----> | true to retain the recording associated with the conversation. Default = true |  [optional] |
| **deleteRecording** | <!----><!---->**Boolean**<!----> | true to delete the recording associated with the conversation. If retainRecording = true, this will be ignored. Default = false |  [optional] |
| **alwaysDelete** | <!----><!---->**Boolean**<!----> | true to delete the recording associated with the conversation regardless of the values of retainRecording or deleteRecording. Default = false |  [optional] |
| **assignEvaluations** | <!----><!---->[**List&lt;EvaluationAssignment&gt;**](EvaluationAssignment.html)<!----> |  |  [optional] |
| **assignMeteredEvaluations** | <!----><!---->[**List&lt;MeteredEvaluationAssignment&gt;**](MeteredEvaluationAssignment.html)<!----> |  |  [optional] |
| **assignMeteredAssignmentByAgent** | <!----><!---->[**List&lt;MeteredAssignmentByAgent&gt;**](MeteredAssignmentByAgent.html)<!----> |  |  [optional] |
| **assignCalibrations** | <!----><!---->[**List&lt;CalibrationAssignment&gt;**](CalibrationAssignment.html)<!----> |  |  [optional] |
| **assignSurveys** | <!----><!---->[**List&lt;SurveyAssignment&gt;**](SurveyAssignment.html)<!----> |  |  [optional] |
| **retentionDuration** | <!----><!---->[**RetentionDuration**](RetentionDuration.html)<!----> |  |  [optional] |
| **initiateScreenRecording** | <!----><!---->[**InitiateScreenRecording**](InitiateScreenRecording.html)<!----> |  |  [optional] |
| **mediaTranscriptions** | <!----><!---->[**List&lt;MediaTranscription&gt;**](MediaTranscription.html)<!----> |  |  [optional] |
| **integrationExport** | <!----><!---->[**IntegrationExport**](IntegrationExport.html)<!----> | Policy action for exporting recordings using an integration to 3rd party s3. |  [optional] |
{: class="table table-striped"}



