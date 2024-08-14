---
title: AdminBulkUpdateAlternativeShiftTradeState
---
## AdminBulkUpdateAlternativeShiftTradeState


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **tradeId** | <!----><!---->**String**<!----> | The ID of the trade for this alternative shift trade |  |
| **state** | [**StateEnum**](#StateEnum)<!----> | The new alternative shift trade state |  |
| **metadata** | <!----><!---->[**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html)<!----> | Version metadata for this alternative shift trade |  |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
{: class="table table-striped"}



