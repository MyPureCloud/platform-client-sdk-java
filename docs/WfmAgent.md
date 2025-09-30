# WfmAgent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **user** | [**UserReference**](UserReference) | The user associated with this data |  [optional] |
| **workPlan** | [**WorkPlanReference**](WorkPlanReference) | The work plan associated with this agent, if applicable |  [optional] |
| **workPlanRotation** | [**WorkPlanRotationReference**](WorkPlanRotationReference) | The work plan rotation associated with this agent, if applicable |  [optional] |
| **acceptDirectShiftTrades** | **Boolean** | Whether the agent accepts direct shift trade requests |  [optional] |
| **workPlanOverrides** | [**List&lt;WorkPlanOverride&gt;**](WorkPlanOverride) | The work plan overrides associated with this agent. Populate with expand=workPlanOverrides |  [optional] |
| **queues** | [**List&lt;QueueReference&gt;**](QueueReference) | List of queues to which this agent is capable of handling |  [optional] |
| **languages** | [**List&lt;LanguageReference&gt;**](LanguageReference) | The list of languages this agent is capable of handling |  [optional] |
| **skills** | [**List&lt;RoutingSkillReference&gt;**](RoutingSkillReference) | The list of skills this agent is capable of handling |  [optional] |
| **schedulable** | **Boolean** | Whether the agent can be included in schedule generation |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Metadata for this agent |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
