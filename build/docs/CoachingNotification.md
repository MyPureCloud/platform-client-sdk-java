---
title: CoachingNotification
---
## CoachingNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the appointment for this notification. |  [optional] |
| **markedAsRead** | <!----><!---->**Boolean**<!----> | Indicates if notification is read or unread |  [optional] |
| **actionType** | [**ActionTypeEnum**](#ActionTypeEnum)<!----> | Action causing the notification. |  [optional] |
| **relationship** | [**RelationshipEnum**](#RelationshipEnum)<!----> | The relationship of this user to this notification's appointment |  [optional] |
| **dateStart** | <!----><!---->[**Date**](Date.html)<!----> | The start time of the appointment relating to this notification. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthInMinutes** | <!----><!---->**Integer**<!----> | The duration of the appointment on this notification |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the appointment for this notification |  [optional] |
| **user** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user of this notification |  [optional] |
| **appointment** | <!----><!---->[**CoachingAppointmentResponse**](CoachingAppointmentResponse.html)<!----> | The appointment |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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
| CREATOR | &quot;Creator&quot; | 
| FACILITATOR | &quot;Facilitator&quot; | 
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



