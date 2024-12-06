# SkillGroupRoutingCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **routingSkill** | **String** | The routing skill to be used in the skill condition query |  |
| **comparator** | [**ComparatorEnum**](#Enum--ComparatorEnum) | Comparator that will be applied to the proficiency |  |
| **proficiency** | **Integer** | The skill proficiency that will be used for the routing skill. Integer range 0-5 |  |
| **childConditions** | [**List&lt;SkillGroupCondition&gt;**](SkillGroupCondition) | Nested conditions to be applied to this skill condition |  [optional] |


## Enum: ComparatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALTO | &quot;EqualTo&quot; | 
| NOTEQUALTO | &quot;NotEqualTo&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANOREQUALTO | &quot;GreaterThanOrEqualTo&quot; | 
| LESSTHANOREQUALTO | &quot;LessThanOrEqualTo&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
