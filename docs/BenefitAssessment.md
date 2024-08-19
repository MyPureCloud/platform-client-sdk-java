# BenefitAssessment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **queues** | [**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef) | The list of queues that are assessed for Predictive Routing benefit. |  [optional] |
| **kpiAssessments** | [**List&lt;KeyPerformanceIndicatorAssessment&gt;**](KeyPerformanceIndicatorAssessment) | A set of key performance indicators applied on the queue to determine suitability of Predictive Routing. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | State of the benefit assessment. |  [optional] |
| **jobId** | **String** | The unique identifier of job that created this benefit assessment. |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation Date of the benefit assessment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Modified Date of the benefit assessment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| FINISHED | &quot;Finished&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
