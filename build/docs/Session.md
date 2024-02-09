---
title: Session
---
## Session


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The ID of the session. |  |
| **customerId** | <!----><!---->**String**<!----> | Primary identifier of the customer in the source where the events for the session originate from. |  [optional] |
| **customerIdType** | <!----><!---->**String**<!----> | Type of source customer identifier (e.g. cookie, email, phone). |  [optional] |
| **type** | <!----><!---->**String**<!----> | Session types indicate the type or category of sessions (e.g. web, app). |  |
| **externalId** | <!----><!---->**String**<!----> | Unique identifier in the external system where the events for the session originate from. |  [optional] |
| **externalUrl** | <!----><!---->**String**<!----> | A URL that identifies an external system-of-record resource that may have more detailed information on the session. |  [optional] |
| **shortId** | <!----><!---->**String**<!----> | Shortened numeric identifier of 4-6 digits. |  [optional] |
| **outcomeAchievements** | <!----><!---->[**List&lt;OutcomeAchievement&gt;**](OutcomeAchievement.html)<!----> | List of the outcome achievements by the customer in this session. |  [optional] |
| **segmentAssignments** | <!----><!---->[**List&lt;SessionSegmentAssignment&gt;**](SessionSegmentAssignment.html)<!----> | List of the segment assignments to the customer in this session. |  [optional] |
| **attributes** | <!----><!---->[**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute.html)<!----> | Attributes projected from the session's event stream. |  [optional] |
| **attributeLists** | <!----><!---->[**Map&lt;String, CustomEventAttributeList&gt;**](CustomEventAttributeList.html)<!----> | List-type attributes projected from the session's event stream. |  [optional] |
| **browser** | <!----><!---->[**Browser**](Browser.html)<!----> | Customer's browser. |  [optional] |
| **device** | <!----><!---->[**Device**](Device.html)<!----> | Customer's device. |  [optional] |
| **geolocation** | <!----><!---->[**JourneyGeolocation**](JourneyGeolocation.html)<!----> | Customer's geolocation. |  [optional] |
| **ipAddress** | <!----><!---->**String**<!----> | Customer's IP address. |  [optional] |
| **ipOrganization** | <!----><!---->**String**<!----> | Customer's IP-based organization or ISP name. |  [optional] |
| **lastPage** | <!----><!---->[**JourneyPage**](JourneyPage.html)<!----> | The webpage where the customer's last web interaction occurred. |  [optional] |
| **mktCampaign** | <!----><!---->[**JourneyCampaign**](JourneyCampaign.html)<!----> | Marketing / traffic source information. |  [optional] |
| **referrer** | <!----><!---->[**Referrer**](Referrer.html)<!----> | Identifies the page URL that originally generated the request for the current page being viewed. |  [optional] |
| **app** | <!----><!---->[**JourneyApp**](JourneyApp.html)<!----> | Application that the customer is interacting with (for app sessions). |  [optional] |
| **sdkLibrary** | <!----><!---->[**SdkLibrary**](SdkLibrary.html)<!----> | SDK library used to generate the events for the session (for app and web sessions). |  [optional] |
| **networkConnectivity** | <!----><!---->[**NetworkConnectivity**](NetworkConnectivity.html)<!----> | Information relating to the device's network connectivity (for app sessions). |  [optional] |
| **searchTerms** | <!----><!---->**List&lt;String&gt;**<!----> | Search terms associated with the session. |  [optional] |
| **userAgentString** | <!----><!---->**String**<!----> | String identifying the user agent. |  [optional] |
| **durationInSeconds** | <!----><!---->**Integer**<!----> | Indicates how long the session has been active (valid for an individual device). |  [optional] |
| **eventCount** | <!----><!---->**Integer**<!----> | The count of all events performed during the session. |  |
| **pageviewCount** | <!----><!---->**Integer**<!----> | The count of all pageviews performed during the session. |  [optional] |
| **screenviewCount** | <!----><!---->**Integer**<!----> | The count of all screenviews performed during the session. |  [optional] |
| **lastEvent** | <!----><!---->[**SessionLastEvent**](SessionLastEvent.html)<!----> | Information about the most recent event in this session. |  |
| **lastConnectedQueue** | <!----><!---->[**ConnectedQueue**](ConnectedQueue.html)<!----> | The last queue connected to this session. |  [optional] |
| **lastConnectedUser** | <!----><!---->[**ConnectedUser**](ConnectedUser.html)<!----> | The last user connected to this session. |  [optional] |
| **lastUserDisposition** | <!----><!---->[**ConversationUserDisposition**](ConversationUserDisposition.html)<!----> | The last user disposition connected to this session. |  [optional] |
| **conversationChannels** | <!----><!---->[**List&lt;ConversationChannel&gt;**](ConversationChannel.html)<!----> | Represents the channels used for this conversation. |  [optional] |
| **originatingDirection** | [**OriginatingDirectionEnum**](#OriginatingDirectionEnum)<!----> | The original direction of the conversation. |  [optional] |
| **conversationSubject** | <!----><!---->**String**<!----> | The subject for the conversation, for example an email subject. |  [optional] |
| **lastUserDisconnectType** | [**LastUserDisconnectTypeEnum**](#LastUserDisconnectTypeEnum)<!----> | Disconnect reason for the last user connected to the conversation. |  [optional] |
| **lastAcdOutcome** | [**LastAcdOutcomeEnum**](#LastAcdOutcomeEnum)<!----> | Last ACD outcome for the conversation. |  [optional] |
| **authenticated** | <!----><!---->**Boolean**<!----> | Indicates whether or not the session is authenticated. |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp indicating when the session was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **endedDate** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp indicating when the session was ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **externalContact** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The external contact associated with this session. |  [optional] |
| **awayDate** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp indicating when the visitor should be considered as away. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **idleDate** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp indicating when the visitor should be considered as idle. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **conversation** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The conversation for this session. |  [optional] |
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
| DONOTDISTURBENDPOINT | &quot;DoNotDisturbEndpoint&quot; | 
| DONOTDISTURBTRANSFER | &quot;DoNotDisturbTransfer&quot; | 
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



