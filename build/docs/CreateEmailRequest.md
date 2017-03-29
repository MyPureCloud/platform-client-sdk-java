---
title: CreateEmailRequest
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queueId** | **String** | The ID of the queue to use for routing the chat conversation. |  |
| **provider** | **String** | The name of the provider that is sourcing the web chat. |  |
| **skillIds** | **List&lt;String&gt;** | The list of skill ID&#39;s to use for routing. |  [optional] |
| **languageId** | **String** | The ID of the langauge to use for routing. |  [optional] |
| **priority** | **Long** | The priority to assign to the conversation for routing. |  [optional] |
| **attributes** | **Map&lt;String, String&gt;** | The list of attributes to associate with the customer participant. |  [optional] |
| **toAddress** | **String** | The email address of the recipient of the email. |  [optional] |
| **toName** | **String** | The name of the recipient of the email. |  [optional] |
| **fromAddress** | **String** | The email address of the sender of the email. |  [optional] |
| **fromName** | **String** | The name of the sender of the email. |  [optional] |
| **subject** | **String** | The subject of the email |  [optional] |
| **direction** | [**DirectionEnum**](#DirectionEnum) | Specify INBOUND to create an inbound email conversation to route to a queue, or OUTBOUND to send an email on behalf of a queue. |  [optional] |
{: class="table table-striped"}


<a name="DirectionEnum"></a>

## Enum: DirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| OUTBOUND | &quot;OUTBOUND&quot; |
| INBOUND | &quot;INBOUND&quot; |
{: class="table table-striped"}


