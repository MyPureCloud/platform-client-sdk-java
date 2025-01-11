# ConditionalGroupRoutingRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**DomainEntityRef**](DomainEntityRef) | The queue being evaluated for this rule.  If null, the current queue will be used. |  [optional] |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | The queue metric being evaluated |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The operator that compares the actual value against the condition value |  [optional] |
| **conditionValue** | **Double** | The limit value, beyond which a rule evaluates as true |  [optional] |
| **groups** | [**List&lt;MemberGroup&gt;**](MemberGroup) | The group(s) to activate if the rule evaluates as true |  [optional] |
| **waitSeconds** | **Integer** | The number of seconds to wait in this rule, if it evaluates as true, before evaluating the next rule.  For the final rule, this is ignored, so need not be specified. |  [optional] |


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ESTIMATEDWAITTIME | &quot;EstimatedWaitTime&quot; | 
| SERVICELEVEL | &quot;ServiceLevel&quot; | 


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GREATERTHAN | &quot;GreaterThan&quot; | 
| GREATERTHANOREQUALTO | &quot;GreaterThanOrEqualTo&quot; | 
| LESSTHAN | &quot;LessThan&quot; | 
| LESSTHANOREQUALTO | &quot;LessThanOrEqualTo&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
