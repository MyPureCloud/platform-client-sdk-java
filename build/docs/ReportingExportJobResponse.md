---
title: ReportingExportJobResponse
---
## ReportingExportJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The current status of the export request |  |
| **timeZone** | <!----><!---->**String**<!----> | The requested timezone of the exported data. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  |
| **exportFormat** | [**ExportFormatEnum**](#ExportFormatEnum)<!----> | The requested format of the exported data |  |
| **interval** | <!----><!---->**String**<!----> | The time period used to limit the the exported data. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **downloadUrl** | <!----><!---->**String**<!----> | The url to download the request if it&#39;s status is completed |  [optional] |
| **viewType** | [**ViewTypeEnum**](#ViewTypeEnum)<!----> | The type of view export job to be created |  |
| **exportErrorMessagesType** | [**ExportErrorMessagesTypeEnum**](#ExportErrorMessagesTypeEnum)<!----> | The error message in case the export request failed |  [optional] |
| **period** | <!----><!---->**String**<!----> | The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  |
| **filter** | <!----><!---->[**ViewFilter**](ViewFilter.html)<!----> | Filters to apply to create the view |  |
| **read** | <!----><!---->**Boolean**<!----> | Indicates if the request has been marked as read |  |
| **createdDateTime** | <!----><!---->[**Date**](Date.html)<!----> | The created date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  |
| **modifiedDateTime** | <!----><!---->[**Date**](Date.html)<!----> | The last modified date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  |
| **locale** | <!----><!---->**String**<!----> | The locale use for localization of the exported data, i.e. en-us, es-mx   |  |
| **percentageComplete** | <!----><!---->**Double**<!----> | The percentage of the job that has completed processing |  |
| **hasFormatDurations** | <!----><!---->**Boolean**<!----> | Indicates if durations are formatted in hh:mm:ss format instead of ms |  [optional] |
| **hasSplitFilters** | <!----><!---->**Boolean**<!----> | Indicates if filters will be split in aggregate detail exports |  [optional] |
| **excludeEmptyRows** | <!----><!---->**Boolean**<!----> | Excludes empty rows from the exports |  [optional] |
| **hasSplitByMedia** | <!----><!---->**Boolean**<!----> | Indicates if media type will be split in aggregate detail exports |  [optional] |
| **selectedColumns** | <!----><!---->[**List&lt;SelectedColumns&gt;**](SelectedColumns.html)<!----> | The list of ordered selected columns from the export view by the user |  [optional] |
| **hasCustomParticipantAttributes** | <!----><!---->**Boolean**<!----> | Indicates if custom participant attributes will be exported |  [optional] |
| **recipientEmails** | <!----><!---->**List&lt;String&gt;**<!----> | The list of email recipients for the exports |  [optional] |
| **emailStatuses** | <!---->[**Map&lt;String, String&gt;**](#InnerEnum)<!----> | The status of individual email addresses as a map |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SUBMITTED | &quot;SUBMITTED&quot; |
| RUNNING | &quot;RUNNING&quot; |
| CANCELLING | &quot;CANCELLING&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| COMPLETED_WITH_PARTIAL_RESULTS | &quot;COMPLETED_WITH_PARTIAL_RESULTS&quot; |
| FAILED | &quot;FAILED&quot; |
{: class="table table-striped"}


<a name="ExportFormatEnum"></a>

## Enum: ExportFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CSV | &quot;CSV&quot; |
| PDF | &quot;PDF&quot; |
{: class="table table-striped"}


<a name="ViewTypeEnum"></a>

## Enum: ViewTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUE_PERFORMANCE_SUMMARY_VIEW | &quot;QUEUE_PERFORMANCE_SUMMARY_VIEW&quot; |
| QUEUE_PERFORMANCE_DETAIL_VIEW | &quot;QUEUE_PERFORMANCE_DETAIL_VIEW&quot; |
| INTERACTION_SEARCH_VIEW | &quot;INTERACTION_SEARCH_VIEW&quot; |
| AGENT_PERFORMANCE_SUMMARY_VIEW | &quot;AGENT_PERFORMANCE_SUMMARY_VIEW&quot; |
| AGENT_PERFORMANCE_DETAIL_VIEW | &quot;AGENT_PERFORMANCE_DETAIL_VIEW&quot; |
| AGENT_STATUS_SUMMARY_VIEW | &quot;AGENT_STATUS_SUMMARY_VIEW&quot; |
| AGENT_STATUS_DETAIL_VIEW | &quot;AGENT_STATUS_DETAIL_VIEW&quot; |
| AGENT_EVALUATION_SUMMARY_VIEW | &quot;AGENT_EVALUATION_SUMMARY_VIEW&quot; |
| AGENT_EVALUATION_DETAIL_VIEW | &quot;AGENT_EVALUATION_DETAIL_VIEW&quot; |
| AGENT_QUEUE_DETAIL_VIEW | &quot;AGENT_QUEUE_DETAIL_VIEW&quot; |
| AGENT_INTERACTION_DETAIL_VIEW | &quot;AGENT_INTERACTION_DETAIL_VIEW&quot; |
| ABANDON_INSIGHTS_VIEW | &quot;ABANDON_INSIGHTS_VIEW&quot; |
| SKILLS_PERFORMANCE_VIEW | &quot;SKILLS_PERFORMANCE_VIEW&quot; |
| SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW | &quot;SURVEY_FORM_PERFORMANCE_SUMMARY_VIEW&quot; |
| SURVEY_FORM_PERFORMANCE_DETAIL_VIEW | &quot;SURVEY_FORM_PERFORMANCE_DETAIL_VIEW&quot; |
| DNIS_PERFORMANCE_SUMMARY_VIEW | &quot;DNIS_PERFORMANCE_SUMMARY_VIEW&quot; |
| DNIS_PERFORMANCE_DETAIL_VIEW | &quot;DNIS_PERFORMANCE_DETAIL_VIEW&quot; |
| WRAP_UP_PERFORMANCE_SUMMARY_VIEW | &quot;WRAP_UP_PERFORMANCE_SUMMARY_VIEW&quot; |
| AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW | &quot;AGENT_WRAP_UP_PERFORMANCE_DETAIL_VIEW&quot; |
| QUEUE_ACTIVITY_SUMMARY_VIEW | &quot;QUEUE_ACTIVITY_SUMMARY_VIEW&quot; |
| QUEUE_ACTIVITY_DETAIL_VIEW | &quot;QUEUE_ACTIVITY_DETAIL_VIEW&quot; |
| AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW | &quot;AGENT_QUEUE_ACTIVITY_SUMMARY_VIEW&quot; |
| QUEUE_AGENT_DETAIL_VIEW | &quot;QUEUE_AGENT_DETAIL_VIEW&quot; |
| QUEUE_INTERACTION_DETAIL_VIEW | &quot;QUEUE_INTERACTION_DETAIL_VIEW&quot; |
| AGENT_SCHEDULE_DETAIL_VIEW | &quot;AGENT_SCHEDULE_DETAIL_VIEW&quot; |
| IVR_PERFORMANCE_SUMMARY_VIEW | &quot;IVR_PERFORMANCE_SUMMARY_VIEW&quot; |
| IVR_PERFORMANCE_DETAIL_VIEW | &quot;IVR_PERFORMANCE_DETAIL_VIEW&quot; |
| ANSWER_INSIGHTS_VIEW | &quot;ANSWER_INSIGHTS_VIEW&quot; |
| HANDLE_INSIGHTS_VIEW | &quot;HANDLE_INSIGHTS_VIEW&quot; |
| TALK_INSIGHTS_VIEW | &quot;TALK_INSIGHTS_VIEW&quot; |
| HOLD_INSIGHTS_VIEW | &quot;HOLD_INSIGHTS_VIEW&quot; |
| ACW_INSIGHTS_VIEW | &quot;ACW_INSIGHTS_VIEW&quot; |
| WAIT_INSIGHTS_VIEW | &quot;WAIT_INSIGHTS_VIEW&quot; |
| AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW | &quot;AGENT_WRAP_UP_PERFORMANCE_INTERVAL_DETAIL_VIEW&quot; |
| FLOW_OUTCOME_SUMMARY_VIEW | &quot;FLOW_OUTCOME_SUMMARY_VIEW&quot; |
| FLOW_OUTCOME_PERFORMANCE_DETAIL_VIEW | &quot;FLOW_OUTCOME_PERFORMANCE_DETAIL_VIEW&quot; |
| FLOW_OUTCOME_PERFORMANCE_INTERVAL_DETAIL_VIEW | &quot;FLOW_OUTCOME_PERFORMANCE_INTERVAL_DETAIL_VIEW&quot; |
| FLOW_DESTINATION_SUMMARY_VIEW | &quot;FLOW_DESTINATION_SUMMARY_VIEW&quot; |
| FLOW_DESTINATION_DETAIL_VIEW | &quot;FLOW_DESTINATION_DETAIL_VIEW&quot; |
| API_USAGE_VIEW | &quot;API_USAGE_VIEW&quot; |
{: class="table table-striped"}


<a name="ExportErrorMessagesTypeEnum"></a>

## Enum: ExportErrorMessagesTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| FAILED_CONVERTING_EXPORT_JOB | &quot;FAILED_CONVERTING_EXPORT_JOB&quot; |
| FAILED_NO_DATA_EXPORT_JOB_FOUND | &quot;FAILED_NO_DATA_EXPORT_JOB_FOUND&quot; |
| FAILED_GETTING_DATA_FROM_SERVICE | &quot;FAILED_GETTING_DATA_FROM_SERVICE&quot; |
| FAILED_GENERATING_TEMP_FILE | &quot;FAILED_GENERATING_TEMP_FILE&quot; |
| FAILED_SAVING_FILE_TO_S3 | &quot;FAILED_SAVING_FILE_TO_S3&quot; |
| FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD | &quot;FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD&quot; |
| FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE | &quot;FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE&quot; |
| FAILED_CONVERTING_EXPORT_JOB_TO_QUEUE_PERFORMANCE_JOB | &quot;FAILED_CONVERTING_EXPORT_JOB_TO_QUEUE_PERFORMANCE_JOB&quot; |
| EXPORT_TYPE_NOT_IMPLEMENTED | &quot;EXPORT_TYPE_NOT_IMPLEMENTED&quot; |
| REACHED_MAXIMUM_ATTEMPT_OF_RETRY | &quot;REACHED_MAXIMUM_ATTEMPT_OF_RETRY&quot; |
| FAILED_LONG_RUNNING_EXPORT | &quot;FAILED_LONG_RUNNING_EXPORT&quot; |
| TOO_MANY_REQUESTS_FROM_AN_ORGANIZATION | &quot;TOO_MANY_REQUESTS_FROM_AN_ORGANIZATION&quot; |
{: class="table table-striped"}


<a name="InnerEnum"></a>

## Enum: InnerEnum

| Name | Value |
| ---- | ----- |
| SENT | &quot;Sent&quot; |
| PENDING | &quot;Pending&quot; |
| FAILED | &quot;Failed&quot; |
{: class="table table-striped"}



