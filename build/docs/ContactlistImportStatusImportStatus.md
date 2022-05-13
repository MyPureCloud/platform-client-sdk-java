---
title: ContactlistImportStatusImportStatus
---
## ContactlistImportStatusImportStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **importState** | [**ImportStateEnum**](#ImportStateEnum)<!----> | current status of the import |  [optional] |
| **totalRecords** | <!----><!---->**Integer**<!----> | total number of records to be imported |  [optional] |
| **completedRecords** | <!----><!---->**Integer**<!----> | number of records finished importing |  [optional] |
| **percentageComplete** | <!----><!---->**Integer**<!----> | percentage of records finished importing |  [optional] |
| **failureReason** | <!----><!---->**String**<!----> | if the import has failed, the reason for the failure |  [optional] |
{: class="table table-striped"}


<a name="ImportStateEnum"></a>

## Enum: ImportStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN_PROGRESS | &quot;IN_PROGRESS&quot; | 
| FAILED | &quot;FAILED&quot; | 
{: class="table table-striped"}



