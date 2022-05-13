---
title: DataTableImportJob
---
## DataTableImportJob


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **owner** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The PureCloud user who started the import job |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the import job |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the import began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateCompleted** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp of when the import stopped (either successfully or unsuccessfully). Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **uploadURI** | <!----><!---->**String**<!----> | The URL of the location at which the caller can upload the file to be imported |  [optional] |
| **importMode** | [**ImportModeEnum**](#ImportModeEnum)<!----> | The indication of whether the processing should remove rows that don't appear in the import file |  [optional] |
| **errorInformation** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Any error information, or null of the processing is not in an error state |  [optional] |
| **countRecordsUpdated** | <!----><!---->**Integer**<!----> | The current count of the number of records processed |  [optional] |
| **countRecordsDeleted** | <!----><!---->**Integer**<!----> | The current count of the number of records deleted |  [optional] |
| **countRecordsFailed** | <!----><!---->**Integer**<!----> | The current count of the number of records that failed to import |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WAITINGFORUPLOAD | &quot;WaitingForUpload&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| FAILED | &quot;Failed&quot; | 
| SUCCEEDED | &quot;Succeeded&quot; | 
{: class="table table-striped"}


<a name="ImportModeEnum"></a>

## Enum: ImportModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REPLACEALL | &quot;ReplaceAll&quot; | 
| APPEND | &quot;Append&quot; | 
{: class="table table-striped"}



