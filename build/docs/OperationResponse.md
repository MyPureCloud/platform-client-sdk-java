---
title: OperationResponse
---
## OperationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **status** | <!----><!---->**String**<!----> | Status of the operation. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Type of the operation. |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who created the operation. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Operation creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Operation last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IMPORT | &quot;Import&quot; | 
| EXPORT | &quot;Export&quot; | 
| PARSE | &quot;Parse&quot; | 
| SYNC | &quot;Sync&quot; | 
{: class="table table-striped"}



