---
title: AnalyticsSession
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional] |
| **sessionId** | **String** |  |  [optional] |
| **addressOther** | **String** |  |  [optional] |
| **addressSelf** | **String** |  |  [optional] |
| **ani** | **String** |  |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum) |  |  [optional] |
| **dnis** | **String** |  |  [optional] |
| **outboundCampaignId** | **String** |  |  [optional] |
| **outboundContactId** | **String** |  |  [optional] |
| **outboundContactListId** | **String** |  |  [optional] |
| **dispositionAnalyzer** | **String** |  |  [optional] |
| **dispositionName** | **String** |  |  [optional] |
| **edgeId** | **String** |  |  [optional] |
| **remoteNameDisplayable** | **String** |  |  [optional] |
| **roomId** | **String** |  |  [optional] |
| **monitoredSessionId** | **String** |  |  [optional] |
| **monitoredParticipantId** | **String** |  |  [optional] |
| **callbackUserName** | **String** |  |  [optional] |
| **callbackNumbers** | **List&lt;String&gt;** |  |  [optional] |
| **callbackScheduledTime** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **scriptId** | **String** |  |  [optional] |
| **skipEnabled** | **Boolean** |  |  [optional] |
| **timeoutSeconds** | **Integer** |  |  [optional] |
| **cobrowseRole** | **String** |  |  [optional] |
| **cobrowseRoomId** | **String** |  |  [optional] |
| **mediaBridgeId** | **String** |  |  [optional] |
| **screenShareAddressSelf** | **String** |  |  [optional] |
| **sharingScreen** | **Boolean** |  |  [optional] |
| **screenShareRoomId** | **String** |  |  [optional] |
| **videoRoomId** | **String** |  |  [optional] |
| **videoAddressSelf** | **String** |  |  [optional] |
| **segments** | [**List&lt;AnalyticsConversationSegment&gt;**](AnalyticsConversationSegment.html) |  |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| VOICE | &quot;voice&quot; |
| CHAT | &quot;chat&quot; |
| EMAIL | &quot;email&quot; |
| CALLBACK | &quot;callback&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| VIDEO | &quot;video&quot; |
| SCREENSHARE | &quot;screenshare&quot; |


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INBOUND | &quot;inbound&quot; |
| OUTBOUND | &quot;outbound&quot; |
{: class="table table-striped"}


