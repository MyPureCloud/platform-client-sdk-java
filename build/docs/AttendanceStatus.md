---
title: AttendanceStatus
---
## AttendanceStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateWorkday** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | the workday date of this attendance status. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **attendanceStatusType** | [**AttendanceStatusTypeEnum**](#AttendanceStatusTypeEnum)<!----> | the attendance status |  [optional] |
{: class="table table-striped"}


<a name="AttendanceStatusTypeEnum"></a>

## Enum: AttendanceStatusTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HASDATA | &quot;HasData&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| ABSENT | &quot;Absent&quot; | 
| PRESENT | &quot;Present&quot; | 
| NOSCHEDULE | &quot;NoSchedule&quot; | 
{: class="table table-striped"}



