---
title: UserRoutingLanguage
---
## UserRoutingLanguage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **proficiency** | <!----><!---->**Double**<!----> | A rating from 0.0 to 5.0 that indicates how fluent an agent is in a particular language. ACD interactions are routed to agents with higher proficiency ratings. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Activate or deactivate this routing language. |  [optional] |
| **languageUri** | <!----><!---->**String**<!----> | URI to the organization language used by this user language. |  [optional] |
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



