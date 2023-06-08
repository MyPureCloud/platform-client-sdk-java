---
title: GetFlowExecutionDataJobResult
---
## GetFlowExecutionDataJobResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **entities** | <!----><!---->[**List&lt;ExecutionDataEntity&gt;**](ExecutionDataEntity.html)<!----> | On jobState = Success this field will be populated with the list of results of files for download. |  [optional] |
| **jobState** | [**JobStateEnum**](#JobStateEnum)<!----> | The state of the backend process to prep the files for download. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="JobStateEnum"></a>

## Enum: JobStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REGISTERED | &quot;Registered&quot; | 
| RUNNING | &quot;Running&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



