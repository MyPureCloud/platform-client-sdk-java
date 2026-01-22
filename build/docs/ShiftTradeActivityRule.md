# ShiftTradeActivityRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **activityCategory** | [**ActivityCategoryEnum**](#Enum--ActivityCategoryEnum) | The activity category to which to apply this rule |  |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The action this rule invokes |  |
| **activityCodeIdReplacement** | **String** | The ID of the activity code with which to replace activities belonging to the original category if applicable (required if action == Replace, must be a default activity code ID) |  [optional] |


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


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REPLACE | &quot;Replace&quot; | 
| DONOTALLOWTRADE | &quot;DoNotAllowTrade&quot; | 
| KEEPWITHSCHEDULE | &quot;KeepWithSchedule&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
