---
title: UserRoutingSkill
---
## UserRoutingSkill


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **proficiency** | **Double** | Proficiency is a rating from 0.0 to 5.0 on how competent an agent is for a particular skill. It is used when a queue is set to \&quot;Best available skills\&quot; mode to allow acd interactions to target agents with higher proficiency ratings. |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | Activate or deactivate this routing skill. |  [optional] |
| **skillUri** | **String** | URI to the organization skill used by this user skill. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
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


