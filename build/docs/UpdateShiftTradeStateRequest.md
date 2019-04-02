---
title: UpdateShiftTradeStateRequest
---
## UpdateShiftTradeStateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum) | The new state for this shift trade |  |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata.html) | Version metadata for the shift trade |  |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UNMATCHED | &quot;Unmatched&quot; |
| MATCHED | &quot;Matched&quot; |
| APPROVED | &quot;Approved&quot; |
| DENIED | &quot;Denied&quot; |
| EXPIRED | &quot;Expired&quot; |
| CANCELED | &quot;Canceled&quot; |
{: class="table table-striped"}



