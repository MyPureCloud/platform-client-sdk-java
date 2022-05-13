---
title: BuAsyncAgentSchedulesQueryResponse
---
## BuAsyncAgentSchedulesQueryResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the operation |  [optional] |
| **operationId** | <!----><!---->**String**<!----> | The ID for the operation |  [optional] |
| **result** | <!----><!---->[**BuAgentSchedulesQueryResponse**](BuAgentSchedulesQueryResponse.html)<!----> | The result of the operation.  Null unless status == Complete |  [optional] |
| **progress** | <!----><!---->**Integer**<!----> | Percent progress for the operation |  [optional] |
| **downloadUrl** | <!----><!---->**String**<!----> | The URL from which to download the result if it is too large to pass directly |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



