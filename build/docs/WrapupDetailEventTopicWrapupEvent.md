---
title: WrapupDetailEventTopicWrapupEvent
---
## WrapupDetailEventTopicWrapupEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventTime** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **conversationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **participantId** | <!----><!---->**String**<!----> |  |  [optional] |
| **sessionId** | <!----><!---->**String**<!----> |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> |  |  [optional] |
| **provider** | <!----><!---->**String**<!----> |  |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum)<!----> |  |  [optional] |
| **ani** | <!----><!---->**String**<!----> |  |  [optional] |
| **dnis** | <!----><!---->**String**<!----> |  |  [optional] |
| **addressTo** | <!----><!---->**String**<!----> |  |  [optional] |
| **addressFrom** | <!----><!---->**String**<!----> |  |  [optional] |
| **callbackUserName** | <!----><!---->**String**<!----> |  |  [optional] |
| **callbackNumbers** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **callbackScheduledTime** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **subject** | <!----><!---->**String**<!----> |  |  [optional] |
| **messageType** | [**MessageTypeEnum**](#MessageTypeEnum)<!----> |  |  [optional] |
| **queueId** | <!----><!---->**String**<!----> |  |  [optional] |
| **wrapupCode** | <!----><!---->**String**<!----> |  |  [optional] |
| **wrapupNotes** | <!----><!---->**String**<!----> |  |  [optional] |
| **wrapupDurationMs** | <!----><!---->**Integer**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| VOICE | &quot;VOICE&quot; |
| CHAT | &quot;CHAT&quot; |
| EMAIL | &quot;EMAIL&quot; |
| CALLBACK | &quot;CALLBACK&quot; |
| COBROWSE | &quot;COBROWSE&quot; |
| VIDEO | &quot;VIDEO&quot; |
| SCREENSHARE | &quot;SCREENSHARE&quot; |
| MESSAGE | &quot;MESSAGE&quot; |
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| INBOUND | &quot;INBOUND&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |
{: class="table table-striped"}


<a name="MessageTypeEnum"></a>

## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNKNOWN | &quot;UNKNOWN&quot; |
| SMS | &quot;SMS&quot; |
| TWITTER | &quot;TWITTER&quot; |
| FACEBOOK | &quot;FACEBOOK&quot; |
| LINE | &quot;LINE&quot; |
| WHATSAPP | &quot;WHATSAPP&quot; |
| WEBMESSAGING | &quot;WEBMESSAGING&quot; |
| OPEN | &quot;OPEN&quot; |
| INSTAGRAM | &quot;INSTAGRAM&quot; |
{: class="table table-striped"}



