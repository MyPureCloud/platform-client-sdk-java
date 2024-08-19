# CommonRuleConditions


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **clauses** | [**List&lt;CommonRuleConditions&gt;**](CommonRuleConditions) | The list of predicates groups to be evaluated |  [optional] |
| **predicates** | [**List&lt;CommonRulePredicate&gt;**](CommonRulePredicate) | The list of rule metric predicates to be evaluated. |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | the logic operator performed. |  |
| **id** | **String** | The id. |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;And&quot; | 
| OR | &quot;Or&quot; | 
| NOT | &quot;Not&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
