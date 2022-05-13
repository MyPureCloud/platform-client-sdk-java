---
title: UserRoutingSkill
---
## UserRoutingSkill


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **proficiency** | <!----><!---->**Double**<!----> | A rating from 0.0 to 5.0 that indicates how adept an agent is at a particular skill. When \"Best available skills\" is enabled for a queue in Genesys Cloud, ACD interactions in that queue are routed to agents with higher proficiency ratings. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Activate or deactivate this routing skill. |  [optional] |
| **skillUri** | <!----><!---->**String**<!----> | URI to the organization skill used by this user skill. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 
{: class="table table-striped"}



