---
title: JourneySessionEventsNotificationSessionEvent
---
## JourneySessionEventsNotificationSessionEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **endedDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **externalContact** | <!----><!---->[**JourneySessionEventsNotificationExternalContact**](JourneySessionEventsNotificationExternalContact.html)<!----> |  |  [optional] |
| **customerId** | <!----><!---->**String**<!----> |  |  [optional] |
| **customerIdType** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalId** | <!----><!---->**String**<!----> |  |  [optional] |
| **externalUrl** | <!----><!---->**String**<!----> |  |  [optional] |
| **outcomeAchievements** | <!----><!---->[**List&lt;JourneySessionEventsNotificationOutcomeAchievement&gt;**](JourneySessionEventsNotificationOutcomeAchievement.html)<!----> |  |  [optional] |
| **segmentAssignments** | <!----><!---->[**List&lt;JourneySessionEventsNotificationSegmentAssignment&gt;**](JourneySessionEventsNotificationSegmentAssignment.html)<!----> |  |  [optional] |
| **attributes** | <!----><!---->[**Map&lt;String, JourneySessionEventsNotificationCustomEventAttribute&gt;**](JourneySessionEventsNotificationCustomEventAttribute.html)<!----> |  |  [optional] |
| **attributeLists** | <!----><!---->[**Map&lt;String, JourneySessionEventsNotificationCustomEventAttributeList&gt;**](JourneySessionEventsNotificationCustomEventAttributeList.html)<!----> |  |  [optional] |
| **awayDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **browser** | <!----><!---->[**JourneySessionEventsNotificationBrowser**](JourneySessionEventsNotificationBrowser.html)<!----> |  |  [optional] |
| **device** | <!----><!---->[**JourneySessionEventsNotificationDevice**](JourneySessionEventsNotificationDevice.html)<!----> |  |  [optional] |
| **geolocation** | <!----><!---->[**JourneySessionEventsNotificationGeoLocation**](JourneySessionEventsNotificationGeoLocation.html)<!----> |  |  [optional] |
| **idleDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **ipAddress** | <!----><!---->**String**<!----> |  |  [optional] |
| **ipOrganization** | <!----><!---->**String**<!----> |  |  [optional] |
| **lastPage** | <!----><!---->[**JourneySessionEventsNotificationPage**](JourneySessionEventsNotificationPage.html)<!----> |  |  [optional] |
| **mktCampaign** | <!----><!---->[**JourneySessionEventsNotificationMktCampaign**](JourneySessionEventsNotificationMktCampaign.html)<!----> |  |  [optional] |
| **referrer** | <!----><!---->[**JourneySessionEventsNotificationReferrer**](JourneySessionEventsNotificationReferrer.html)<!----> |  |  [optional] |
| **searchTerms** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **userAgentString** | <!----><!---->**String**<!----> |  |  [optional] |
| **durationInSeconds** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **eventCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **pageviewCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **screenviewCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **lastEvent** | <!----><!---->[**JourneySessionEventsNotificationSessionLastEvent**](JourneySessionEventsNotificationSessionLastEvent.html)<!----> |  |  [optional] |
| **conversation** | <!----><!---->[**JourneySessionEventsNotificationConversation**](JourneySessionEventsNotificationConversation.html)<!----> |  |  [optional] |
| **originatingDirection** | [**OriginatingDirectionEnum**](#OriginatingDirectionEnum)<!----> |  |  [optional] |
| **conversationSubject** | <!----><!---->**String**<!----> |  |  [optional] |
| **lastUserDisposition** | <!----><!---->[**JourneySessionEventsNotificationConversationUserDisposition**](JourneySessionEventsNotificationConversationUserDisposition.html)<!----> |  |  [optional] |
| **lastConnectedUser** | <!----><!---->[**JourneySessionEventsNotificationUser**](JourneySessionEventsNotificationUser.html)<!----> |  |  [optional] |
| **lastConnectedQueue** | <!----><!---->[**JourneySessionEventsNotificationConnectedQueue**](JourneySessionEventsNotificationConnectedQueue.html)<!----> |  |  [optional] |
| **conversationChannels** | <!----><!---->[**List&lt;JourneySessionEventsNotificationConversationChannel&gt;**](JourneySessionEventsNotificationConversationChannel.html)<!----> |  |  [optional] |
| **lastUserDisconnectType** | [**LastUserDisconnectTypeEnum**](#LastUserDisconnectTypeEnum)<!----> |  |  [optional] |
| **lastAcdOutcome** | [**LastAcdOutcomeEnum**](#LastAcdOutcomeEnum)<!----> |  |  [optional] |
| **authenticated** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="OriginatingDirectionEnum"></a>

## Enum: OriginatingDirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 
{: class="table table-striped"}


<a name="LastUserDisconnectTypeEnum"></a>

## Enum: LastUserDisconnectTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ENDPOINT | &quot;Endpoint&quot; | 
| CLIENT | &quot;Client&quot; | 
| SYSTEM | &quot;System&quot; | 
| TRANSFER | &quot;Transfer&quot; | 
| ERROR | &quot;Error&quot; | 
| PEER | &quot;Peer&quot; | 
| OTHER | &quot;Other&quot; | 
| SPAM | &quot;Spam&quot; | 
| TIMEOUT | &quot;Timeout&quot; | 
| TRANSPORTFAILURE | &quot;TransportFailure&quot; | 
| CONFERENCETRANSFER | &quot;ConferenceTransfer&quot; | 
| CONSULTTRANSFER | &quot;ConsultTransfer&quot; | 
| FORWARDTRANSFER | &quot;ForwardTransfer&quot; | 
| NOANSWERTRANSFER | &quot;NoAnswerTransfer&quot; | 
| NOTAVAILABLETRANSFER | &quot;NotAvailableTransfer&quot; | 
| UNCALLABLE | &quot;Uncallable&quot; | 
{: class="table table-striped"}


<a name="LastAcdOutcomeEnum"></a>

## Enum: LastAcdOutcomeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ABANDON | &quot;Abandon&quot; | 
| ANSWERED | &quot;Answered&quot; | 
| FLOWOUT | &quot;FlowOut&quot; | 
{: class="table table-striped"}



