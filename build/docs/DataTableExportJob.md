---
title: DataTableExportJob
---
## DataTableExportJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **owner** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The PureCloud user who started the export job |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the export job |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the export began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the export stopped (either successfully or unsuccessfully). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **downloadURI** | <!----><!---->**String**<!----> | The URL of the location at which the caller can download the export file, when available |  [optional] |
| **errorInformation** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Any error information, or null of the processing is not in an error state |  [optional] |
| **countRecordsProcessed** | <!----><!---->**Integer**<!----> | The current count of the number of records processed |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| FAILED | &quot;Failed&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
{: class="table table-striped"}



