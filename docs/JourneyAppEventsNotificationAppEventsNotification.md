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
| **segmentAssignmentEvent** | [**JourneyAppEventsNotificationSegmentAssignmentMessage**](JourneyAppEventsNotificationSegmentAssignmentMessage) |  |  [optional] |
| **webActionEvent** | [**JourneyAppEventsNotificationWebActionMessage**](JourneyAppEventsNotificationWebActionMessage) |  |  [optional] |


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPEVENT | &quot;AppEvent&quot; | 
| SEGMENTASSIGNMENTEVENT | &quot;SegmentAssignmentEvent&quot; | 
| WEBACTIONEVENT | &quot;WebActionEvent&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:265.0.0_
