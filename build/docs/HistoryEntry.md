---
title: HistoryEntry
---
## HistoryEntry


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**ActionEnum**](#ActionEnum) | The action performed |  [optional] |
| **timestamp** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **user** | [**User**](User.html) |  |  [optional] |
| **version** | **String** |  |  [optional] |
| **secure** | **Boolean** |  |  [optional] |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CHECKIN | &quot;CHECKIN&quot; |
| CHECKOUT | &quot;CHECKOUT&quot; |
| CREATE | &quot;CREATE&quot; |
| DEACTIVATE | &quot;DEACTIVATE&quot; |
| DEBUG | &quot;DEBUG&quot; |
| DELETE | &quot;DELETE&quot; |
| PUBLISH | &quot;PUBLISH&quot; |
| REVERT | &quot;REVERT&quot; |
| SAVE | &quot;SAVE&quot; |
{: class="table table-striped"}


