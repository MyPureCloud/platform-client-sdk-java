---
title: AsyncQueryStatus
---
## AsyncQueryStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | The current state of the asynchronous query |  [optional] |
| **errorMessage** | <!----><!---->**String**<!----> | The error associated with the current query, if the state is FAILED |  [optional] |
| **expirationDate** | <!----><!---->[**Date**](Date.html)<!----> | The time at which results for this query will expire. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **submissionDate** | <!----><!---->[**Date**](Date.html)<!----> | The time at which the query was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **completionDate** | <!----><!---->[**Date**](Date.html)<!----> | The time at which the query completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUED | &quot;QUEUED&quot; | 
| PENDING | &quot;PENDING&quot; | 
| FAILED | &quot;FAILED&quot; | 
| CANCELLED | &quot;CANCELLED&quot; | 
| FULFILLED | &quot;FULFILLED&quot; | 
| EXPIRED | &quot;EXPIRED&quot; | 
{: class="table table-striped"}



