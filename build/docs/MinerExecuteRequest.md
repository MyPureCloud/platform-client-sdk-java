---
title: MinerExecuteRequest
---
## MinerExecuteRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateStart** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | Start date for the date range to mine. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEnd** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | End date for the date range to mine. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **uploadKey** | <!----><!---->**String**<!----> | Location of input conversations. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> | Media type for filtering conversations. |  [optional] |
| **queueIds** | <!----><!---->**List&lt;String&gt;**<!----> | List of queue IDs for filtering conversations. |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CHAT | &quot;Chat&quot; | 
| CALL | &quot;Call&quot; | 
| MESSAGE | &quot;Message&quot; | 
{: class="table table-striped"}



