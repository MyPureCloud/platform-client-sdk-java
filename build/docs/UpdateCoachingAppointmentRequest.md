# UpdateCoachingAppointmentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of coaching appointment. |  [optional] |
| **description** | **String** | The description of coaching appointment. |  [optional] |
| **dateStart** | [**Date**](Date) | The date/time the coaching appointment starts. Times will be rounded down to the minute. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthInMinutes** | **Integer** | The duration of coaching appointment in minutes. |  [optional] |
| **conversationIds** | **List&lt;String&gt;** | IDs of conversations associated with this coaching appointment. |  [optional] |
| **documentIds** | **List&lt;String&gt;** | IDs of documents associated with this coaching appointment. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the coaching appointment. |  [optional] |
| **wfmSchedule** | [**WfmScheduleReference**](WfmScheduleReference) | The Workforce Management schedule the appointment is associated with. |  [optional] |
| **externalLinks** | **List&lt;String&gt;** | The list of external links related to the appointment |  [optional] |
| **location** | **String** | The location of the appointment |  [optional] |
| **shareInsightsData** | **Boolean** | Whether to share the insight data |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
