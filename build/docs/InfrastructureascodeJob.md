---
title: InfrastructureascodeJob
---
## InfrastructureascodeJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **dryRun** | <!----><!---->**Boolean**<!----> | dryRun |  |
| **acceleratorId** | <!----><!---->**String**<!----> | acceleratorId |  [optional] |
| **dateSubmitted** | <!----><!---->[**Date**](Date.html)<!----> | dateSubmitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **submittedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | submittedBy |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | status |  [optional] |
| **errorInfo** | <!----><!---->[**ErrorInfo**](ErrorInfo.html)<!----> | errorInfo |  [optional] |
| **results** | <!----><!---->**String**<!----> | results |  [optional] |
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



