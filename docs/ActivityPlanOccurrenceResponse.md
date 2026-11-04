# ActivityPlanOccurrenceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  |
| **runDate** | [**Date**](Date) | The date the associated activity plan was run, in ISO-8601 format |  |
| **sessionDateRange** | [**RequiredDateRange**](RequiredDateRange) | The dates potentially spanned by the sessions in this occurrence, even if no sessions currently exist |  |
| **facilitated** | **Boolean** | Whether the run sessions are facilitated |  |
| **edited** | **Boolean** | Whether this occurrence is edited |  [optional] |
| **violations** | [**List&lt;ActivityPlanOccurrenceViolation&gt;**](ActivityPlanOccurrenceViolation) | The violations for this occurrence |  [optional] |
| **sessions** | [**List&lt;ActivityPlanOccurrenceSessionWithAttendees&gt;**](ActivityPlanOccurrenceSessionWithAttendees) | The sessions scheduled by the run |  |
| **unscheduledAttendees** | [**List&lt;ActivityPlanUnscheduledAttendee&gt;**](ActivityPlanUnscheduledAttendee) | The attendees who could not be scheduled for this occurrence |  |
| **affectedSchedules** | [**List&lt;BuScheduleSummary&gt;**](BuScheduleSummary) | Summaries of the schedules affected by this occurrence |  |
| **createdBy** | [**UserReference**](UserReference) | The user who started the job which created this occurrence |  |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
