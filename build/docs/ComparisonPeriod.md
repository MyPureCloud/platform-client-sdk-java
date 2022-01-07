---
title: ComparisonPeriod
---
## ComparisonPeriod


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **kpi** | <!----><!---->**String**<!----> | Key Performance Indicator optimised during the comparison period. |  [optional] |
| **dateStarted** | <!----><!---->[**Date**](Date.html)<!----> | Start date of the comparison period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnded** | <!----><!---->[**Date**](Date.html)<!----> | End date of the comparison period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **kpiTotalOn** | <!----><!---->**Long**<!----> | Absolute metric (in which the KPI is based) total for the interactions handled by predictive routing (GPR was on) |  [optional] |
| **kpiTotalOff** | <!----><!---->**Long**<!----> | Absolute metric (in which the KPI is based) total for the interactions not routed by predictive routing (GPR was off) |  [optional] |
| **interactionCountOn** | <!----><!---->**Long**<!----> | Total interactions handled by predictive routing (GPR was on) |  [optional] |
| **interactionCountOff** | <!----><!---->**Long**<!----> | Total interactions not routed by predictive routing (GPR was off) |  [optional] |
| **kpiResults** | <!----><!---->[**List&lt;KpiResult&gt;**](KpiResult.html)<!----> | KPI results for each metric |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



