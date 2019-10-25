---
title: SchedulingProcessingError
---
## SchedulingProcessingError


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **internalErrorCode** | [**InternalErrorCodeEnum**](#InternalErrorCodeEnum)<!----> | An internal code representing the type of error. BadJson for &#39;Unable to parse json.&#39; NotFound for &#39;Resource not found.&#39; Fail for &#39;An unexpected server error occured.&#39; |  [optional] |
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



