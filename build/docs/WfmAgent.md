---
title: WfmAgent
---
## WfmAgent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **user** | [**UserReference**](UserReference.html) | The user associated with this data |  [optional] |
| **queues** | [**List&lt;QueueReference&gt;**](QueueReference.html) | List of queues to which the agent belongs and which are defined in the service goal groups in this management unit |  [optional] |
| **languages** | [**List&lt;LanguageReference&gt;**](LanguageReference.html) | The list of languages |  [optional] |
| **skills** | [**List&lt;RoutingSkillReference&gt;**](RoutingSkillReference.html) | The list of skills |  [optional] |
| **workPlan** | [**WorkPlanReference**](WorkPlanReference.html) | The work plan associated with this agent |  [optional] |
| **schedulable** | **Boolean** | Whether the agent has the permission to be included in schedule generation |  [optional] |
| **timeZone** | [**WfmTimeZone**](WfmTimeZone.html) | The time zone for this agent. Defaults to the time zone of the management unit to which the agent belongs |  [optional] |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html) | Metadata for this agent |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



