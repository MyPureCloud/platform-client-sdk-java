---
title: HistoricalImportStatus
---
## HistoricalImportStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **requestId** | <!----><!---->**String**<!----> | Request id of the historical import in the organization |  [optional] |
| **dateImportEnded** | <!----><!---->[**Date**](Date.html)<!----> | The last day of the data you are importing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateImportStarted** | <!----><!---->[**Date**](Date.html)<!----> | The first day of the data you are importing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of the historical import in the organization. |  [optional] |
| **error** | <!----><!---->**String**<!----> | Error occured if the status of the import is failed |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date in which the historical import is initiated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date in which the historical import is modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **active** | <!----><!---->**Boolean**<!----> | Whether this historical import is active or not |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Whether this historical import is of type csv or json |  [optional] |
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



