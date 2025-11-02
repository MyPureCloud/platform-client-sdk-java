# ConditionalGroupActivationSimpleMetric


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | The queue metric being evaluated |  [optional] |
| **queue** | [**DomainEntityRef**](DomainEntityRef) | The queue being evaluated for this rule.  If null, the current queue will be used. |  [optional] |


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ESTIMATEDWAITTIME | &quot;EstimatedWaitTime&quot; | 
| IDLEAGENTCOUNT | &quot;IdleAgentCount&quot; | 
| SERVICELEVEL | &quot;ServiceLevel&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
