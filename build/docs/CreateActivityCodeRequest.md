# CreateActivityCodeRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the activity code |  |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) | The activity code's category |  |
| **lengthInMinutes** | **Integer** | The default length of the activity in minutes |  [optional] |
| **countsAsPaidTime** | **Boolean** | Whether an agent is paid while performing this activity |  [optional] |
| **countsAsWorkTime** | **Boolean** | Indicates whether or not the activity should be counted as work time |  [optional] |
| **agentTimeOffSelectable** | **Boolean** | Whether an agent can select this activity code when creating or editing a time off request |  [optional] |
| **countsTowardShrinkage** | **Boolean** | Whether or not this activity code counts toward shrinkage calculations |  [optional] |
| **plannedShrinkage** | **Boolean** | Whether this activity code is considered planned or unplanned shrinkage |  [optional] |
| **interruptible** | **Boolean** | Whether this activity code is considered interruptible |  [optional] |
| **secondaryPresences** | [**List&lt;SecondaryPresence&gt;**](SecondaryPresence) | The secondary presences of this activity code |  [optional] |


## Enum: CategoryEnum

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




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
