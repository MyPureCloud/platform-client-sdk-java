# JourneyWebEventsNotificationWebEventsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **correlationId** | **String** |  |  [optional] |
| **externalContact** | [**JourneyWebEventsNotificationExternalContact**](JourneyWebEventsNotificationExternalContact) |  |  [optional] |
| **createdDate** | [**Date**](Date) |  |  [optional] |
| **customerId** | **String** |  |  [optional] |
| **customerIdType** | **String** |  |  [optional] |
| **session** | [**JourneyWebEventsNotificationSession**](JourneyWebEventsNotificationSession) |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
| **webEvent** | [**JourneyWebEventsNotificationWebMessage**](JourneyWebEventsNotificationWebMessage) |  |  [optional] |
| **webActionEvent** | [**JourneyWebEventsNotificationWebActionMessage**](JourneyWebEventsNotificationWebActionMessage) |  |  [optional] |
| **outcomeAchievedEvent** | [**JourneyWebEventsNotificationOutcomeAchievedMessage**](JourneyWebEventsNotificationOutcomeAchievedMessage) |  |  [optional] |
| **segmentAssignmentEvent** | [**JourneyWebEventsNotificationSegmentAssignmentMessage**](JourneyWebEventsNotificationSegmentAssignmentMessage) |  |  [optional] |
{: class="table table-striped"}


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEBEVENT | &quot;WebEvent&quot; | 
| WEBACTIONEVENT | &quot;WebActionEvent&quot; | 
| OUTCOMEACHIEVEDEVENT | &quot;OutcomeAchievedEvent&quot; | 
| SEGMENTASSIGNMENTEVENT | &quot;SegmentAssignmentEvent&quot; | 
{: class="table table-striped"}



