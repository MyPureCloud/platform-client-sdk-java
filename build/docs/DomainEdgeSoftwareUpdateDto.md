---
title: DomainEdgeSoftwareUpdateDto
---
## DomainEdgeSoftwareUpdateDto


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **version** | <!----><!---->[**DomainEdgeSoftwareVersionDto**](DomainEdgeSoftwareVersionDto.html)<!----> | Version |  |
| **maxDownloadRate** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **downloadStartTime** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **executeStartTime** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **executeStopTime** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **executeOnIdle** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **edgeUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **callDrainingWaitTimeSeconds** | <!----><!---->**Long**<!----> |  |  [optional] |
| **current** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;NONE&quot; | 
| INIT | &quot;INIT&quot; | 
| IN_PROGRESS | &quot;IN_PROGRESS&quot; | 
| EXPIRED | &quot;EXPIRED&quot; | 
| EXCEPTION | &quot;EXCEPTION&quot; | 
| ABORTED | &quot;ABORTED&quot; | 
| FAILED | &quot;FAILED&quot; | 
| SUCCEEDED | &quot;SUCCEEDED&quot; | 
| DELETE | &quot;DELETE&quot; | 
{: class="table table-striped"}



