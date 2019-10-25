---
title: EdgeLogsJobFile
---
## EdgeLogsJobFile


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the entity. |  |
| **description** | <!----><!---->**String**<!----> | The resource&#39;s description. |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | The current version of the resource. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **modifiedBy** | <!----><!---->**String**<!----> | The ID of the user that last modified the resource. |  [optional] |
| **createdBy** | <!----><!---->**String**<!----> | The ID of the user that created the resource. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Indicates if the resource is active, inactive, or deleted. |  [optional] |
| **modifiedByApp** | <!----><!---->**String**<!----> | The application that last modified the resource. |  [optional] |
| **createdByApp** | <!----><!---->**String**<!----> | The application that created the resource. |  [optional] |
| **timeCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **timeModified** | <!----><!---->[**Date**](Date.html)<!----> | The time this log file was last modified on the Edge. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **sizeBytes** | <!----><!---->**Double**<!----> | The size of this file in bytes. |  [optional] |
| **uploadStatus** | [**UploadStatusEnum**](#UploadStatusEnum)<!----> | The status of the upload of this file from the Edge to the cloud.  Use /upload to start an upload. |  [optional] |
| **edgePath** | <!----><!---->**String**<!----> | The path of this file on the Edge. |  [optional] |
| **downloadId** | <!----><!---->**String**<!----> | The download ID to use with the downloads API. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| DELETED | &quot;deleted&quot; |
{: class="table table-striped"}


<a name="UploadStatusEnum"></a>

## Enum: UploadStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UPLOADING | &quot;UPLOADING&quot; |
| NOT_UPLOADED | &quot;NOT_UPLOADED&quot; |
| UPLOADED | &quot;UPLOADED&quot; |
| ERROR_ON_UPLOAD | &quot;ERROR_ON_UPLOAD&quot; |
{: class="table table-striped"}



