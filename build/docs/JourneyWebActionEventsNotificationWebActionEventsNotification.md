---
title: JourneyWebActionEventsNotificationWebActionEventsNotification
---
## JourneyWebActionEventsNotificationWebActionEventsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **correlationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalContact** | <!----><!---->[**JourneyWebActionEventsNotificationExternalContact**](JourneyWebActionEventsNotificationExternalContact.html)<!----> |  |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **customerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **customerIdType** | <!----><!---->**String**<!----> |  |  [optional] |
| **session** | <!----><!---->[**JourneyWebActionEventsNotificationSession**](JourneyWebActionEventsNotificationSession.html)<!----> |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!----> |  |  [optional] |
| **webActionEvent** | <!----><!---->[**JourneyWebActionEventsNotificationWebActionMessage**](JourneyWebActionEventsNotificationWebActionMessage.html)<!----> |  |  [optional] |
| **blockedWebActionOfferEvent** | <!----><!---->[**JourneyWebActionEventsNotificationBlockedWebActionOfferMessage**](JourneyWebActionEventsNotificationBlockedWebActionOfferMessage.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEBACTIONEVENT | &quot;WebActionEvent&quot; | 
| BLOCKEDWEBACTIONOFFEREVENT | &quot;BlockedWebActionOfferEvent&quot; | 
{: class="table table-striped"}



