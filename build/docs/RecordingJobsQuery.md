---
title: RecordingJobsQuery
---
## RecordingJobsQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#ActionEnum)<!----> | Operation to perform bulk task. The date when the action will be performed can either be specified as an absolute date for all recordings with the actionDate/screenRecordingActionDate parameters, or as the number of days after each recording's creation time with the actionAge/screenRecordingActionAge parameters. If the operation will cause the delete date of a recording to be older than the export date, the export date will be adjusted to the delete date. |  |
| **actionDate** | <!----><!---->[**Date**](Date.html)<!----> | The date when the action will be performed. If screenRecordingActionDate is also provided, this value is only used for non-screen recordings. Otherwise this value is used for all recordings. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **integrationId** | <!----><!---->**String**<!----> | IntegrationId to Access AWS S3 bucket for bulk recording exports. This field is required and used only for EXPORT action. |  [optional] |
| **includeScreenRecordings** | <!----><!---->**Boolean**<!----> | Whether to include Screen recordings for the action, default value = true  |  [optional] |
| **conversationQuery** | <!----><!---->[**AsyncConversationQuery**](AsyncConversationQuery.html)<!----> | Conversation Query. Note: After the recording is created, it might take up to 48 hours for the recording to be included in the submitted job query.  This result depends on the analytics data lake job completion. See also: https://developer.genesys.cloud/analyticsdatamanagement/analytics/jobs/conversation-details-job#data-availability |  |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DELETE | &quot;DELETE&quot; | 
| EXPORT | &quot;EXPORT&quot; | 
{: class="table table-striped"}



