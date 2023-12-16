---
title: BuForecastStaffingRequirementsResultResponse
---
## BuForecastStaffingRequirementsResultResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessUnitId** | <!----><!---->**String**<!----> | The ID of the business unit to which the forecast staffing requirements belongs |  |
| **forecast** | <!----><!---->[**BuShortTermForecastReference**](BuShortTermForecastReference.html)<!----> | The forecast reference |  |
| **referenceStartDate** | <!----><!---->[**Date**](Date.html)<!----> | The reference start date for interval-based data for this forecast as an ISO-8601 string |  |
| **weekCount** | <!----><!---->**Integer**<!----> | The number of weeks in this forecast |  |
| **intervalLengthMinutes** | <!----><!---->**Integer**<!----> | The period/interval in minutes for which to aggregate the data |  |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the staffing requirements generation |  |
| **results** | <!----><!---->[**List&lt;BuForecastStaffingRequirementsResult&gt;**](BuForecastStaffingRequirementsResult.html)<!----> | The forecast staffing requirement results, Will be populated when state == 'Complete' |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



