# CoachingAppointmentResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of coaching appointment |  [optional] |
| **description** | **String** | The description of coaching appointment |  [optional] |
| **dateStart** | [**Date**](Date) | The date/time the coaching appointment starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthInMinutes** | **Integer** | The duration of coaching appointment in minutes |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of coaching appointment |  [optional] |
| **facilitator** | [**UserReference**](UserReference) | The facilitator of coaching appointment |  [optional] |
| **attendees** | [**List&lt;UserReference&gt;**](UserReference) | The list of attendees attending the coaching |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the coaching appointment |  [optional] |
| **dateCreated** | [**Date**](Date) | The date/time the coaching appointment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The last user to modify the coaching appointment |  [optional] |
| **dateModified** | [**Date**](Date) | The date/time the coaching appointment was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversations** | [**List&lt;ConversationReference&gt;**](ConversationReference) | The list of conversations associated with coaching appointment. |  [optional] |
| **documents** | [**List&lt;DocumentReference&gt;**](DocumentReference) | The list of documents associated with coaching appointment. |  [optional] |
| **isOverdue** | **Boolean** | Whether the appointment is overdue. |  [optional] |
| **wfmSchedule** | [**WfmScheduleReference**](WfmScheduleReference) | The Workforce Management schedule the appointment is associated with. |  [optional] |
| **dateCompleted** | [**Date**](Date) | The date/time the coaching appointment was set to completed status. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **externalLinks** | **List&lt;String&gt;** | The list of external links related to the appointment |  [optional] |
| **location** | **String** | The location of the appointment |  [optional] |
| **shareInsightsData** | **Boolean** | Whether to share the insight data |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SCHEDULED | &quot;Scheduled&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| INVALIDSCHEDULE | &quot;InvalidSchedule&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
