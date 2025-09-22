# JourneyWebActionEventsNotificationWebActionEventsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **correlationId** | **String** |  |  [optional] |
| **externalContact** | [**JourneyWebActionEventsNotificationExternalContact**](JourneyWebActionEventsNotificationExternalContact) |  |  [optional] |
| **createdDate** | [**Date**](Date) |  |  [optional] |
| **customerId** | **String** |  |  [optional] |
| **customerIdType** | **String** |  |  [optional] |
| **session** | [**JourneyWebActionEventsNotificationSession**](JourneyWebActionEventsNotificationSession) |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#Enum--EventTypeEnum) |  |  [optional] |
| **webActionEvent** | [**JourneyWebActionEventsNotificationWebActionMessage**](JourneyWebActionEventsNotificationWebActionMessage) |  |  [optional] |
| **blockedWebActionOfferEvent** | [**JourneyWebActionEventsNotificationBlockedWebActionOfferMessage**](JourneyWebActionEventsNotificationBlockedWebActionOfferMessage) |  |  [optional] |


## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEBACTIONEVENT | &quot;WebActionEvent&quot; | 
| BLOCKEDWEBACTIONOFFEREVENT | &quot;BlockedWebActionOfferEvent&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
