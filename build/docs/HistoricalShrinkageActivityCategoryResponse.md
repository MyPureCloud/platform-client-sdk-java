---
title: HistoricalShrinkageActivityCategoryResponse
---
## HistoricalShrinkageActivityCategoryResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityCategory** | [**ActivityCategoryEnum**](#ActivityCategoryEnum)<!----> | Activity category for which shrinkage data is provided |  [optional] |
| **shrinkageForActivityCategory** | <!----><!---->[**HistoricalShrinkageAggregateResponse**](HistoricalShrinkageAggregateResponse.html)<!----> | Aggregated shrinkage data for the activity category |  [optional] |
| **shrinkageForActivityCodes** | <!----><!---->[**List&lt;HistoricalShrinkageActivityCodeResponse&gt;**](HistoricalShrinkageActivityCodeResponse.html)<!----> | Shrinkage for the activity codes under this activity category |  [optional] |
{: class="table table-striped"}


<a name="ActivityCategoryEnum"></a>

## Enum: ActivityCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ONQUEUEWORK | &quot;OnQueueWork&quot; | 
| BREAK | &quot;Break&quot; | 
| MEAL | &quot;Meal&quot; | 
| MEETING | &quot;Meeting&quot; | 
| OFFQUEUEWORK | &quot;OffQueueWork&quot; | 
| TIMEOFF | &quot;TimeOff&quot; | 
| TRAINING | &quot;Training&quot; | 
| UNAVAILABLE | &quot;Unavailable&quot; | 
| UNSCHEDULED | &quot;Unscheduled&quot; | 
{: class="table table-striped"}



