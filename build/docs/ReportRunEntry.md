---
title: ReportRunEntry
---
## ReportRunEntry


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **reportId** | <!----><!---->**String**<!----> |  |  [optional] |
| **runTime** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **runStatus** | [**RunStatusEnum**](#RunStatusEnum)<!----> |  |  [optional] |
| **errorMessage** | <!----><!---->**String**<!----> |  |  [optional] |
| **runDurationMsec** | <!----><!---->**Long**<!----> |  |  [optional] |
| **reportUrl** | <!----><!---->**String**<!----> |  |  [optional] |
| **reportFormat** | <!----><!---->**String**<!----> |  |  [optional] |
| **scheduleUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="RunStatusEnum"></a>

## Enum: RunStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RUNNING | &quot;RUNNING&quot; | 
| COMPLETED | &quot;COMPLETED&quot; | 
| COMPLETED_WITH_ERRORS | &quot;COMPLETED_WITH_ERRORS&quot; | 
| FAILED | &quot;FAILED&quot; | 
| FAILED_TIMEOUT | &quot;FAILED_TIMEOUT&quot; | 
| FAILED_DATALIMIT | &quot;FAILED_DATALIMIT&quot; | 
| UNABLE_TO_COMPLETE | &quot;UNABLE_TO_COMPLETE&quot; | 
{: class="table table-striped"}



