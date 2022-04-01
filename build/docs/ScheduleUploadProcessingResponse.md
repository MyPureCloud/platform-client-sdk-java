---
title: ScheduleUploadProcessingResponse
---
## ScheduleUploadProcessingResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the operation |  [optional] |
| **operationId** | <!----><!---->**String**<!----> | The ID for the operation |  [optional] |
| **result** | <!----><!---->[**BuScheduleMetadata**](BuScheduleMetadata.html)<!----> | The result of the operation.  Null unless status == Complete |  [optional] |
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



