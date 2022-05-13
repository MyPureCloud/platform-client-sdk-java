---
title: ImportStatus
---
## ImportStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | current status of the import |  |
| **totalRecords** | <!----><!---->**Long**<!----> | total number of records to be imported |  |
| **completedRecords** | <!----><!---->**Long**<!----> | number of records finished importing |  |
| **percentComplete** | <!----><!---->**Integer**<!----> | percentage of records finished importing |  |
| **failureReason** | <!----><!---->**String**<!----> | if the import has failed, the reason for the failure |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN_PROGRESS | &quot;IN_PROGRESS&quot; | 
| FAILED | &quot;FAILED&quot; | 
{: class="table table-striped"}



