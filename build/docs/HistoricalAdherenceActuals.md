---
title: HistoricalAdherenceActuals
---
## HistoricalAdherenceActuals


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **actualActivityCategory** | [**ActualActivityCategoryEnum**](#ActualActivityCategoryEnum)<!----> | Activity in which the user is actually engaged |  [optional] |
| **actualSecondaryPresenceLookupId** | <!----><!---->**String**<!----> | The lookup ID used to retrieve the actual secondary status from map of lookup ID to corresponding secondary presence ID |  [optional] |
| **startOffsetSeconds** | <!----><!---->**Integer**<!----> | Actual start offset in seconds relative to query start time |  [optional] |
| **endOffsetSeconds** | <!----><!---->**Integer**<!----> | Actual end offset in seconds relative to query start time |  [optional] |
{: class="table table-striped"}


<a name="ActualActivityCategoryEnum"></a>

## Enum: ActualActivityCategoryEnum

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



