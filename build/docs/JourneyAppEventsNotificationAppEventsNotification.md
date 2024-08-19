# JourneyAppEventsNotificationAppEventsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **correlationId** | **String** |  |  [optional] |
| **externalContact** | [**JourneyAppEventsNotificationExternalContact**](JourneyAppEventsNotificationExternalContact) |  |  [optional] |
| **createdDate** | [**Date**](Date) |  |  [optional] |
| **customerId** | **String** |  |  [optional] |
| **customerIdType** | **String** |  |  [optional] |
| **session** | [**JourneyAppEventsNotificationSession**](JourneyAppEventsNotificationSession) |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
| **appEvent** | [**JourneyAppEventsNotificationAppMessage**](JourneyAppEventsNotificationAppMessage) |  |  [optional] |
| **outcomeAchievedEvent** | [**JourneyAppEventsNotificationOutcomeAchievedMessage**](JourneyAppEventsNotificationOutcomeAchievedMessage) |  |  [optional] |
| **segmentAssignmentEvent** | [**JourneyAppEventsNotificationSegmentAssignmentMessage**](JourneyAppEventsNotificationSegmentAssignmentMessage) |  |  [optional] |
{: class="table table-striped"}


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPEVENT | &quot;AppEvent&quot; | 
| OUTCOMEACHIEVEDEVENT | &quot;OutcomeAchievedEvent&quot; | 
| SEGMENTASSIGNMENTEVENT | &quot;SegmentAssignmentEvent&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
