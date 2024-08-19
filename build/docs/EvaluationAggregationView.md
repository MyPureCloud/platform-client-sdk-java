# EvaluationAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#Enum--TargetEnum) | Target metric name |  |
| **name** | **String** | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#Enum--FunctionEnum) | Type of view you wish to create |  |
| **range** | [**AggregationRange**](AggregationRange) | Range of numbers for slicing up data |  [optional] |
{: class="table table-striped"}


## Enum: TargetEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEVALUATIONS | &quot;nEvaluations&quot; | 
| NEVALUATIONSDELETED | &quot;nEvaluationsDeleted&quot; | 
| NEVALUATIONSRESCORED | &quot;nEvaluationsRescored&quot; | 
| OTOTALCRITICALSCORE | &quot;oTotalCriticalScore&quot; | 
| OTOTALSCORE | &quot;oTotalScore&quot; | 
{: class="table table-striped"}


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
