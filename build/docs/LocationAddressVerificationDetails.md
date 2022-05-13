---
title: LocationAddressVerificationDetails
---
## LocationAddressVerificationDetails


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of address verification process |  [optional] |
| **dateFinished** | <!----><!---->[**Date**](Date.html)<!----> | Finished time of address verification process. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateStarted** | <!----><!---->[**Date**](Date.html)<!----> | Time started of address verification process. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **service** | <!----><!---->**String**<!----> | Third party service used for address verification |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| RETRY | &quot;Retry&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
{: class="table table-striped"}



