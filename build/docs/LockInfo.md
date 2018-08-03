---
title: LockInfo
---
## LockInfo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **lockedBy** | [**UriReference**](UriReference.html) |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateExpires** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **action** | [**ActionEnum**](#ActionEnum) |  |  [optional] |
{: class="table table-striped"}


<a name="ActionEnum"></a>

## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| UPDATE | &quot;UPDATE&quot; |
| DELETE | &quot;DELETE&quot; |
| COPY | &quot;COPY&quot; |
| MOVE | &quot;MOVE&quot; |
| REPLACE | &quot;REPLACE&quot; |
| THUMBNAIL | &quot;THUMBNAIL&quot; |
| TEXT_EXTRACTION | &quot;TEXT_EXTRACTION&quot; |
{: class="table table-striped"}



