---
title: AnalyticsParticipant
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **participantId** | **String** |  |  [optional] |
| **participantName** | **String** |  |  [optional] |
| **userId** | **String** |  |  [optional] |
| **purpose** | [**PurposeEnum**](#PurposeEnum) |  |  [optional] |
| **externalContactId** | **String** |  |  [optional] |
| **externalOrganizationId** | **String** |  |  [optional] |
| **sessions** | [**List&lt;AnalyticsSession&gt;**](AnalyticsSession.html) |  |  [optional] |
{: class="table table-striped"}


<a name="PurposeEnum"></a>

## Enum: PurposeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| MANUAL | &quot;manual&quot; |
| DIALER | &quot;dialer&quot; |
| INBOUND | &quot;inbound&quot; |
| ACD | &quot;acd&quot; |
| IVR | &quot;ivr&quot; |
| VOICEMAIL | &quot;voicemail&quot; |
| OUTBOUND | &quot;outbound&quot; |
| AGENT | &quot;agent&quot; |
| USER | &quot;user&quot; |
| STATION | &quot;station&quot; |
| GROUP | &quot;group&quot; |
| CUSTOMER | &quot;customer&quot; |
| EXTERNAL | &quot;external&quot; |
{: class="table table-striped"}


