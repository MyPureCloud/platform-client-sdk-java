---
title: TransferResponse
---
## TransferResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The id of the command. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the command. |  [optional] |
| **dateIssued** | <!----><!---->[**Date**](Date.html)<!----> | The date/time that this command was issued. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **initiator** | <!----><!---->[**TransferInitiator**](TransferInitiator.html)<!----> | The initiator of the command. |  [optional] |
| **modifiedBy** | <!----><!---->[**TransferResponseModifiedBy**](TransferResponseModifiedBy.html)<!----> | The user or entity that modified the command. |  [optional] |
| **destination** | <!----><!---->[**TransferDestination**](TransferDestination.html)<!----> | The destination of the command. |  [optional] |
| **transferType** | [**TransferTypeEnum**](#TransferTypeEnum)<!----> | The type of transfer to perform. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| ACTIVE | &quot;Active&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| FAILED | &quot;Failed&quot; | 
| TIMEOUT | &quot;Timeout&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}


<a name="TransferTypeEnum"></a>

## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;Attended&quot; | 
| UNATTENDED | &quot;Unattended&quot; | 
{: class="table table-striped"}



