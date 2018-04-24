---
title: DataExportNotificationNotification
---
## DataExportNotificationNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
| **exportFormat** | [**ExportFormatEnum**](#ExportFormatEnum) |  |  [optional] |
| **downloadUrl** | **String** |  |  [optional] |
| **viewType** | [**ViewTypeEnum**](#ViewTypeEnum) |  |  [optional] |
| **exportErrorMessagesType** | [**ExportErrorMessagesTypeEnum**](#ExportErrorMessagesTypeEnum) |  |  [optional] |
| **read** | **Boolean** |  |  [optional] |
| **createdDateTime** | [**Date**](Date.html) |  |  [optional] |
| **modifiedDateTime** | [**Date**](Date.html) |  |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| SUBMITTED | &quot;SUBMITTED&quot; |
| RUNNING | &quot;RUNNING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |


<a name="ExportFormatEnum"></a>

## Enum: ExportFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CSV | &quot;CSV&quot; |


<a name="ViewTypeEnum"></a>

## Enum: ViewTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUE_PERFORMANCE_SUMMARY_VIEW | &quot;QUEUE_PERFORMANCE_SUMMARY_VIEW&quot; |
| QUEUE_PERFORMANCE_DETAIL_VIEW | &quot;QUEUE_PERFORMANCE_DETAIL_VIEW&quot; |
| INTERACTION_SUMMARY_VIEW | &quot;INTERACTION_SUMMARY_VIEW&quot; |
| AGENTS_PERFORMANCE_SUMMARY_VIEW | &quot;AGENTS_PERFORMANCE_SUMMARY_VIEW&quot; |


<a name="ExportErrorMessagesTypeEnum"></a>

## Enum: ExportErrorMessagesTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| FAILED_CONVERTING_EXPORT_JOB | &quot;FAILED_CONVERTING_EXPORT_JOB&quot; |
| FAILED_NO_DATA_EXPORT_JOB_FOUND | &quot;FAILED_NO_DATA_EXPORT_JOB_FOUND&quot; |
| FAILED_GETTING_DATA_FROM_SERVICE | &quot;FAILED_GETTING_DATA_FROM_SERVICE&quot; |
| FAILED_GENERATING_TEMP_FILE | &quot;FAILED_GENERATING_TEMP_FILE&quot; |
| FAILED_SAVING_FILE_TO_S3 | &quot;FAILED_SAVING_FILE_TO_S3&quot; |
| FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD | &quot;FAILED_NOTIFYING_SKYWALKER_OF_DOWNLOAD&quot; |
| FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE | &quot;FAILED_BUILDING_DOWNLOAD_URL_FROM_SKYWALKER_RESPONSE&quot; |
| EXPORT_TYPE_NOT_IMPLEMENTED | &quot;EXPORT_TYPE_NOT_IMPLEMENTED&quot; |
{: class="table table-striped"}


