# HistoricalAdherenceExceptionInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startOffsetSeconds** | **Integer** | Exception start offset in seconds relative to query start time |  [optional] |
| **endOffsetSeconds** | **Integer** | Exception end offset in seconds relative to query start time |  [optional] |
| **scheduledActivityCodeId** | **String** | The ID of the scheduled activity code for this user |  [optional] |
| **scheduledActivityCategory** | [**ScheduledActivityCategoryEnum**](#Enum--ScheduledActivityCategoryEnum) | Activity for which the user is scheduled |  [optional] |
| **scheduledSecondaryPresenceLookupIds** | **List&lt;String&gt;** | The lookup IDs used to retrieve the scheduled secondary statuses from map of lookup ID to corresponding secondary presence ID |  [optional] |
| **actualActivityCodeId** | **String** | The ID of the actual activity code for this user |  [optional] |
| **actualActivityCategory** | [**ActualActivityCategoryEnum**](#Enum--ActualActivityCategoryEnum) | Activity for which the user is actually engaged |  [optional] |
| **systemPresence** | [**SystemPresenceEnum**](#Enum--SystemPresenceEnum) | Actual underlying system presence value |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#Enum--RoutingStatusEnum) | Actual underlying routing status, used to determine whether a user is actually in adherence when OnQueue |  [optional] |
| **impact** | [**ImpactEnum**](#Enum--ImpactEnum) | The impact of the current adherence state for this user |  [optional] |
| **secondaryPresenceLookupId** | **String** | The lookup ID used to retrieve the actual secondary status from map of lookup ID to corresponding secondary presence ID |  [optional] |


## Enum: ScheduledActivityCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ONQUEUEWORK | &quot;OnQueueWork&quot; | 
| BREAK | &quot;Break&quot; | 
| MEAL | &quot;Meal&quot; | 
| MEETING | &quot;Meeting&quot; | 
| OFFQUEUEWORK | &quot;OffQueueWork&quot; | 
| TIMEOFF | &quot;TimeOff&quot; | 
| TRAINING | &quot;Training&quot; | 
| UNAVAILABLE | &quot;Unavailable&quot; | 
| UNSCHEDULED | &quot;Unscheduled&quot; | 


## Enum: ActualActivityCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ONQUEUEWORK | &quot;OnQueueWork&quot; | 
| BREAK | &quot;Break&quot; | 
| MEAL | &quot;Meal&quot; | 
| MEETING | &quot;Meeting&quot; | 
| OFFQUEUEWORK | &quot;OffQueueWork&quot; | 
| TIMEOFF | &quot;TimeOff&quot; | 
| TRAINING | &quot;Training&quot; | 
| UNAVAILABLE | &quot;Unavailable&quot; | 
| UNSCHEDULED | &quot;Unscheduled&quot; | 


## Enum: SystemPresenceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AVAILABLE | &quot;Available&quot; | 
| AWAY | &quot;Away&quot; | 
| BUSY | &quot;Busy&quot; | 
| OFFLINE | &quot;Offline&quot; | 
| IDLE | &quot;Idle&quot; | 
| ONQUEUE | &quot;OnQueue&quot; | 
| MEAL | &quot;Meal&quot; | 
| TRAINING | &quot;Training&quot; | 
| MEETING | &quot;Meeting&quot; | 
| BREAK | &quot;Break&quot; | 


## Enum: RoutingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFF_QUEUE | &quot;OFF_QUEUE&quot; | 
| IDLE | &quot;IDLE&quot; | 
| INTERACTING | &quot;INTERACTING&quot; | 
| NOT_RESPONDING | &quot;NOT_RESPONDING&quot; | 
| COMMUNICATING | &quot;COMMUNICATING&quot; | 


## Enum: ImpactEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| POSITIVE | &quot;Positive&quot; | 
| NEGATIVE | &quot;Negative&quot; | 
| NEUTRAL | &quot;Neutral&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
