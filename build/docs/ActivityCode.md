---
title: ActivityCode
---
## ActivityCode


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the activity code. Default activity codes will be created with an empty name |  [optional] |
| **isActive** | <!----><!---->**Boolean**<!----> | Whether this activity code is active or has been deleted |  [optional] |
| **isDefault** | <!----><!---->**Boolean**<!----> | Whether this is a default activity code |  [optional] |
| **category** | [**CategoryEnum**](#CategoryEnum)<!----> | The activity code's category. |  [optional] |
| **lengthInMinutes** | <!----><!---->**Integer**<!----> | The default length of the activity in minutes |  [optional] |
| **countsAsPaidTime** | <!----><!---->**Boolean**<!----> | Whether an agent is paid while performing this activity |  [optional] |
| **countsAsWorkTime** | <!----><!---->**Boolean**<!----> | Indicates whether or not the activity should be counted as contiguous work time for calculating daily constraints |  [optional] |
| **agentTimeOffSelectable** | <!----><!---->**Boolean**<!----> | Whether an agent can select this activity code when creating or editing a time off request. Null if the activity's category is not time off. |  [optional] |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for the associated management unit's list of activity codes |  |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

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
{: class="table table-striped"}



