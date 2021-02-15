---
title: WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate
---
## WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **requestId** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateImportStarted** | <!----><!---->[**WfmHistoricalDataUploadRequestStatusTopicDateTime**](WfmHistoricalDataUploadRequestStatusTopicDateTime.html)<!----> |  |  [optional] |
| **dateImportEnded** | <!----><!---->[**WfmHistoricalDataUploadRequestStatusTopicDateTime**](WfmHistoricalDataUploadRequestStatusTopicDateTime.html)<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**WfmHistoricalDataUploadRequestStatusTopicDateTime**](WfmHistoricalDataUploadRequestStatusTopicDateTime.html)<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**WfmHistoricalDataUploadRequestStatusTopicDateTime**](WfmHistoricalDataUploadRequestStatusTopicDateTime.html)<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **error** | <!----><!---->**String**<!----> |  |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| INITIATED | &quot;Initiated&quot; |
| INPROGRESS | &quot;InProgress&quot; |
| PENDING | &quot;Pending&quot; |
| SUCCESS | &quot;Success&quot; |
| FAILED | &quot;Failed&quot; |
| CANCELLED | &quot;Cancelled&quot; |
| PURGED | &quot;Purged&quot; |
| PURGEPENDING | &quot;PurgePending&quot; |
{: class="table table-striped"}



