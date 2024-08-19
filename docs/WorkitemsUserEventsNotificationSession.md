# WorkitemsUserEventsNotificationSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **id** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **dateSessionStart** | **String** |  |  [optional] |
| **dateSessionEnd** | **String** |  |  [optional] |
| **assignmentSegments** | [**List&lt;WorkitemsUserEventsNotificationAssignmentSegment&gt;**](WorkitemsUserEventsNotificationAssignmentSegment) |  |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| AGENT | &quot;Agent&quot; | 
| QUEUEASSIGNMENT | &quot;QueueAssignment&quot; | 
| DIRECTASSIGNMENT | &quot;DirectAssignment&quot; | 
| AGENTCOMPLETE | &quot;AgentComplete&quot; | 
{: class="table table-striped"}


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ACTIVE | &quot;Active&quot; | 
| COMPLETED | &quot;Completed&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
