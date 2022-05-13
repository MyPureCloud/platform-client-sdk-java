---
title: SchedulingProcessingError
---
## SchedulingProcessingError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **internalErrorCode** | [**InternalErrorCodeEnum**](#InternalErrorCodeEnum)<!----> | An internal code representing the type of error. BadJson for 'Unable to parse json.' NotFound for 'Resource not found.' Fail for 'An unexpected server error occured.' |  [optional] |
| **description** | <!----><!---->**String**<!----> | A text description of the error |  [optional] |
{: class="table table-striped"}


<a name="InternalErrorCodeEnum"></a>

## Enum: InternalErrorCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BADJSON | &quot;BadJson&quot; | 
| NOTFOUND | &quot;NotFound&quot; | 
| FAIL | &quot;Fail&quot; | 
{: class="table table-striped"}



