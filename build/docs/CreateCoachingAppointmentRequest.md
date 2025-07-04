# CreateCoachingAppointmentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of coaching appointment. |  |
| **description** | **String** | The description of coaching appointment. |  |
| **dateStart** | [**Date**](Date) | The date/time the coaching appointment starts. Times will be rounded down to the minute. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **lengthInMinutes** | **Integer** | The duration of coaching appointment in minutes. |  |
| **facilitatorId** | **String** | The facilitator ID of coaching appointment. |  [optional] |
| **attendeeIds** | **List&lt;String&gt;** | IDs of attendees in the coaching appointment. |  |
| **conversationIds** | **List&lt;String&gt;** | IDs of conversations associated with this coaching appointment. |  [optional] |
| **documentIds** | **List&lt;String&gt;** | IDs of documents associated with this coaching appointment. |  [optional] |
| **wfmSchedule** | [**WfmScheduleReference**](WfmScheduleReference) | The Workforce Management schedule the appointment is associated with. |  [optional] |
| **externalLinks** | **List&lt;String&gt;** | The list of external links related to the appointment |  [optional] |
| **location** | **String** | The location of the appointment |  [optional] |
| **shareInsightsData** | **Boolean** | Whether to share the insight data |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
