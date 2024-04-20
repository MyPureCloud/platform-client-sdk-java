---
title: WorkitemQueryJobResponse
---
## WorkitemQueryJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the query job |  [optional] |
| **dateStarted** | <!----><!---->[**Date**](Date.html)<!----> | The date the job was started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateFinished** | <!----><!---->[**Date**](Date.html)<!----> | The date the job finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **error** | <!----><!---->[**WorkitemQueryJobError**](WorkitemQueryJobError.html)<!----> | The error associated with the query job, if the state is Failed |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUED | &quot;Queued&quot; | 
| RUNNING | &quot;Running&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



