---
title: WemCoachingUserNotificationTopicCoachingUserNotification
---
## WemCoachingUserNotificationTopicCoachingUserNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **markedAsRead** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **actionType** | [**ActionTypeEnum**](#ActionTypeEnum)<!----> |  |  [optional] |
| **relationship** | [**RelationshipEnum**](#RelationshipEnum)<!----> |  |  [optional] |
| **appointment** | <!----><!---->[**WemCoachingUserNotificationTopicCoachingAppointmentReference**](WemCoachingUserNotificationTopicCoachingAppointmentReference.html)<!----> |  |  [optional] |
| **dateStart** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **lengthInMinutes** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ActionTypeEnum"></a>

## Enum: ActionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATE | &quot;Create&quot; | 
| UPDATE | &quot;Update&quot; | 
| DELETE | &quot;Delete&quot; | 
| STATUSCHANGE | &quot;StatusChange&quot; | 
{: class="table table-striped"}


<a name="RelationshipEnum"></a>

## Enum: RelationshipEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDEE | &quot;Attendee&quot; | 
| FACILITATOR | &quot;Facilitator&quot; | 
| CREATOR | &quot;Creator&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| INVALIDSCHEDULE | &quot;InvalidSchedule&quot; | 
{: class="table table-striped"}



