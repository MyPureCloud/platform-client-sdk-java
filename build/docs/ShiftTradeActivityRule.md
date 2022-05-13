---
title: ShiftTradeActivityRule
---
## ShiftTradeActivityRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityCategory** | [**ActivityCategoryEnum**](#ActivityCategoryEnum)<!----> | The activity category to which to apply this rule |  |
| **action** | [**ActionEnum**](#ActionEnum)<!----> | The action this rule invokes |  |
| **activityCodeIdReplacement** | <!----><!---->**String**<!----> | The activity code ID with which to replace activities belonging to the original category if applicable (required if action == Replace, must be a default activity code ID) |  [optional] |
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


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REPLACE | &quot;Replace&quot; | 
| DONOTALLOWTRADE | &quot;DoNotAllowTrade&quot; | 
| KEEPWITHSCHEDULE | &quot;KeepWithSchedule&quot; | 
{: class="table table-striped"}



