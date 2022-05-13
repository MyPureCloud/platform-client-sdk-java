---
title: ConversationMetrics
---
## ConversationMetrics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversation** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The Conversation Reference |  [optional] |
| **sentimentScore** | <!----><!---->**Double**<!----> | The Sentiment Score |  [optional] |
| **sentimentTrend** | <!----><!---->**Double**<!----> | The Sentiment Trend |  [optional] |
| **sentimentTrendClass** | [**SentimentTrendClassEnum**](#SentimentTrendClassEnum)<!----> | The Sentiment Trend Class |  [optional] |
| **participantMetrics** | <!----><!---->[**ParticipantMetrics**](ParticipantMetrics.html)<!----> | The Participant Metrics |  [optional] |
{: class="table table-striped"}


<a name="SentimentTrendClassEnum"></a>

## Enum: SentimentTrendClassEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOTCALCULATED | &quot;NotCalculated&quot; | 
| DECLINING | &quot;Declining&quot; | 
| SLIGHTLYDECLINING | &quot;SlightlyDeclining&quot; | 
| NOCHANGE | &quot;NoChange&quot; | 
| SLIGHTLYIMPROVING | &quot;SlightlyImproving&quot; | 
| IMPROVING | &quot;Improving&quot; | 
{: class="table table-striped"}



