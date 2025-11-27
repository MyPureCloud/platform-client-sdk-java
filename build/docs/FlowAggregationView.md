# FlowAggregationView


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
| NFLOW | &quot;nFlow&quot; | 
| NFLOWMILESTONE | &quot;nFlowMilestone&quot; | 
| NFLOWOUTCOME | &quot;nFlowOutcome&quot; | 
| NFLOWOUTCOMEFAILED | &quot;nFlowOutcomeFailed&quot; | 
| OFLOWMILESTONE | &quot;oFlowMilestone&quot; | 
| TFLOW | &quot;tFlow&quot; | 
| TFLOWDISCONNECT | &quot;tFlowDisconnect&quot; | 
| TFLOWEXIT | &quot;tFlowExit&quot; | 
| TFLOWOUTCOME | &quot;tFlowOutcome&quot; | 


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
