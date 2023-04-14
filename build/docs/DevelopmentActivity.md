---
title: DevelopmentActivity
---
## DevelopmentActivity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **dateCompleted** | <!----><!---->[**Date**](Date.html)<!----> | Date that activity was completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | User that created activity |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date activity was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **percentageScore** | <!----><!---->**Float**<!----> | The user's percentage score for this activity |  [optional] |
| **isPassed** | <!----><!---->**Boolean**<!----> | True if the activity was passed |  [optional] |
| **isLatest** | <!----><!---->**Boolean**<!----> | True if this is the latest version of assignment assigned to the user |  [optional] |
| **isModuleArchived** | <!----><!---->**Boolean**<!----> | True if the associated module is archived |  [optional] |
| **archivalMode** | [**ArchivalModeEnum**](#ArchivalModeEnum)<!----> | Module archive type |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the activity |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of activity |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the activity |  [optional] |
| **dateDue** | <!----><!---->[**Date**](Date.html)<!----> | Due date for completion of the activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **facilitator** | <!----><!---->[**UserReference**](UserReference.html)<!----> | Facilitator of the activity |  [optional] |
| **attendees** | <!----><!---->[**List&lt;UserReference&gt;**](UserReference.html)<!----> | List of users attending the activity |  [optional] |
| **isOverdue** | <!----><!---->**Boolean**<!----> | Indicates if the activity is overdue |  [optional] |
{: class="table table-striped"}


<a name="ArchivalModeEnum"></a>

## Enum: ArchivalModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GRACEFUL | &quot;Graceful&quot; | 
| IMMEDIATE | &quot;Immediate&quot; | 
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INFORMATIONAL | &quot;Informational&quot; | 
| COACHING | &quot;Coaching&quot; | 
| ASSESSEDCONTENT | &quot;AssessedContent&quot; | 
| ASSESSMENT | &quot;Assessment&quot; | 
| EXTERNAL | &quot;External&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PLANNED | &quot;Planned&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| INVALIDSCHEDULE | &quot;InvalidSchedule&quot; | 
| NOTCOMPLETED | &quot;NotCompleted&quot; | 
{: class="table table-striped"}



