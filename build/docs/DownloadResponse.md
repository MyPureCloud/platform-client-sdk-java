---
title: DownloadResponse
---
## DownloadResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **contentLocationUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **imageUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **thumbnails** | <!----><!---->[**List&lt;DocumentThumbnail&gt;**](DocumentThumbnail.html)<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **resultUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNNING | &quot;Running&quot; | 
| COMPLETED | &quot;Completed&quot; | 
{: class="table table-striped"}



