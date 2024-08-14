---
title: InfrastructureascodeJob
---
## InfrastructureascodeJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **dryRun** | <!----><!---->**Boolean**<!----> | Whether or not the job was a dry run |  |
| **acceleratorId** | <!----><!---->**String**<!----> | Accelerator associated with the job |  [optional] |
| **dateSubmitted** | <!----><!---->[**Date**](Date.html)<!----> | Date and time on which job was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **submittedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | User who submitted the job |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Job status |  [optional] |
| **errorInfo** | <!----><!---->[**ErrorInfo**](ErrorInfo.html)<!----> | Information about errors, if any |  [optional] |
| **results** | <!----><!---->**String**<!----> | The output results of the terraform job |  [optional] |
| **rollbackResults** | <!----><!---->**String**<!----> | The results of rolling back the job if there were errors.  Not returned if job was successful. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATED | &quot;Created&quot; | 
| QUEUED | &quot;Queued&quot; | 
| RUNNING | &quot;Running&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
| INCOMPLETE | &quot;Incomplete&quot; | 
{: class="table table-striped"}



