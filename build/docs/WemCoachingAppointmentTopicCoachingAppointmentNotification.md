---
title: WemCoachingAppointmentTopicCoachingAppointmentNotification
---
## WemCoachingAppointmentTopicCoachingAppointmentNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateStart** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **lengthInMinutes** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **facilitator** | <!----><!---->[**WemCoachingAppointmentTopicUserReference**](WemCoachingAppointmentTopicUserReference.html)<!----> |  |  [optional] |
| **attendees** | <!----><!---->[**List&lt;WemCoachingAppointmentTopicUserReference&gt;**](WemCoachingAppointmentTopicUserReference.html)<!----> |  |  [optional] |
| **createdBy** | <!----><!---->[**WemCoachingAppointmentTopicUserReference**](WemCoachingAppointmentTopicUserReference.html)<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **modifiedBy** | <!----><!---->[**WemCoachingAppointmentTopicUserReference**](WemCoachingAppointmentTopicUserReference.html)<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **conversations** | <!----><!---->[**List&lt;WemCoachingAppointmentTopicCoachingAppointmentConversation&gt;**](WemCoachingAppointmentTopicCoachingAppointmentConversation.html)<!----> |  |  [optional] |
| **documents** | <!----><!---->[**List&lt;WemCoachingAppointmentTopicCoachingAppointmentDocument&gt;**](WemCoachingAppointmentTopicCoachingAppointmentDocument.html)<!----> |  |  [optional] |
| **changeType** | [**ChangeTypeEnum**](#ChangeTypeEnum)<!----> |  |  [optional] |
| **dateCompleted** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **externalLinks** | <!----><!---->[**List&lt;WemCoachingAppointmentTopicCoachingAppointmentExternalLink&gt;**](WemCoachingAppointmentTopicCoachingAppointmentExternalLink.html)<!----> |  |  [optional] |
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


<a name="ChangeTypeEnum"></a>

## Enum: ChangeTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATE | &quot;Create&quot; | 
| UPDATE | &quot;Update&quot; | 
| DELETE | &quot;Delete&quot; | 
| INVALIDATE | &quot;Invalidate&quot; | 
{: class="table table-striped"}



