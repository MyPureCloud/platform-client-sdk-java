---
title: AppendToDncActionSettings
---
## AppendToDncActionSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **expire** | <!----><!---->**Boolean**<!----> | Whether to expire the record appended to the DNC list. |  |
| **expirationDuration** | <!----><!---->**String**<!----> | If 'expire' is set to true, how long to keep the record. |  [optional] |
| **listType** | [**ListTypeEnum**](#ListTypeEnum)<!----> | The Dnc List Type to append entries to |  [optional] |
{: class="table table-striped"}


<a name="ListTypeEnum"></a>

## Enum: ListTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RDS | &quot;Rds&quot; | 
| RDSCUSTOM | &quot;RdsCustom&quot; | 
{: class="table table-striped"}



