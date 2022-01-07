---
title: KpiResult
---
## KpiResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **kpiTotalOn** | <!----><!---->**Integer**<!----> | Absolute metric (in which the KPI is based) total for the interactions handled by predictive routing (GPR was on) |  [optional] |
| **kpiTotalOff** | <!----><!---->**Integer**<!----> | Absolute metric (in which the KPI is based) total for the interactions not routed by predictive routing (GPR was off) |  [optional] |
| **interactionCountOn** | <!----><!---->**Integer**<!----> | Total interactions handled by predictive routing (GPR was on) |  [optional] |
| **interactionCountOff** | <!----><!---->**Integer**<!----> | Total interactions not routed by predictive routing (GPR was off) |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | Media type used for the KPI |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| VOICE | &quot;Voice&quot; |
| EMAIL | &quot;Email&quot; |
| MESSAGE | &quot;Message&quot; |
{: class="table table-striped"}



