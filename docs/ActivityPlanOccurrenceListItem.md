# ActivityPlanOccurrenceListItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **runDate** | [**Date**](Date) | The date the associated activity plan was run, in ISO-8601 format |  |
| **sessionDateRange** | [**RequiredDateRange**](RequiredDateRange) | The dates potentially spanned by the sessions in this occurrence, even if no sessions currently exist |  |
| **facilitated** | **Boolean** | Whether the run sessions are facilitated |  |
| **sessionCount** | **Integer** | The number of sessions that were scheduled |  |
| **scheduledAttendeesCount** | **Integer** | The number of attendees that were scheduled for this occurrence |  |
| **unscheduledAttendeesCount** | **Integer** | The number of attendees that were unable to be scheduled for this occurrence |  |
| **edited** | **Boolean** | Whether this occurrence is edited |  [optional] |
| **violationCount** | **Integer** | The number of violations for this occurrence |  [optional] |
| **affectedScheduleIndexes** | **List&lt;Integer&gt;** | The index of the affected schedule summary in the schedules list |  |
| **createdBy** | [**UserReference**](UserReference) | The user who started the job which created this occurrence. The id may be 'System' if it was an automated process |  |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
