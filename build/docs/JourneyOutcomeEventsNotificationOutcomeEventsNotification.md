# JourneyOutcomeEventsNotificationOutcomeEventsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **correlationId** | **String** |  |  [optional] |
| **externalContact** | [**JourneyOutcomeEventsNotificationExternalContact**](JourneyOutcomeEventsNotificationExternalContact) |  |  [optional] |
| **createdDate** | [**Date**](Date) |  |  [optional] |
| **customerId** | **String** |  |  [optional] |
| **customerIdType** | **String** |  |  [optional] |
| **session** | [**JourneyOutcomeEventsNotificationSession**](JourneyOutcomeEventsNotificationSession) |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
| **outcomeAchievedEvent** | [**JourneyOutcomeEventsNotificationOutcomeAchievedMessage**](JourneyOutcomeEventsNotificationOutcomeAchievedMessage) |  |  [optional] |
| **outcomeAttributionEventMessage** | [**JourneyOutcomeEventsNotificationOutcomeAttributionMessage**](JourneyOutcomeEventsNotificationOutcomeAttributionMessage) |  |  [optional] |


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OUTCOMEACHIEVEDEVENT | &quot;OutcomeAchievedEvent&quot; | 
| OUTCOMEATTRIBUTIONEVENT | &quot;OutcomeAttributionEvent&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
