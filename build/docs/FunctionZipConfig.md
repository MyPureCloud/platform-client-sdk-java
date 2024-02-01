---
title: FunctionZipConfig
---
## FunctionZipConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of zip upload. |  [optional] |
| **id** | <!----><!---->**String**<!----> | Zip file Identifier |  [optional] |
| **name** | <!----><!---->**String**<!----> | Zip file name |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date and time zip record was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| TRANSFERRING | &quot;Transferring&quot; | 
| AVAILABLE | &quot;Available&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



