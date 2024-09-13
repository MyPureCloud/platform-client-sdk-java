# ConversationMetrics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conversation** | [**AddressableEntityRef**](AddressableEntityRef) | The Conversation Reference |  [optional] |
| **sentimentScore** | **Double** | The Sentiment Score |  [optional] |
| **sentimentTrend** | **Double** | The Sentiment Trend |  [optional] |
| **sentimentTrendClass** | [**SentimentTrendClassEnum**](#Enum--SentimentTrendClassEnum) | The Sentiment Trend Class |  [optional] |
| **empathyScores** | [**List&lt;EmpathyScore&gt;**](EmpathyScore) | The Empathy Scores |  [optional] |
| **participantMetrics** | [**ParticipantMetrics**](ParticipantMetrics) | The Participant Metrics |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
