# ReportingExportJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **runId** | **String** | The unique run id of the export schedule execute |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The current status of the export request |  |
| **timeZone** | **String** | The requested timezone of the exported data. Time zones are represented as a string of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London |  |
| **exportFormat** | [**ExportFormatEnum**](#Enum--ExportFormatEnum) | The requested format of the exported data |  |
| **interval** | **String** | The time period used to limit the the exported data. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  |
| **downloadUrl** | **String** | The url to download the request if it's status is completed |  [optional] |
| **viewType** | [**ViewTypeEnum**](#Enum--ViewTypeEnum) | The type of view export job to be created |  |
| **exportErrorMessagesType** | [**ExportErrorMessagesTypeEnum**](#Enum--ExportErrorMessagesTypeEnum) | The error message in case the export request failed |  [optional] |
| **period** | **String** | The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  |
| **filter** | [**ViewFilter**](ViewFilter) | Filters to apply to create the view |  |
| **read** | **Boolean** | Indicates if the request has been marked as read |  |
| **createdDateTime** | [**Date**](Date) | The created date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **modifiedDateTime** | [**Date**](Date) | The last modified date/time of the request. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **locale** | **String** | The locale use for localization of the exported data, i.e. en-us, es-mx   |  |
| **percentageComplete** | **Double** | The percentage of the job that has completed processing |  |
| **hasFormatDurations** | **Boolean** | Indicates if durations are formatted in hh:mm:ss format instead of ms |  [optional] |
| **hasSplitFilters** | **Boolean** | Indicates if filters will be split in aggregate detail exports |  [optional] |
| **excludeEmptyRows** | **Boolean** | Excludes empty rows from the exports |  [optional] |
| **hasSplitByMedia** | **Boolean** | Indicates if media type will be split in aggregate detail exports |  [optional] |
| **hasSummaryRow** | **Boolean** | Indicates if summary row needs to be present in exports |  [optional] |
| **csvDelimiter** | [**CsvDelimiterEnum**](#Enum--CsvDelimiterEnum) | The user supplied csv delimiter string value either of type 'comma' or 'semicolon' permitted for the export request |  [optional] |
| **selectedColumns** | [**List&lt;SelectedColumns&gt;**](SelectedColumns) | The list of ordered selected columns from the export view by the user |  [optional] |
| **hasCustomParticipantAttributes** | **Boolean** | Indicates if custom participant attributes will be exported |  [optional] |
| **recipientEmails** | **List&lt;String&gt;** | The list of email recipients for the exports |  [optional] |
| **emailStatuses** | [**Map<String, InnerEnum>**](#Enum--InnerEnum) | The status of individual email addresses as a map |  [optional] |
| **emailErrorDescription** | **String** | The optional error message in case the export fail to email |  [optional] |
| **includeDurationFormatInHeader** | **Boolean** | Indicates whether to include selected duration format to the column headers |  [optional] |
| **durationFormat** | [**DurationFormatEnum**](#Enum--DurationFormatEnum) | Indicates the duration format for the exports |  [optional] |
| **exportAllowedToRerun** | **Boolean** | Indicates whether the export run is allowed to rerun |  [optional] |
| **chartColumns** | [**List&lt;ChartColumn&gt;**](ChartColumn) | The list of columns for which chart is going to be displayed in export |  [optional] |
| **enabled** | **Boolean** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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


## Enum: ExportFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CSV | &quot;CSV&quot; | 
| PDF | &quot;PDF&quot; | 


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
| SCHEDULED_CALLBACKS_VIEW | &quot;SCHEDULED_CALLBACKS_VIEW&quot; | 
| CONTENT_SEARCH_VIEW | &quot;CONTENT_SEARCH_VIEW&quot; | 
| LANDING_PAGE | &quot;LANDING_PAGE&quot; | 
| DASHBOARD_SUMMARY | &quot;DASHBOARD_SUMMARY&quot; | 
| DASHBOARD_DETAIL | &quot;DASHBOARD_DETAIL&quot; | 
| DASHBOARD_USERS | &quot;DASHBOARD_USERS&quot; | 
| DASHBOARD_USERS_DETAIL | &quot;DASHBOARD_USERS_DETAIL&quot; | 
| JOURNEY_ACTION_MAP_SUMMARY_VIEW | &quot;JOURNEY_ACTION_MAP_SUMMARY_VIEW&quot; | 
| JOURNEY_OUTCOME_SUMMARY_VIEW | &quot;JOURNEY_OUTCOME_SUMMARY_VIEW&quot; | 
| JOURNEY_SEGMENT_SUMMARY_VIEW | &quot;JOURNEY_SEGMENT_SUMMARY_VIEW&quot; | 
| AGENT_DEVELOPMENT_DETAIL_VIEW | &quot;AGENT_DEVELOPMENT_DETAIL_VIEW&quot; | 
| AGENT_DEVELOPMENT_DETAIL_ME_VIEW | &quot;AGENT_DEVELOPMENT_DETAIL_ME_VIEW&quot; | 
| AGENT_DEVELOPMENT_SUMMARY_VIEW | &quot;AGENT_DEVELOPMENT_SUMMARY_VIEW&quot; | 
| AGENT_PERFORMANCE_ME_VIEW | &quot;AGENT_PERFORMANCE_ME_VIEW&quot; | 
| AGENT_STATUS_ME_VIEW | &quot;AGENT_STATUS_ME_VIEW&quot; | 
| AGENT_EVALUATION_ME_VIEW | &quot;AGENT_EVALUATION_ME_VIEW&quot; | 
| AGENT_SCORECARD_VIEW | &quot;AGENT_SCORECARD_VIEW&quot; | 
| AGENT_SCORECARD_ME_VIEW | &quot;AGENT_SCORECARD_ME_VIEW&quot; | 
| AGENT_GAMIFICATION_LEADERSHIP_VIEW | &quot;AGENT_GAMIFICATION_LEADERSHIP_VIEW&quot; | 
| AGENT_SCHEDULE_ME_VIEW | &quot;AGENT_SCHEDULE_ME_VIEW&quot; | 
| BOT_PERFORMANCE_SUMMARY_VIEW | &quot;BOT_PERFORMANCE_SUMMARY_VIEW&quot; | 
| BOT_PERFORMANCE_DETAIL_VIEW | &quot;BOT_PERFORMANCE_DETAIL_VIEW&quot; | 
| SCHEDULED_EXPORTS_VIEW | &quot;SCHEDULED_EXPORTS_VIEW&quot; | 
| TOPIC_TREND_SUMMARY_VIEW | &quot;TOPIC_TREND_SUMMARY_VIEW&quot; | 
| TOPIC_TREND_DETAIL_VIEW | &quot;TOPIC_TREND_DETAIL_VIEW&quot; | 
| ACTION_MAP_BLOCKED_CONSTRAINTS_DETAIL_VIEW | &quot;ACTION_MAP_BLOCKED_CONSTRAINTS_DETAIL_VIEW&quot; | 
| ACTION_MAP_BLOCKED_CONSTRAINTS_INTERVAL_DETAIL_VIEW | &quot;ACTION_MAP_BLOCKED_CONSTRAINTS_INTERVAL_DETAIL_VIEW&quot; | 
| FLOW_MILESTONE_PERFORMANCE_DETAIL_VIEW | &quot;FLOW_MILESTONE_PERFORMANCE_DETAIL_VIEW&quot; | 
| FLOW_MILESTONE_PERFORMANCE_INTERVAL_DETAIL_VIEW | &quot;FLOW_MILESTONE_PERFORMANCE_INTERVAL_DETAIL_VIEW&quot; | 
| AGENT_TOPIC_SUMMARY_VIEW | &quot;AGENT_TOPIC_SUMMARY_VIEW&quot; | 
| AGENT_TOPIC_DETAIL_VIEW | &quot;AGENT_TOPIC_DETAIL_VIEW&quot; | 
| QUEUE_TOPIC_SUMMARY_VIEW | &quot;QUEUE_TOPIC_SUMMARY_VIEW&quot; | 
| QUEUE_TOPIC_DETAIL_VIEW | &quot;QUEUE_TOPIC_DETAIL_VIEW&quot; | 
| FLOW_TOPIC_SUMMARY_VIEW | &quot;FLOW_TOPIC_SUMMARY_VIEW&quot; | 
| FLOW_TOPIC_DETAIL_VIEW | &quot;FLOW_TOPIC_DETAIL_VIEW&quot; | 
| AGENT_INTERACTIONS_ME_VIEW | &quot;AGENT_INTERACTIONS_ME_VIEW&quot; | 
| ALERT_RULES_VIEW | &quot;ALERT_RULES_VIEW&quot; | 
| CONFIGURE_ALERT_RULE_VIEW | &quot;CONFIGURE_ALERT_RULE_VIEW&quot; | 
| PREDICTIVE_ROUTING_VIEW | &quot;PREDICTIVE_ROUTING_VIEW&quot; | 
| PREDICTIVE_ROUTING_QUEUE_OVERVIEW | &quot;PREDICTIVE_ROUTING_QUEUE_OVERVIEW&quot; | 
| PREDICTIVE_ROUTING_MODEL_VIEW | &quot;PREDICTIVE_ROUTING_MODEL_VIEW&quot; | 
| PREDICTIVE_ROUTING_IMPACT_VIEW | &quot;PREDICTIVE_ROUTING_IMPACT_VIEW&quot; | 
| DATA_ACTIONS_PERFORMANCE_SUMMARY_VIEW | &quot;DATA_ACTIONS_PERFORMANCE_SUMMARY_VIEW&quot; | 
| DATA_ACTIONS_PERFORMANCE_DETAIL_VIEW | &quot;DATA_ACTIONS_PERFORMANCE_DETAIL_VIEW&quot; | 
| AGENT_TIMELINE_SUMMARY_VIEW | &quot;AGENT_TIMELINE_SUMMARY_VIEW&quot; | 
| AGENT_TIMELINE_DETAIL_VIEW | &quot;AGENT_TIMELINE_DETAIL_VIEW&quot; | 
| AGENT_LOGIN_LOGOUT_SUMMARY_VIEW | &quot;AGENT_LOGIN_LOGOUT_SUMMARY_VIEW&quot; | 
| AGENT_LOGIN_LOGOUT_DETAIL_VIEW | &quot;AGENT_LOGIN_LOGOUT_DETAIL_VIEW&quot; | 
| CAMPAIGN_PERFORMANCE_SUMMARY_VIEW | &quot;CAMPAIGN_PERFORMANCE_SUMMARY_VIEW&quot; | 
| CAMPAIGN_PERFORMANCE_DETAIL_VIEW | &quot;CAMPAIGN_PERFORMANCE_DETAIL_VIEW&quot; | 
| KNOWLEDGE_PERFORMANCE_VIEW | &quot;KNOWLEDGE_PERFORMANCE_VIEW&quot; | 
| AGENT_SCORECARD_INSIGHTS_SUMMARY_VIEW | &quot;AGENT_SCORECARD_INSIGHTS_SUMMARY_VIEW&quot; | 
| AGENT_SCORECARD_INSIGHTS_DETAIL_VIEW | &quot;AGENT_SCORECARD_INSIGHTS_DETAIL_VIEW&quot; | 
| QUEUE_WRAPUP_DETAIL_VIEW | &quot;QUEUE_WRAPUP_DETAIL_VIEW&quot; | 
| INTERACTION_DETAIL_VIEW | &quot;INTERACTION_DETAIL_VIEW&quot; | 
| CAMPAIGN_INTERACTION_DETAIL_VIEW | &quot;CAMPAIGN_INTERACTION_DETAIL_VIEW&quot; | 
| CAMPAIGN_ATTEMPT_DETAIL_VIEW | &quot;CAMPAIGN_ATTEMPT_DETAIL_VIEW&quot; | 
| WORKITEM_PERFORMANCE_SUMMARY_VIEW | &quot;WORKITEM_PERFORMANCE_SUMMARY_VIEW&quot; | 
| AGENT_ASSIST_PERFORMANCE_VIEW | &quot;AGENT_ASSIST_PERFORMANCE_VIEW&quot; | 
| CONTACT_CENTER_PERFORMANCE_VIEW | &quot;CONTACT_CENTER_PERFORMANCE_VIEW&quot; | 
| QUEUE_ROUTING_PERFORMANCE_VIEW | &quot;QUEUE_ROUTING_PERFORMANCE_VIEW&quot; | 
| AGENT_WORKITEM_PERFORMANCE_SUMMARY_VIEW | &quot;AGENT_WORKITEM_PERFORMANCE_SUMMARY_VIEW&quot; | 
| AGENT_WORKITEM_PERFORMANCE_DETAIL_VIEW | &quot;AGENT_WORKITEM_PERFORMANCE_DETAIL_VIEW&quot; | 
| QUEUE_WORKITEM_PERFORMANCE_SUMMARY_VIEW | &quot;QUEUE_WORKITEM_PERFORMANCE_SUMMARY_VIEW&quot; | 
| QUEUE_WORKITEM_PERFORMANCE_DETAIL_VIEW | &quot;QUEUE_WORKITEM_PERFORMANCE_DETAIL_VIEW&quot; | 
| EMAIL_AGENT_PERFORMANCE_SUMMARY_VIEW | &quot;EMAIL_AGENT_PERFORMANCE_SUMMARY_VIEW&quot; | 
| EMAIL_AGENT_PERFORMANCE_DETAIL_VIEW | &quot;EMAIL_AGENT_PERFORMANCE_DETAIL_VIEW&quot; | 
| MESSAGING_AGENT_PERFORMANCE_SUMMARY_VIEW | &quot;MESSAGING_AGENT_PERFORMANCE_SUMMARY_VIEW&quot; | 
| MESSAGING_AGENT_PERFORMANCE_DETAIL_VIEW | &quot;MESSAGING_AGENT_PERFORMANCE_DETAIL_VIEW&quot; | 
| EMAIL_QUEUE_PERFORMANCE_SUMMARY_VIEW | &quot;EMAIL_QUEUE_PERFORMANCE_SUMMARY_VIEW&quot; | 
| EMAIL_QUEUE_PERFORMANCE_DETAIL_VIEW | &quot;EMAIL_QUEUE_PERFORMANCE_DETAIL_VIEW&quot; | 
| MESSAGING_QUEUE_PERFORMANCE_SUMMARY_VIEW | &quot;MESSAGING_QUEUE_PERFORMANCE_SUMMARY_VIEW&quot; | 
| MESSAGING_QUEUE_PERFORMANCE_DETAIL_VIEW | &quot;MESSAGING_QUEUE_PERFORMANCE_DETAIL_VIEW&quot; | 
| SOCIAL_LISTENING_VIEW | &quot;SOCIAL_LISTENING_VIEW&quot; | 
| SOCIAL_LISTENING_POSTS_VIEW | &quot;SOCIAL_LISTENING_POSTS_VIEW&quot; | 
| AGENT_PERFORMANCE_TIMELINE_DETAIL_VIEW | &quot;AGENT_PERFORMANCE_TIMELINE_DETAIL_VIEW&quot; | 
| DASHBOARD_SLIDESHOWS | &quot;DASHBOARD_SLIDESHOWS&quot; | 
| DASHBOARD_SLIDESHOWS_DETAIL | &quot;DASHBOARD_SLIDESHOWS_DETAIL&quot; | 
| AGENT_COPILOT_PERFORMANCE_VIEW | &quot;AGENT_COPILOT_PERFORMANCE_VIEW&quot; | 
| AGENT_ASSIGNED_EVALUATION_ME_VIEW | &quot;AGENT_ASSIGNED_EVALUATION_ME_VIEW&quot; | 
| VIRTUAL_AGENT_PERFORMANCE_VIEW | &quot;VIRTUAL_AGENT_PERFORMANCE_VIEW&quot; | 
| CONTENT_EXPLORATION_VIEW | &quot;CONTENT_EXPLORATION_VIEW&quot; | 
| EVALUATION_PERFORMANCE_SUMMARY_VIEW | &quot;EVALUATION_PERFORMANCE_SUMMARY_VIEW&quot; | 
| EVALUATION_PERFORMANCE_DETAIL_VIEW | &quot;EVALUATION_PERFORMANCE_DETAIL_VIEW&quot; | 
| EVALUATION_PERFORMANCE_QUESTION_GROUP_DETAIL_VIEW | &quot;EVALUATION_PERFORMANCE_QUESTION_GROUP_DETAIL_VIEW&quot; | 
| EVALUATION_PERFORMANCE_QUESTION_DETAIL_VIEW | &quot;EVALUATION_PERFORMANCE_QUESTION_DETAIL_VIEW&quot; | 


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
| FAILED_AS_EXPORT_FILE_SIZE_IS_GREATER_THAN_10MB | &quot;FAILED_AS_EXPORT_FILE_SIZE_IS_GREATER_THAN_10MB&quot; | 
| NOT_AUTHORIZED_TO_VIEW_EXPORT | &quot;NOT_AUTHORIZED_TO_VIEW_EXPORT&quot; | 
| STATIC_LINK_EXPORT_FAILED | &quot;STATIC_LINK_EXPORT_FAILED&quot; | 
| TOO_MANY_SEARCH_CRITERIA | &quot;TOO_MANY_SEARCH_CRITERIA&quot; | 
| SEARCH_CRITERIA_VALUES_EXCEED_LIMIT | &quot;SEARCH_CRITERIA_VALUES_EXCEED_LIMIT&quot; | 
| EXPORT_EMAIL_FILE_SIZE_EXCEEDED_LIMIT | &quot;EXPORT_EMAIL_FILE_SIZE_EXCEEDED_LIMIT&quot; | 
| CIRCUIT_BREAKER_OPEN_FOR_VIEW_TYPE | &quot;CIRCUIT_BREAKER_OPEN_FOR_VIEW_TYPE&quot; | 
| BAD_REQUEST_SCHEDULED_RUN | &quot;BAD_REQUEST_SCHEDULED_RUN&quot; | 


## Enum: CsvDelimiterEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SEMICOLON | &quot;SEMICOLON&quot; | 
| COMMA | &quot;COMMA&quot; | 


## Enum: InnerEnum

| Name | Value |
| ---- | ----- |
| SENT | &quot;Sent&quot; |
| PENDING | &quot;Pending&quot; |
| FAILED | &quot;Failed&quot; |


## Enum: DurationFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SECONDS | &quot;Seconds&quot; | 
| MILLISECONDS | &quot;Milliseconds&quot; | 
| HHMMSS | &quot;Hhmmss&quot; | 
| HMS | &quot;Hms&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
