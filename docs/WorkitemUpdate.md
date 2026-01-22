# WorkitemUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Workitem. Valid length between 3 and 256 characters. |  [optional] |
| **priority** | **Integer** | The priority of the Workitem. The valid range is between -25,000,000 and 25,000,000. |  [optional] |
| **dateDue** | [**Date**](Date) | The due date of the Workitem. Can not be greater than 365 days from the current time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateExpires** | [**Date**](Date) | The expiry date of the Workitem. Can not be greater than 365 days from the current time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **durationSeconds** | **Integer** | The estimated duration in seconds to complete the Workitem. Maximum of 365 days. |  [optional] |
| **ttl** | **Integer** | The epoch timestamp in seconds specifying the time to live for the Workitem. Can not be greater than 365 days from the current time. |  [optional] |
| **statusId** | **String** | The ID of the Status of the Workitem. |  [optional] |
| **workbinId** | **String** | The ID of Workbin that contains the Workitem. |  [optional] |
| **autoStatusTransition** | **Boolean** | Set it to false to disable auto status transition. By default, it is enabled. |  [optional] |
| **description** | **String** | The description of the Workitem. Maximum length of 512 characters. |  [optional] |
| **dateClosed** | [**Date**](Date) | The closed date of the Workitem. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **assignmentState** | [**AssignmentStateEnum**](#Enum--AssignmentStateEnum) | The assignment state of the Workitem. |  [optional] |
| **assignmentOperation** | [**AssignmentOperationEnum**](#Enum--AssignmentOperationEnum) | Set this value to AgentAssignmentAlerting and supply an 'assigneeId' to assign the workitem to an agent and alert the agent of the assignment. Set this value to QueueAssignmentAlerting and supply a 'queueId' to route the workitem to an agent who is a member of the queue and alert the agent. |  [optional] |
| **customFields** | **Map&lt;String, Object&gt;** | Custom fields defined in the schema referenced by the worktype of the workitem. If set to {}, the existing keys and values will be removed. |  [optional] |
| **queueId** | **String** | The ID of the Workitems queue. Must be a valid UUID. |  [optional] |
| **assigneeId** | **String** | The ID of the assignee of the Workitem. If supplied it must be a valid UUID. |  [optional] |
| **scoredAgents** | [**List&lt;WorkitemScoredAgentRequest&gt;**](WorkitemScoredAgentRequest) | A list of scored agents for the Workitem. A workitem can have a maximum of 20 scored agents. |  [optional] |
| **externalContactId** | **String** | The ID of the external contact of the Workitem. Must be a valid UUID. |  [optional] |
| **externalTag** | **String** | The external tag of the Workitem. |  [optional] |
| **skillIds** | **List&lt;String&gt;** | The skill IDs of the Workitem. Must be valid UUIDs. |  [optional] |
| **languageId** | **String** | The ID of language of the Workitem. Must be a valid UUID. |  [optional] |
| **utilizationLabelId** | **String** | The ID of the utilization label of the Workitem. Must be a valid UUID. |  [optional] |
| **preferredAgentIds** | **List&lt;String&gt;** | The preferred agent IDs of the Workitem. Must be valid UUIDs. |  [optional] |
| **scriptId** | **String** | The ID of the Workitems script. Must be a valid UUID. |  [optional] |


## Enum: AssignmentStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| ACDSTARTED | &quot;AcdStarted&quot; | 
| ALERTING | &quot;Alerting&quot; | 
| ALERTTIMEOUT | &quot;AlertTimeout&quot; | 
| ACDCANCELLED | &quot;AcdCancelled&quot; | 
| TERMINATED | &quot;Terminated&quot; | 
| IDLE | &quot;Idle&quot; | 
| DECLINED | &quot;Declined&quot; | 
| CONNECTED | &quot;Connected&quot; | 
| DISCONNECTED | &quot;Disconnected&quot; | 
| PARKED | &quot;Parked&quot; | 
| HELD | &quot;Held&quot; | 
| ACDEXPIRED | &quot;AcdExpired&quot; | 


## Enum: AssignmentOperationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTASSIGNMENTALERTING | &quot;AgentAssignmentAlerting&quot; | 
| QUEUEASSIGNMENTALERTING | &quot;QueueAssignmentAlerting&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
