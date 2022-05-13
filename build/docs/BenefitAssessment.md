---
title: BenefitAssessment
---
## BenefitAssessment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **queues** | <!----><!---->[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.html)<!----> | The list of queues that are assessed for Predictive Routing benefit. |  [optional] |
| **kpiAssessments** | <!----><!---->[**List&lt;KeyPerformanceIndicatorAssessment&gt;**](KeyPerformanceIndicatorAssessment.html)<!----> | A set of key performance indicators applied on the queue to determine suitability of Predictive Routing. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | State of the benefit assessment. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation Date of the benefit assessment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Modified Date of the benefit assessment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| FINISHED | &quot;Finished&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



