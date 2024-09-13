# BotAggregationView


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
| NBOTSESSIONTURNS | &quot;nBotSessionTurns&quot; | 
| NBOTSESSIONS | &quot;nBotSessions&quot; | 
| OBOTINTENT | &quot;oBotIntent&quot; | 
| OBOTSESSIONCOLLECTION | &quot;oBotSessionCollection&quot; | 
| OBOTSESSIONCOLLECTIONSELFSERVED | &quot;oBotSessionCollectionSelfServed&quot; | 
| OBOTSESSIONQUERY | &quot;oBotSessionQuery&quot; | 
| OBOTSESSIONQUERYSELFSERVED | &quot;oBotSessionQuerySelfServed&quot; | 
| OBOTSESSIONTURN | &quot;oBotSessionTurn&quot; | 
| OBOTSLOT | &quot;oBotSlot&quot; | 
| TBOTDISCONNECT | &quot;tBotDisconnect&quot; | 
| TBOTEXIT | &quot;tBotExit&quot; | 
| TBOTRECOGNITIONFAILURE | &quot;tBotRecognitionFailure&quot; | 
| TBOTSESSION | &quot;tBotSession&quot; | 


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
