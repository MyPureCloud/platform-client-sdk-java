# BidGroupWorkPlanResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **managementUnit** | [**ManagementUnitReference**](ManagementUnitReference) | The management unit to which this work plan belongs.  Nullable in some routes |  [optional] |
| **overrideAgentCount** | **Integer** | The modified agent count for this work plan |  [optional] |
| **suggestedAgentCount** | **Integer** | The number of agents needed for this work plan to produce the optimal schedule |  [optional] |
| **agentCountRange** | [**AgentCountRange**](AgentCountRange) | The range of agent slot count per work plan. The suggested slot count must be in agent count range |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
