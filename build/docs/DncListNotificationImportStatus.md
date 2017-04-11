---
title: DncListNotificationImportStatus
---
## DncListNotificationImportStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **importState** | [**ImportStateEnum**](#ImportStateEnum) |  |  [optional] |
| **totalRecords** | **Integer** |  |  [optional] |
| **completedRecords** | **Integer** |  |  [optional] |
| **percentageComplete** | **Integer** |  |  [optional] |
| **failureReason** | **String** |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="ImportStateEnum"></a>

## Enum: ImportStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| IN_PROGRESS | &quot;IN_PROGRESS&quot; |
| FAILED | &quot;FAILED&quot; |
{: class="table table-striped"}


