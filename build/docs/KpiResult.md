---
title: KpiResult
---
## KpiResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **kpiTotalOn** | <!----><!---->**Long**<!----> | Absolute metric (in which the KPI is based) total for the interactions handled by predictive routing (GPR was on) |  [optional] |
| **kpiTotalOff** | <!----><!---->**Long**<!----> | Absolute metric (in which the KPI is based) total for the interactions not routed by predictive routing (GPR was off) |  [optional] |
| **interactionCountOn** | <!----><!---->**Long**<!----> | Total interactions handled by predictive routing (GPR was on) |  [optional] |
| **interactionCountOff** | <!----><!---->**Long**<!----> | Total interactions not routed by predictive routing (GPR was off) |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | Media type used for the KPI |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;voice&quot; | 
| EMAIL | &quot;email&quot; | 
| MESSAGE | &quot;message&quot; | 
{: class="table table-striped"}



