---
title: FlowAggregationView
---
## FlowAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#TargetEnum)<!----> | Target metric name |  |
| **name** | <!----><!---->**String**<!----> | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#FunctionEnum)<!----> | Type of view you wish to create |  |
| **range** | <!----><!---->[**AggregationRange**](AggregationRange.html)<!----> | Range of numbers for slicing up data |  [optional] |
{: class="table table-striped"}


<a name="TargetEnum"></a>

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
{: class="table table-striped"}


<a name="FunctionEnum"></a>

## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 
{: class="table table-striped"}



