---
title: CobrowseWebMessagingSession
---
## CobrowseWebMessagingSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **joinCode** | <!----><!---->**String**<!----> | Cobrowse session join code |  [optional] |
| **websocketUrl** | <!----><!---->**String**<!----> | WebSocket URL for the JS client |  [optional] |
| **dateOfferEnds** | <!----><!---->[**Date**](Date.html)<!----> | Date when Cobrowse Offer Expires. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **communicationType** | [**CommunicationTypeEnum**](#CommunicationTypeEnum)<!----> | CommunicationType for Cobrowse Session |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="CommunicationTypeEnum"></a>

## Enum: CommunicationTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;Call&quot; | 
| MESSAGE | &quot;Message&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



