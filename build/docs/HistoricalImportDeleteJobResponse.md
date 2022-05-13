---
title: HistoricalImportDeleteJobResponse
---
## HistoricalImportDeleteJobResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Property denoting the status of the delete. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



