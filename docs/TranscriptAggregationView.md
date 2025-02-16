# TranscriptAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#Enum--TargetEnum) | Target metric name |  |
| **name** | **String** | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#Enum--FunctionEnum) | Type of view you wish to create |  |
| **range** | [**AggregationRange**](AggregationRange) | Range of numbers for slicing up data |  [optional] |


## Enum: TargetEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NTOPICCOMMUNICATIONS | &quot;nTopicCommunications&quot; | 
| OCUSTOMERSENTIMENT | &quot;oCustomerSentiment&quot; | 
| OOVERTALKSPEECHINSTANCES | &quot;oOverTalkSpeechInstances&quot; | 
| OSENTIMENTSCORE | &quot;oSentimentScore&quot; | 
| TAGENTSPEECH | &quot;tAgentSpeech&quot; | 
| TCUSTOMERSPEECH | &quot;tCustomerSpeech&quot; | 
| TOTHERAUDIO | &quot;tOtherAudio&quot; | 
| TOVERTALKSPEECH | &quot;tOverTalkSpeech&quot; | 
| TSILENCE | &quot;tSilence&quot; | 
| TTOTALSPEECHANDSILENCE | &quot;tTotalSpeechAndSilence&quot; | 


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
