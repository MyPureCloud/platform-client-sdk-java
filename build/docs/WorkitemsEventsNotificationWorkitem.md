---
title: WorkitemsEventsNotificationWorkitem
---
## WorkitemsEventsNotificationWorkitem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **typeId** | <!----><!---->**String**<!----> |  |  [optional] |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **languageId** | <!----><!---->**String**<!----> |  |  [optional] |
| **priority** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateModified** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateDue** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateExpires** | <!----><!---->**String**<!----> |  |  [optional] |
| **durationSeconds** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **ttl** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **statusId** | <!----><!---->**String**<!----> |  |  [optional] |
| **statusCategory** | [**StatusCategoryEnum**](#StatusCategoryEnum)<!----> |  |  [optional] |
| **dateClosed** | <!----><!---->**String**<!----> |  |  [optional] |
| **workbinId** | <!----><!---->**String**<!----> |  |  [optional] |
| **reporterId** | <!----><!---->**String**<!----> |  |  [optional] |
| **assigneeId** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalContactId** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalTag** | <!----><!---->**String**<!----> |  |  [optional] |
| **wrapupId** | <!----><!---->**String**<!----> |  |  [optional] |
| **modifiedBy** | <!----><!---->**String**<!----> |  |  [optional] |
| **operation** | [**OperationEnum**](#OperationEnum)<!----> |  |  [optional] |
| **changes** | <!----><!---->[**List&lt;WorkitemsEventsNotificationDelta&gt;**](WorkitemsEventsNotificationDelta.html)<!----> |  |  [optional] |
| **assignmentState** | [**AssignmentStateEnum**](#AssignmentStateEnum)<!----> |  |  [optional] |
| **assignmentId** | <!----><!---->**String**<!----> |  |  [optional] |
| **alertTimeoutSeconds** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **queueId** | <!----><!---->**String**<!----> |  |  [optional] |
| **customFields** | <!----><!---->[**Map&lt;String, WorkitemsEventsNotificationCustomAttribute&gt;**](WorkitemsEventsNotificationCustomAttribute.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StatusCategoryEnum"></a>

## Enum: StatusCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| OPEN | &quot;Open&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| WAITING | &quot;Waiting&quot; | 
| CLOSED | &quot;Closed&quot; | 
{: class="table table-striped"}


<a name="OperationEnum"></a>

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
{: class="table table-striped"}


<a name="AssignmentStateEnum"></a>

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
{: class="table table-striped"}



