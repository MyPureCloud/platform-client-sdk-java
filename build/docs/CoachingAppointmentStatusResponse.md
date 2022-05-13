---
title: CoachingAppointmentStatusResponse
---
## CoachingAppointmentStatusResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **appointment** | <!----><!---->[**CoachingAppointmentReference**](CoachingAppointmentReference.html)<!----> | The coaching appointment this status belongs to |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | User who updated the status |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the coaching appointment |  [optional] |
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



