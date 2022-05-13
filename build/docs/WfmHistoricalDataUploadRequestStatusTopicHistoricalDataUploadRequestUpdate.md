---
title: WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate
---
## WfmHistoricalDataUploadRequestStatusTopicHistoricalDataUploadRequestUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **requestId** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateImportStarted** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **dateImportEnded** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **error** | <!----><!---->**String**<!----> |  |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
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


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CSV | &quot;Csv&quot; | 
| JSON | &quot;Json&quot; | 
{: class="table table-striped"}



