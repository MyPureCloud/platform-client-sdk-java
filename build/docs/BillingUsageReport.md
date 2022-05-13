---
title: BillingUsageReport
---
## BillingUsageReport


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The period start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **endDate** | <!----><!---->[**Date**](Date.html)<!----> | The period end date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Generation status of report |  [optional] |
| **usages** | <!----><!---->[**List&lt;BillingUsage&gt;**](BillingUsage.html)<!----> | The usages for the given period. |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETE | &quot;Complete&quot; | 
{: class="table table-striped"}



