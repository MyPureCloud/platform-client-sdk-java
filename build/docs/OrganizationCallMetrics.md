# OrganizationCallMetrics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **usage** | **Double** | The current usage percentage of the organization's call capacity. |  |
| **autoScalingTriggerPercentage** | **Double** | The autoscaling trigger percentage of the organization's call capacity. |  |
| **cpuIntensity** | [**CpuIntensityEnum**](#Enum--CpuIntensityEnum) | The current compute intensity of the organization's call capacity. |  |
| **memoryIntensity** | [**MemoryIntensityEnum**](#Enum--MemoryIntensityEnum) | The current memory intensity of the organization's call capacity. |  |
| **concurrentCallCount** | **Integer** | The current number of concurrent calls in the organization. |  |
| **concurrentCallSessionCount** | **Integer** | The current number of concurrent call sessions in the organization. |  |
| **maxCallCapacity** | **Integer** | The maximum number of concurrent calls allowed in the organization. |  |
| **maxCallSessionCapacity** | **Integer** | The maximum number of concurrent call sessions allowed in the organization. |  |
| **autoScaleInProgress** | [**AutoScaleInProgressEnum**](#Enum--AutoScaleInProgressEnum) | The autoscaling status of the organization's call capacity. |  |


## Enum: CpuIntensityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOW | &quot;Low&quot; | 
| MEDIUM | &quot;Medium&quot; | 
| HIGH | &quot;High&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: MemoryIntensityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOW | &quot;Low&quot; | 
| MEDIUM | &quot;Medium&quot; | 
| HIGH | &quot;High&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: AutoScaleInProgressEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UP | &quot;Up&quot; | 
| DOWN | &quot;Down&quot; | 
| NONE | &quot;None&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:251.0.0_
