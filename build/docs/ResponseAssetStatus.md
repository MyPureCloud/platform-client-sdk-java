---
title: ResponseAssetStatus
---
## ResponseAssetStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Upload status of the asset |  [optional] |
| **errorCode** | <!----><!---->**String**<!----> | Error code. Used for localization |  [optional] |
| **errorMessage** | <!----><!---->**String**<!----> | Error message that explains upload failure status  |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INPROGRESS | &quot;InProgress&quot; |
| UPLOADED | &quot;Uploaded&quot; |
| FAILED | &quot;Failed&quot; |
{: class="table table-striped"}



