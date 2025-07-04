# WorkitemsEventsNotificationWorkitem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **typeId** | **String** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **languageId** | **String** |  |  [optional] |
| **priority** | **Long** |  |  [optional] |
| **dateCreated** | **String** |  |  [optional] |
| **dateModified** | **String** |  |  [optional] |
| **dateDue** | **String** |  |  [optional] |
| **dateExpires** | **String** |  |  [optional] |
| **dateAssignmentStateChanged** | **String** |  |  [optional] |
| **durationSeconds** | **Long** |  |  [optional] |
| **ttl** | **Long** |  |  [optional] |
| **statusId** | **String** |  |  [optional] |
| **statusCategory** | [**StatusCategoryEnum**](#Enum--StatusCategoryEnum) |  |  [optional] |
| **dateClosed** | **String** |  |  [optional] |
| **workbinId** | **String** |  |  [optional] |
| **reporterId** | **String** |  |  [optional] |
| **assigneeId** | **String** |  |  [optional] |
| **externalContactId** | **String** |  |  [optional] |
| **externalTag** | **String** |  |  [optional] |
| **wrapupId** | **String** |  |  [optional] |
| **modifiedBy** | **String** |  |  [optional] |
| **operation** | [**OperationEnum**](#Enum--OperationEnum) |  |  [optional] |
| **changes** | [**List&lt;WorkitemsEventsNotificationDelta&gt;**](WorkitemsEventsNotificationDelta) |  |  [optional] |
| **propertyChanges** | [**List&lt;WorkitemsEventsNotificationPropertyChange&gt;**](WorkitemsEventsNotificationPropertyChange) |  |  [optional] |
| **assignmentState** | [**AssignmentStateEnum**](#Enum--AssignmentStateEnum) |  |  [optional] |
| **assignmentId** | **String** |  |  [optional] |
| **alertTimeoutSeconds** | **Long** |  |  [optional] |
| **queueId** | **String** |  |  [optional] |
| **customFields** | [**Map&lt;String, WorkitemsEventsNotificationCustomAttribute&gt;**](WorkitemsEventsNotificationCustomAttribute) |  |  [optional] |
| **wrapup** | [**WorkitemsEventsNotificationWrapup**](WorkitemsEventsNotificationWrapup) |  |  [optional] |
| **sessions** | [**List&lt;WorkitemsEventsNotificationSession&gt;**](WorkitemsEventsNotificationSession) |  |  [optional] |
| **skillIds** | **List&lt;String&gt;** |  |  [optional] |
| **scriptId** | **String** |  |  [optional] |
| **workbinName** | **String** |  |  [optional] |
| **typeName** | **String** |  |  [optional] |
| **preferredAgentIds** | **List&lt;String&gt;** |  |  [optional] |
| **divisionId** | **String** |  |  [optional] |
| **scoredAgents** | [**List&lt;WorkitemsEventsNotificationScoredAgent&gt;**](WorkitemsEventsNotificationScoredAgent) |  |  [optional] |
| **utilizationLabelId** | **String** |  |  [optional] |


## Enum: StatusCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| OPEN | &quot;Open&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| WAITING | &quot;Waiting&quot; | 
| CLOSED | &quot;Closed&quot; | 


## Enum: OperationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| ADD | &quot;add&quot; | 
| EDIT | &quot;edit&quot; | 
| DELETE | &quot;delete&quot; | 
| VIEW | &quot;view&quot; | 
| UPLOAD | &quot;upload&quot; | 
| DOWNLOAD | &quot;download&quot; | 
| ACTIVATE | &quot;activate&quot; | 
| DEACTIVATE | &quot;deactivate&quot; | 
| PURGE | &quot;purge&quot; | 
| PROCESSED | &quot;processed&quot; | 
| PUBLISHED | &quot;published&quot; | 
| ASSIGNED | &quot;assigned&quot; | 
| UNASSIGNED | &quot;unassigned&quot; | 
| RESET | &quot;reset&quot; | 
| REASSIGNED | &quot;reassigned&quot; | 
| REASSIGN | &quot;reassign&quot; | 
| ARCHIVE | &quot;archive&quot; | 
| UNARCHIVE | &quot;unarchive&quot; | 
| RESCHEDULE | &quot;reschedule&quot; | 


## Enum: AssignmentStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| IDLE | &quot;Idle&quot; | 
| ACDSTARTED | &quot;AcdStarted&quot; | 
| ALERTING | &quot;Alerting&quot; | 
| ALERTTIMEOUT | &quot;AlertTimeout&quot; | 
| DECLINED | &quot;Declined&quot; | 
| CONNECTED | &quot;Connected&quot; | 
| DISCONNECTED | &quot;Disconnected&quot; | 
| PARKED | &quot;Parked&quot; | 
| HELD | &quot;Held&quot; | 
| ACDCANCELLED | &quot;AcdCancelled&quot; | 
| TERMINATED | &quot;Terminated&quot; | 
| ACDEXPIRED | &quot;AcdExpired&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
