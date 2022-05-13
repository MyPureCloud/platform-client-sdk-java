---
title: ProgramJob
---
## ProgramJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **programs** | <!----><!---->[**List&lt;BaseProgramEntity&gt;**](BaseProgramEntity.html)<!----> |  |  [optional] |
| **createdBy** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNNING | &quot;Running&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



