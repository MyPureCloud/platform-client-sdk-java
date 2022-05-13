---
title: DependencyStatus
---
## DependencyStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **user** | <!----><!---->[**User**](User.html)<!----> | User that initiated the build. |  [optional] |
| **client** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | OAuth client that initiated the build. |  [optional] |
| **buildId** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateStarted** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **failedObjects** | <!----><!---->[**List&lt;FailedObject&gt;**](FailedObject.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BUILDINITIALIZING | &quot;BUILDINITIALIZING&quot; | 
| BUILDINPROGRESS | &quot;BUILDINPROGRESS&quot; | 
| NOTBUILT | &quot;NOTBUILT&quot; | 
| OPERATIONAL | &quot;OPERATIONAL&quot; | 
| OPERATIONALNEEDSREBUILD | &quot;OPERATIONALNEEDSREBUILD&quot; | 
{: class="table table-striped"}



