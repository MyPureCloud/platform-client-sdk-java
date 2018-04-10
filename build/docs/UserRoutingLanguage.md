---
title: UserRoutingLanguage
---
## UserRoutingLanguage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **proficiency** | **Double** | Proficiency is a rating from 0.0 to 5.0 on how competent an agent is for a particular language. It is used when a queue is set to \&quot;Best available language\&quot; mode to allow acd interactions to target agents with higher proficiency ratings. |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | Activate or deactivate this routing langauge. |  [optional] |
| **languageUri** | **String** | URI to the organization language used by this user langauge. |  [optional] |
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


