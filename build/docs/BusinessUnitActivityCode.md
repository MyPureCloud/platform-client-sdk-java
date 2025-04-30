# BusinessUnitActivityCode


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **active** | **Boolean** | Whether this activity code is active or has been deleted |  [optional] |
| **defaultCode** | **Boolean** | Whether this is a default activity code |  [optional] |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) | The category of the activity code |  [optional] |
| **lengthInMinutes** | **Integer** | The default length of the activity in minutes |  [optional] |
| **countsAsPaidTime** | **Boolean** | Whether an agent is paid while performing this activity |  [optional] |
| **countsAsWorkTime** | **Boolean** | Indicates whether or not the activity should be counted as contiguous work time for calculating daily constraints |  [optional] |
| **agentTimeOffSelectable** | **Boolean** | Whether an agent can select this activity code when creating or editing a time off request. Null if the activity's category is not time off. |  [optional] |
| **countsTowardShrinkage** | **Boolean** | Whether or not this activity code counts toward shrinkage calculations |  [optional] |
| **plannedShrinkage** | **Boolean** | Whether this activity code is considered planned or unplanned shrinkage |  [optional] |
| **interruptible** | **Boolean** | Whether this activity code is considered interruptible |  [optional] |
| **secondaryPresences** | [**List&lt;SecondaryPresence&gt;**](SecondaryPresence) | The secondary presences of this activity code |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Version metadata of this activity code |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
