---
title: Widget
---
## Widget


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **row** | <!----><!---->**Integer**<!----> | The row number for the specific dashboard widget configuration. |  [optional] |
| **column** | <!----><!---->**Integer**<!----> | The column number for the specific dashboard widget configuration. |  [optional] |
| **title** | <!----><!---->**String**<!----> | The title for the dashboard widget configuration. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of dashboard widget configuration. |  |
| **metrics** | <!---->[**List&lt;MetricsEnum&gt;**](#MetricsEnum)<!----> | The list of metrics for the dashboard widget configuration. |  [optional] |
| **displayText** | <!----><!---->**String**<!----> | The display text for the dashboard widget configuration. |  [optional] |
| **displayTextColor** | <!----><!---->**String**<!----> | The color of the display text for the dashboard widget configuration in RGB hexadecimal format (for example \"#FF0000\" represents red). |  [optional] |
| **webContentUrl** | <!----><!---->**String**<!----> | The external web URL for the dashboard widget configuration. |  [optional] |
| **splitFilters** | <!----><!---->**Boolean**<!----> | Indicates each filter to be displayed individually. |  [optional] |
| **splitByMediaType** | <!----><!---->**Boolean**<!----> | Indicates that data for each media type should be shown individually. |  [optional] |
| **showLongest** | <!----><!---->**Boolean**<!----> | Indicates the display be the longest time. |  [optional] |
| **displayAsTable** | <!----><!---->**Boolean**<!----> | Indicates the widget to be displayed as table. |  [optional] |
| **showDuration** | <!----><!---->**Boolean**<!----> | Indicates the display to include duration. |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#SortOrderEnum)<!----> | The sort order of the table. |  [optional] |
| **sortKey** | [**SortKeyEnum**](#SortKeyEnum)<!----> | The sort key of the table. |  [optional] |
| **entityLimit** | <!----><!---->**Integer**<!----> | Indicates the limit of displayed entities. |  [optional] |
| **displayAggregates** | <!----><!---->**Boolean**<!----> | Indicates whether to display aggregate across all entity and media type combination. |  [optional] |
| **isFullWidth** | <!----><!---->**Boolean**<!----> | Indicates whether a widget should take the full width of a dashboard or be shown only in a single slot. |  [optional] |
| **showPercentageChange** | <!----><!---->**Boolean**<!----> | Indicates whether a widget should show the percentage diff between two values. |  [optional] |
| **showProfilePicture** | <!----><!---->**Boolean**<!----> | Indicates whether a widget should show the profile picture of an agent. |  [optional] |
| **filter** | <!----><!---->[**ViewFilter**](ViewFilter.html)<!----> | The filters to be applied for dashboard widget configuration |  [optional] |
| **periods** | <!---->[**List&lt;PeriodsEnum&gt;**](#PeriodsEnum)<!----> | The list of periods for the dashboard widget configuration |  [optional] |
| **mediaTypes** | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!----> | The list of media types for the dashboard widget configuration |  [optional] |
| **warnings** | <!----><!---->[**List&lt;Warning&gt;**](Warning.html)<!----> | List of warnings for dashboard widget configuration |  [optional] |
| **showTimeInStatus** | <!----><!---->**Boolean**<!----> | Indicates the show time in status of a widget configuration. |  [optional] |
| **showOfflineAgents** | <!----><!---->**Boolean**<!----> | Indicates to show offline agent widget. |  [optional] |
| **selectedStatuses** | <!---->[**List&lt;SelectedStatusesEnum&gt;**](#SelectedStatusesEnum)<!----> | Indicates the selected statuses used to filter the agent widget in the dashboard. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| METRIC | &quot;METRIC&quot; | 
| CHART | &quot;CHART&quot; | 
| PIE | &quot;PIE&quot; | 
| HEAT_MAP | &quot;HEAT_MAP&quot; | 
| FREE_TEXT | &quot;FREE_TEXT&quot; | 
| AGENT_STATUS | &quot;AGENT_STATUS&quot; | 
| REALTIME_ADHERENCE | &quot;REALTIME_ADHERENCE&quot; | 
| WEB_CONTENT_URL | &quot;WEB_CONTENT_URL&quot; | 
{: class="table table-striped"}


<a name="MetricsEnum"></a>

## Enum: MetricsEnum

| Name | Value |
| ---- | ----- |
| AVG_TALK_TIME | &quot;AVG_TALK_TIME&quot; |
| AVG_HOLD_TIME | &quot;AVG_HOLD_TIME&quot; |
| AVG_ACW_TIME | &quot;AVG_ACW_TIME&quot; |
| AVG_WAIT_TIME | &quot;AVG_WAIT_TIME&quot; |
| AVG_HANDLE_TIME | &quot;AVG_HANDLE_TIME&quot; |
| AVG_ALERT_TIME | &quot;AVG_ALERT_TIME&quot; |
| AVG_ANSWER_TIME | &quot;AVG_ANSWER_TIME&quot; |
| AVG_ABANDON_TIME | &quot;AVG_ABANDON_TIME&quot; |
| TOTAL_TALK_TIME | &quot;TOTAL_TALK_TIME&quot; |
| TOTAL_HANDLE_TIME | &quot;TOTAL_HANDLE_TIME&quot; |
| TOTAL_HOLD_TIME | &quot;TOTAL_HOLD_TIME&quot; |
| TOTAL_ACW_TIME | &quot;TOTAL_ACW_TIME&quot; |
| TOTAL_ALERT_TIME | &quot;TOTAL_ALERT_TIME&quot; |
| MAX_ABANDON_TIME | &quot;MAX_ABANDON_TIME&quot; |
| MAX_WAIT_TIME | &quot;MAX_WAIT_TIME&quot; |
| MAX_TALK_TIME | &quot;MAX_TALK_TIME&quot; |
| MAX_HOLD_TIME | &quot;MAX_HOLD_TIME&quot; |
| MAX_ACW_TIME | &quot;MAX_ACW_TIME&quot; |
| MIN_ABANDON_TIME | &quot;MIN_ABANDON_TIME&quot; |
| MIN_WAIT_TIME | &quot;MIN_WAIT_TIME&quot; |
| MIN_TALK_TIME | &quot;MIN_TALK_TIME&quot; |
| MIN_HOLD_TIME | &quot;MIN_HOLD_TIME&quot; |
| MIN_ACW_TIME | &quot;MIN_ACW_TIME&quot; |
| ALERT_COUNT | &quot;ALERT_COUNT&quot; |
| OFFERED_COUNT | &quot;OFFERED_COUNT&quot; |
| ABANDONED_COUNT | &quot;ABANDONED_COUNT&quot; |
| ABANDONED_PERCENT | &quot;ABANDONED_PERCENT&quot; |
| SHORT_ABANDONED_COUNT | &quot;SHORT_ABANDONED_COUNT&quot; |
| SHORT_ABANDONED_PERCENT | &quot;SHORT_ABANDONED_PERCENT&quot; |
| ABANDONED_NO_SHORT_COUNT | &quot;ABANDONED_NO_SHORT_COUNT&quot; |
| ABANDONED_NO_SHORT_PERCENT | &quot;ABANDONED_NO_SHORT_PERCENT&quot; |
| ANSWERED_COUNT | &quot;ANSWERED_COUNT&quot; |
| ANSWERED_PERCENT | &quot;ANSWERED_PERCENT&quot; |
| FLOWOUT_COUNT | &quot;FLOWOUT_COUNT&quot; |
| FLOWOUT_PERCENT | &quot;FLOWOUT_PERCENT&quot; |
| OUTBOUND_COUNT | &quot;OUTBOUND_COUNT&quot; |
| OUTBOUND_ATTEMPTED_COUNT | &quot;OUTBOUND_ATTEMPTED_COUNT&quot; |
| VOICEMAIL_COUNT | &quot;VOICEMAIL_COUNT&quot; |
| HANDLED_COUNT | &quot;HANDLED_COUNT&quot; |
| HELD_COUNT | &quot;HELD_COUNT&quot; |
| TRANSFERRED_COUNT | &quot;TRANSFERRED_COUNT&quot; |
| TRANSFERRED_PERCENT | &quot;TRANSFERRED_PERCENT&quot; |
| WAITING_CURRENT | &quot;WAITING_CURRENT&quot; |
| INTERACTING_CURRENT | &quot;INTERACTING_CURRENT&quot; |
| HELD_CURRENT | &quot;HELD_CURRENT&quot; |
| ALERTING_CURRENT | &quot;ALERTING_CURRENT&quot; |
| SERVICE_LEVEL | &quot;SERVICE_LEVEL&quot; |
| OVER_SERVICE_LEVEL | &quot;OVER_SERVICE_LEVEL&quot; |
| ONLINE_AGENTS | &quot;ONLINE_AGENTS&quot; |
| AVAILABLE_AGENTS | &quot;AVAILABLE_AGENTS&quot; |
| AWAY_AGENTS | &quot;AWAY_AGENTS&quot; |
| BREAK_AGENTS | &quot;BREAK_AGENTS&quot; |
| MEAL_AGENTS | &quot;MEAL_AGENTS&quot; |
| TRAINING_AGENTS | &quot;TRAINING_AGENTS&quot; |
| BUSY_AGENTS | &quot;BUSY_AGENTS&quot; |
| MEETING_AGENTS | &quot;MEETING_AGENTS&quot; |
| SYSTEM_AWAY_AGENTS | &quot;SYSTEM_AWAY_AGENTS&quot; |
| OFFLINE_AGENTS | &quot;OFFLINE_AGENTS&quot; |
| ON_QUEUE_AGENTS | &quot;ON_QUEUE_AGENTS&quot; |
| OFF_QUEUE_AGENTS | &quot;OFF_QUEUE_AGENTS&quot; |
| INTERACTING_AGENTS | &quot;INTERACTING_AGENTS&quot; |
| ACW_AGENTS | &quot;ACW_AGENTS&quot; |
| COMMUNICATING_AGENTS | &quot;COMMUNICATING_AGENTS&quot; |
| IDLE_AGENTS | &quot;IDLE_AGENTS&quot; |
| NOT_RESPONDING_AGENTS | &quot;NOT_RESPONDING_AGENTS&quot; |
| LONGEST_WAITING | &quot;LONGEST_WAITING&quot; |
| LONGEST_INTERACTING | &quot;LONGEST_INTERACTING&quot; |
| FLOW_ACTIVE_LONGEST | &quot;FLOW_ACTIVE_LONGEST&quot; |
| FLOW_ACTIVE_CURRENT | &quot;FLOW_ACTIVE_CURRENT&quot; |
| FLOW_ENTRIES_COUNT | &quot;FLOW_ENTRIES_COUNT&quot; |
| FLOW_TOTAL_DURATION | &quot;FLOW_TOTAL_DURATION&quot; |
| FLOW_MAX_DURATION | &quot;FLOW_MAX_DURATION&quot; |
| FLOW_AVG_DURATION | &quot;FLOW_AVG_DURATION&quot; |
| FLOW_DISCONNECT_COUNT | &quot;FLOW_DISCONNECT_COUNT&quot; |
| FLOW_DISCONNECT_PERCENT | &quot;FLOW_DISCONNECT_PERCENT&quot; |
| FLOW_TOTAL_DISCONNECT_DURATION | &quot;FLOW_TOTAL_DISCONNECT_DURATION&quot; |
| FLOW_AVG_DISCONNECT_DURATION | &quot;FLOW_AVG_DISCONNECT_DURATION&quot; |
| FLOW_MAX_DISCONNECT_DURATION | &quot;FLOW_MAX_DISCONNECT_DURATION&quot; |
| FLOW_FLOW_DISCONNECT | &quot;FLOW_FLOW_DISCONNECT&quot; |
| FLOW_FLOW_DISCONNECT_PERCENT | &quot;FLOW_FLOW_DISCONNECT_PERCENT&quot; |
| FLOW_SYSTEM_ERROR_DISCONNECT | &quot;FLOW_SYSTEM_ERROR_DISCONNECT&quot; |
| FLOW_SYSTEM_ERROR_DISCONNECT_PERCENT | &quot;FLOW_SYSTEM_ERROR_DISCONNECT_PERCENT&quot; |
| FLOW_CUSTOMER_DISCONNECT | &quot;FLOW_CUSTOMER_DISCONNECT&quot; |
| FLOW_CUSTOMER_DISCONNECT_PERCENT | &quot;FLOW_CUSTOMER_DISCONNECT_PERCENT&quot; |
| FLOW_SHORT_DISCONNECT | &quot;FLOW_SHORT_DISCONNECT&quot; |
| FLOW_SHORT_DISCONNECT_PERCENT | &quot;FLOW_SHORT_DISCONNECT_PERCENT&quot; |
| FLOW_EXIT_COUNT | &quot;FLOW_EXIT_COUNT&quot; |
| FLOW_EXIT_PERCENT | &quot;FLOW_EXIT_PERCENT&quot; |
| FLOW_TOTAL_EXIT_DURATION | &quot;FLOW_TOTAL_EXIT_DURATION&quot; |
| FLOW_MAX_EXIT_DURATION | &quot;FLOW_MAX_EXIT_DURATION&quot; |
| FLOW_AVG_EXIT_DURATION | &quot;FLOW_AVG_EXIT_DURATION&quot; |
| FLOW_ACD_EXIT_COUNT | &quot;FLOW_ACD_EXIT_COUNT&quot; |
| FLOW_ACD_EXIT_PERCENT | &quot;FLOW_ACD_EXIT_PERCENT&quot; |
| FLOW_GROUP_EXIT_COUNT | &quot;FLOW_GROUP_EXIT_COUNT&quot; |
| FLOW_GROUP_EXIT_PERCENT | &quot;FLOW_GROUP_EXIT_PERCENT&quot; |
| FLOW_NUMBER_EXIT_COUNT | &quot;FLOW_NUMBER_EXIT_COUNT&quot; |
| FLOW_NUMBER_EXIT_PERCENT | &quot;FLOW_NUMBER_EXIT_PERCENT&quot; |
| FLOW_USER_EXIT_COUNT | &quot;FLOW_USER_EXIT_COUNT&quot; |
| FLOW_USER_EXIT_PERCENT | &quot;FLOW_USER_EXIT_PERCENT&quot; |
| FLOW_FLOW_EXIT_COUNT | &quot;FLOW_FLOW_EXIT_COUNT&quot; |
| FLOW_FLOW_EXIT_PERCENT | &quot;FLOW_FLOW_EXIT_PERCENT&quot; |
| FLOW_SECURE_FLOW_EXIT_COUNT | &quot;FLOW_SECURE_FLOW_EXIT_COUNT&quot; |
| FLOW_SECURE_FLOW_EXIT_PERCENT | &quot;FLOW_SECURE_FLOW_EXIT_PERCENT&quot; |
| FLOW_ACD_VOICEMAIL_EXIT_COUNT | &quot;FLOW_ACD_VOICEMAIL_EXIT_COUNT&quot; |
| FLOW_ACD_VOICEMAIL_EXIT_PERCENT | &quot;FLOW_ACD_VOICEMAIL_EXIT_PERCENT&quot; |
| FLOW_USER_VOICEMAIL_EXIT_COUNT | &quot;FLOW_USER_VOICEMAIL_EXIT_COUNT&quot; |
| FLOW_USER_VOICEMAIL_EXIT_PERCENT | &quot;FLOW_USER_VOICEMAIL_EXIT_PERCENT&quot; |
| FLOW_OUTCOME_COUNT | &quot;FLOW_OUTCOME_COUNT&quot; |
| FLOW_AVG_OUTCOME_DECIMAL | &quot;FLOW_AVG_OUTCOME_DECIMAL&quot; |
| FLOW_OUTCOME_FAILURE_COUNT | &quot;FLOW_OUTCOME_FAILURE_COUNT&quot; |
| FLOW_OUTCOME_FAILURE_PERCENT | &quot;FLOW_OUTCOME_FAILURE_PERCENT&quot; |
| FLOW_OUTCOME_SUCCESS_COUNT | &quot;FLOW_OUTCOME_SUCCESS_COUNT&quot; |
| FLOW_OUTCOME_SUCCESS_PERCENT | &quot;FLOW_OUTCOME_SUCCESS_PERCENT&quot; |
| FLOW_OUTCOME_TOTAL_DURATION | &quot;FLOW_OUTCOME_TOTAL_DURATION&quot; |
| FLOW_OUTCOME_MAX_DURATION | &quot;FLOW_OUTCOME_MAX_DURATION&quot; |
| FLOW_OUTCOME_AVG_DURATION | &quot;FLOW_OUTCOME_AVG_DURATION&quot; |
| FLOW_OUTCOME_MIN_DURATION | &quot;FLOW_OUTCOME_MIN_DURATION&quot; |
| OFF_QUEUE_TIME | &quot;OFF_QUEUE_TIME&quot; |
| OFF_QUEUE_PERCENT | &quot;OFF_QUEUE_PERCENT&quot; |
| AVAILABLE_TIME | &quot;AVAILABLE_TIME&quot; |
| AVAILABLE_PERCENT | &quot;AVAILABLE_PERCENT&quot; |
| BUSY_TIME | &quot;BUSY_TIME&quot; |
| BUSY_PERCENT | &quot;BUSY_PERCENT&quot; |
| AWAY_TIME | &quot;AWAY_TIME&quot; |
| AWAY_PERCENT | &quot;AWAY_PERCENT&quot; |
| BREAK_TIME | &quot;BREAK_TIME&quot; |
| BREAK_PERCENT | &quot;BREAK_PERCENT&quot; |
| MEAL_TIME | &quot;MEAL_TIME&quot; |
| MEAL_PERCENT | &quot;MEAL_PERCENT&quot; |
| MEETING_TIME | &quot;MEETING_TIME&quot; |
| MEETING_PERCENT | &quot;MEETING_PERCENT&quot; |
| TRAINING_TIME | &quot;TRAINING_TIME&quot; |
| TRAINING_PERCENT | &quot;TRAINING_PERCENT&quot; |
| INTERACTING_TIME | &quot;INTERACTING_TIME&quot; |
| INTERACTING_PERCENT | &quot;INTERACTING_PERCENT&quot; |
| COMMUNICATING_TIME | &quot;COMMUNICATING_TIME&quot; |
| COMMUNICATING_PERCENT | &quot;COMMUNICATING_PERCENT&quot; |
| SYSTEM_AWAY_TIME | &quot;SYSTEM_AWAY_TIME&quot; |
| SYSTEM_AWAY_PERCENT | &quot;SYSTEM_AWAY_PERCENT&quot; |
| ON_QUEUE_TIME | &quot;ON_QUEUE_TIME&quot; |
| ON_QUEUE_PERCENT | &quot;ON_QUEUE_PERCENT&quot; |
| IDLE_TIME | &quot;IDLE_TIME&quot; |
| IDLE_PERCENT | &quot;IDLE_PERCENT&quot; |
| NOT_RESPONDING_TIME | &quot;NOT_RESPONDING_TIME&quot; |
| NOT_RESPONDING_PERCENT | &quot;NOT_RESPONDING_PERCENT&quot; |
| LOGGED_IN_TIME | &quot;LOGGED_IN_TIME&quot; |
| OCCUPANCY_PERCENT | &quot;OCCUPANCY_PERCENT&quot; |
| MIN_ALERT_TIME | &quot;MIN_ALERT_TIME&quot; |
| MAX_ALERT_TIME | &quot;MAX_ALERT_TIME&quot; |
| MIN_HANDLE_TIME | &quot;MIN_HANDLE_TIME&quot; |
| MAX_HANDLE_TIME | &quot;MAX_HANDLE_TIME&quot; |
| MIN_ANSWERED_TIME | &quot;MIN_ANSWERED_TIME&quot; |
| MAX_ANSWERED_TIME | &quot;MAX_ANSWERED_TIME&quot; |
| MIN_NOT_RESPONDING_TIME | &quot;MIN_NOT_RESPONDING_TIME&quot; |
| MAX_NOT_RESPONDING_TIME | &quot;MAX_NOT_RESPONDING_TIME&quot; |
| MET_SERVICE_LEVEL | &quot;MET_SERVICE_LEVEL&quot; |
| WFM_ADHERENCE_STATUS | &quot;WFM_ADHERENCE_STATUS&quot; |
| WFM_SCHEDULED_ACTIVITY | &quot;WFM_SCHEDULED_ACTIVITY&quot; |
| WFM_ADHERENCE_DURATION | &quot;WFM_ADHERENCE_DURATION&quot; |
| AGENT_TITLE | &quot;AGENT_TITLE&quot; |
| AGENT_DEPARTMENT | &quot;AGENT_DEPARTMENT&quot; |
| AGENT_EXTENSION | &quot;AGENT_EXTENSION&quot; |
| AGENT_SKILLS | &quot;AGENT_SKILLS&quot; |
| AGENT_LOCATION | &quot;AGENT_LOCATION&quot; |
| AGENT_REPORTS_TO | &quot;AGENT_REPORTS_TO&quot; |
| AGENT_EMAIL | &quot;AGENT_EMAIL&quot; |
| AGENT_ROLE | &quot;AGENT_ROLE&quot; |
| AGENT_GROUP | &quot;AGENT_GROUP&quot; |
| AGENT_TIME_IN_STATUS | &quot;AGENT_TIME_IN_STATUS&quot; |
| AGENT_TIME_IN_ROUTING_STATUS | &quot;AGENT_TIME_IN_ROUTING_STATUS&quot; |
| AGENT_STATUS | &quot;AGENT_STATUS&quot; |
| AGENT_SECONDARY_STATUS | &quot;AGENT_SECONDARY_STATUS&quot; |
| AGENT_ROUTING_STATUS | &quot;AGENT_ROUTING_STATUS&quot; |
| AGENT_MEDIA_TYPES | &quot;AGENT_MEDIA_TYPES&quot; |
| ACW_COUNT | &quot;ACW_COUNT&quot; |
| ANSWER_TRANSFERRED_PERCENT | &quot;ANSWER_TRANSFERRED_PERCENT&quot; |
| FLOW_AVG_MILESTONE_DECIMAL | &quot;FLOW_AVG_MILESTONE_DECIMAL&quot; |
| NOT_RESPONDING_COUNT | &quot;NOT_RESPONDING_COUNT&quot; |
| AVG_ACW_HANDLED | &quot;AVG_ACW_HANDLED&quot; |
| AVG_CONTACTING_TIME | &quot;AVG_CONTACTING_TIME&quot; |
| AVG_DIALING_TIME | &quot;AVG_DIALING_TIME&quot; |
| AVG_FLOWOUT_TIME | &quot;AVG_FLOWOUT_TIME&quot; |
| AVG_HOLD_HANDLED | &quot;AVG_HOLD_HANDLED&quot; |
| AVG_MONITOR | &quot;AVG_MONITOR&quot; |
| BLIND_TRANSFER_COUNT | &quot;BLIND_TRANSFER_COUNT&quot; |
| BLIND_TRANSFER_PERCENT | &quot;BLIND_TRANSFER_PERCENT&quot; |
| CONNECTED_COUNT | &quot;CONNECTED_COUNT&quot; |
| CONSULT_COUNT | &quot;CONSULT_COUNT&quot; |
| CONSULT_TRANSFER_COUNT | &quot;CONSULT_TRANSFER_COUNT&quot; |
| CONSULT_TRANSFER_PERCENT | &quot;CONSULT_TRANSFER_PERCENT&quot; |
| CONTACTING_COUNT | &quot;CONTACTING_COUNT&quot; |
| DIALING_COUNT | &quot;DIALING_COUNT&quot; |
| ERROR_COUNT | &quot;ERROR_COUNT&quot; |
| EXTERNAL_MEDIA_COUNT | &quot;EXTERNAL_MEDIA_COUNT&quot; |
| MAX_CONTACTING_TIME | &quot;MAX_CONTACTING_TIME&quot; |
| MAX_DIALING_TIME | &quot;MAX_DIALING_TIME&quot; |
| MAX_FLOWOUT_TIME | &quot;MAX_FLOWOUT_TIME&quot; |
| FLOW_MILESTONE_COUNT | &quot;FLOW_MILESTONE_COUNT&quot; |
| MIN_FLOWOUT_TIME | &quot;MIN_FLOWOUT_TIME&quot; |
| MAX_MONITOR | &quot;MAX_MONITOR&quot; |
| MIN_CONTACTING_TIME | &quot;MIN_CONTACTING_TIME&quot; |
| MIN_DIALING_TIME | &quot;MIN_DIALING_TIME&quot; |
| MIN_MONITOR | &quot;MIN_MONITOR&quot; |
| MONITOR_COUNT | &quot;MONITOR_COUNT&quot; |
| MEDIA_COUNT | &quot;MEDIA_COUNT&quot; |
| SERVICE_LEVEL_TARGET | &quot;SERVICE_LEVEL_TARGET&quot; |
| SERVICE_LEVEL_TARGET_CURRENT | &quot;SERVICE_LEVEL_TARGET_CURRENT&quot; |
| TALK_COUNT | &quot;TALK_COUNT&quot; |
| TOTAL_ABANDON_TIME | &quot;TOTAL_ABANDON_TIME&quot; |
| TOTAL_NOT_RESPONDING_TIME | &quot;TOTAL_NOT_RESPONDING_TIME&quot; |
| TOTAL_CONTACTING | &quot;TOTAL_CONTACTING&quot; |
| TOTAL_DIALING | &quot;TOTAL_DIALING&quot; |
| TOTAL_MONITOR | &quot;TOTAL_MONITOR&quot; |
| TOTAL_WAIT_TIME | &quot;TOTAL_WAIT_TIME&quot; |
| WAIT_COUNT | &quot;WAIT_COUNT&quot; |
| PARK_COUNT | &quot;PARK_COUNT&quot; |
| AVG_PARK_TIME | &quot;AVG_PARK_TIME&quot; |
| TOTAL_PARK_TIME | &quot;TOTAL_PARK_TIME&quot; |
| MIN_PARK_TIME | &quot;MIN_PARK_TIME&quot; |
| MAX_PARK_TIME | &quot;MAX_PARK_TIME&quot; |
{: class="table table-striped"}


<a name="SortOrderEnum"></a>

## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASCENDING | &quot;ascending&quot; | 
| DESCENDING | &quot;descending&quot; | 
{: class="table table-striped"}


<a name="SortKeyEnum"></a>

## Enum: SortKeyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NAME | &quot;Name&quot; | 
| DURATION | &quot;Duration&quot; | 
{: class="table table-striped"}


<a name="PeriodsEnum"></a>

## Enum: PeriodsEnum

| Name | Value |
| ---- | ----- |
| NONE | &quot;NONE&quot; |
| CURRENT_HALF_HOUR | &quot;CURRENT_HALF_HOUR&quot; |
| TODAY | &quot;TODAY&quot; |
| YESTERDAY | &quot;YESTERDAY&quot; |
| THIS_WEEK | &quot;THIS_WEEK&quot; |
| LAST_WEEK | &quot;LAST_WEEK&quot; |
| THIS_MONTH | &quot;THIS_MONTH&quot; |
| LAST_MONTH | &quot;LAST_MONTH&quot; |
| PRIOR_7_DAYS | &quot;PRIOR_7_DAYS&quot; |
| PAST_7_DAYS_TO_DATE | &quot;PAST_7_DAYS_TO_DATE&quot; |
| PRIOR_30_DAYS | &quot;PRIOR_30_DAYS&quot; |
| PAST_30_DAYS_TO_DATE | &quot;PAST_30_DAYS_TO_DATE&quot; |
| PRIOR_3_MONTHS | &quot;PRIOR_3_MONTHS&quot; |
{: class="table table-striped"}


<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| CALLBACK | &quot;callback&quot; |
| CHAT | &quot;chat&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| EMAIL | &quot;email&quot; |
| MESSAGE | &quot;message&quot; |
| SCREENSHARE | &quot;screenshare&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIDEO | &quot;video&quot; |
| VOICE | &quot;voice&quot; |
{: class="table table-striped"}


<a name="SelectedStatusesEnum"></a>

## Enum: SelectedStatusesEnum

| Name | Value |
| ---- | ----- |
| AVAILABLE | &quot;Available&quot; |
| AWAY | &quot;Away&quot; |
| BUSY | &quot;Busy&quot; |
| BREAK | &quot;Break&quot; |
| MEETING | &quot;Meeting&quot; |
| TRAINING | &quot;Training&quot; |
| MEAL | &quot;Meal&quot; |
| SYSTEMAWAY | &quot;SystemAway&quot; |
| ONQUEUE | &quot;OnQueue&quot; |
| INTERACTING | &quot;Interacting&quot; |
| NOTRESPONDING | &quot;NotResponding&quot; |
| IDLE | &quot;Idle&quot; |
| COMMUNICATING | &quot;Communicating&quot; |
| OFFQUEUE | &quot;OffQueue&quot; |
| ONLINE | &quot;Online&quot; |
| OFFLINE | &quot;Offline&quot; |
{: class="table table-striped"}



