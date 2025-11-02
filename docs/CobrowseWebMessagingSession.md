# CobrowseWebMessagingSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **joinCode** | **String** | Cobrowse session join code |  [optional] |
| **websocketUrl** | **String** | WebSocket URL for the JS client |  [optional] |
| **dateOfferEnds** | [**Date**](Date) | Date when Cobrowse Offer Expires. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **communicationType** | [**CommunicationTypeEnum**](#Enum--CommunicationTypeEnum) | CommunicationType for Cobrowse Session |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: CommunicationTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;Call&quot; | 
| MESSAGE | &quot;Message&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
