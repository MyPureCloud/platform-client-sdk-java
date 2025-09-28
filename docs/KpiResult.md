# KpiResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **kpiTotalOn** | **Long** | Absolute metric (in which the KPI is based) total for the interactions handled by predictive routing (GPR was on) |  [optional] |
| **kpiTotalOff** | **Long** | Absolute metric (in which the KPI is based) total for the interactions not routed by predictive routing (GPR was off) |  [optional] |
| **interactionCountOn** | **Long** | Total interactions handled by predictive routing (GPR was on) |  [optional] |
| **interactionCountOff** | **Long** | Total interactions not routed by predictive routing (GPR was off) |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type used for the KPI |  [optional] |
| **percentageBenefit** | **Double** | The percentage benefit for this media type for the duration of the comparison period |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;voice&quot; | 
| EMAIL | &quot;email&quot; | 
| MESSAGE | &quot;message&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:232.0.0_
