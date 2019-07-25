---
title: MoveManagementUnitResponse
---
## MoveManagementUnitResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessUnit** | [**BusinessUnitReference**](BusinessUnitReference.html) | The new business unit |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum) | The status of the move.  Will always be &#39;Processing&#39; unless the Management Unit is already in the requested Business Unit in which case it will be &#39;Complete&#39; |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PROCESSING | &quot;Processing&quot; |
| COMPLETE | &quot;Complete&quot; |
| CANCELED | &quot;Canceled&quot; |
| ERROR | &quot;Error&quot; |
{: class="table table-striped"}



