# JourneySessionEventsNotificationSessionEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **selfUri** | **String** |  |  [optional] |
| **createdDate** | [**Date**](Date) |  |  [optional] |
| **endedDate** | [**Date**](Date) |  |  [optional] |
| **externalContact** | [**JourneySessionEventsNotificationExternalContact**](JourneySessionEventsNotificationExternalContact) |  |  [optional] |
| **customerId** | **String** |  |  [optional] |
| **customerIdType** | **String** |  |  [optional] |
| **type** | **String** |  |  [optional] |
| **outcomeAchievements** | [**List&lt;JourneySessionEventsNotificationOutcomeAchievement&gt;**](JourneySessionEventsNotificationOutcomeAchievement) |  |  [optional] |
| **segmentAssignments** | [**List&lt;JourneySessionEventsNotificationSegmentAssignment&gt;**](JourneySessionEventsNotificationSegmentAssignment) |  |  [optional] |
| **awayDate** | [**Date**](Date) |  |  [optional] |
| **browser** | [**JourneySessionEventsNotificationBrowser**](JourneySessionEventsNotificationBrowser) |  |  [optional] |
| **device** | [**JourneySessionEventsNotificationDevice**](JourneySessionEventsNotificationDevice) |  |  [optional] |
| **geolocation** | [**JourneySessionEventsNotificationGeoLocation**](JourneySessionEventsNotificationGeoLocation) |  |  [optional] |
| **idleDate** | [**Date**](Date) |  |  [optional] |
| **ipAddress** | **String** |  |  [optional] |
| **ipOrganization** | **String** |  |  [optional] |
| **lastPage** | [**JourneySessionEventsNotificationPage**](JourneySessionEventsNotificationPage) |  |  [optional] |
| **mktCampaign** | [**JourneySessionEventsNotificationMktCampaign**](JourneySessionEventsNotificationMktCampaign) |  |  [optional] |
| **referrer** | [**JourneySessionEventsNotificationReferrer**](JourneySessionEventsNotificationReferrer) |  |  [optional] |
| **searchTerms** | **List&lt;String&gt;** |  |  [optional] |
| **userAgentString** | **String** |  |  [optional] |
| **durationInSeconds** | **Long** |  |  [optional] |
| **eventCount** | **Long** |  |  [optional] |
| **pageviewCount** | **Long** |  |  [optional] |
| **screenviewCount** | **Long** |  |  [optional] |
| **lastEvent** | [**JourneySessionEventsNotificationSessionLastEvent**](JourneySessionEventsNotificationSessionLastEvent) |  |  [optional] |
| **conversation** | [**JourneySessionEventsNotificationConversation**](JourneySessionEventsNotificationConversation) |  |  [optional] |
| **originatingDirection** | [**OriginatingDirectionEnum**](#Enum--OriginatingDirectionEnum) |  |  [optional] |
| **conversationSubject** | **String** |  |  [optional] |
| **lastUserDisposition** | [**JourneySessionEventsNotificationConversationUserDisposition**](JourneySessionEventsNotificationConversationUserDisposition) |  |  [optional] |
| **lastConnectedUser** | [**JourneySessionEventsNotificationUser**](JourneySessionEventsNotificationUser) |  |  [optional] |
| **lastConnectedQueue** | [**JourneySessionEventsNotificationConnectedQueue**](JourneySessionEventsNotificationConnectedQueue) |  |  [optional] |
| **conversationChannels** | [**List&lt;JourneySessionEventsNotificationConversationChannel&gt;**](JourneySessionEventsNotificationConversationChannel) |  |  [optional] |
| **lastUserDisconnectType** | [**LastUserDisconnectTypeEnum**](#Enum--LastUserDisconnectTypeEnum) |  |  [optional] |
| **lastAcdOutcome** | [**LastAcdOutcomeEnum**](#Enum--LastAcdOutcomeEnum) |  |  [optional] |
| **authenticated** | **Boolean** |  |  [optional] |
| **app** | [**JourneySessionEventsNotificationApp**](JourneySessionEventsNotificationApp) |  |  [optional] |
| **sdkLibrary** | [**JourneySessionEventsNotificationSdkLibrary**](JourneySessionEventsNotificationSdkLibrary) |  |  [optional] |
| **networkConnectivity** | [**JourneySessionEventsNotificationNetworkConnectivity**](JourneySessionEventsNotificationNetworkConnectivity) |  |  [optional] |
| **divisionIds** | **List&lt;String&gt;** |  |  [optional] |
| **lastScreen** | **String** |  |  [optional] |


## Enum: OriginatingDirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| INBOUND | &quot;Inbound&quot; | 
| OUTBOUND | &quot;Outbound&quot; | 


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
| DONOTDISTURBENDPOINT | &quot;DoNotDisturbEndpoint&quot; | 
| DONOTDISTURBTRANSFER | &quot;DoNotDisturbTransfer&quot; | 


## Enum: LastAcdOutcomeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ABANDON | &quot;Abandon&quot; | 
| ANSWERED | &quot;Answered&quot; | 
| FLOWOUT | &quot;FlowOut&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
