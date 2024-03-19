---
title: JourneyViewJob
---
## JourneyViewJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp of execution. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateCompleted** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp of completion. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the job |  |
| **journeyView** | <!----><!---->[**JourneyView**](JourneyView.html)<!----> | The journey view for which the job is executed |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACCEPTED | &quot;Accepted&quot; | 
| EXECUTING | &quot;Executing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



