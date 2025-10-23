# BuForecastStaffingRequirementsResultResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessUnitId** | **String** | The ID of the business unit to which the forecast staffing requirements belongs |  |
| **forecast** | [**BuShortTermForecastReference**](BuShortTermForecastReference) | The forecast reference |  |
| **referenceStartDate** | [**Date**](Date) | The reference start date for interval-based data for this forecast as an ISO-8601 string |  |
| **weekCount** | **Integer** | The number of weeks in this forecast |  |
| **intervalLengthMinutes** | **Integer** | The period/interval in minutes for which to aggregate the data |  |
| **state** | [**StateEnum**](#Enum--StateEnum) | The state of the staffing requirements generation |  |
| **results** | [**List&lt;BuForecastStaffingRequirementsResult&gt;**](BuForecastStaffingRequirementsResult) | The forecast staffing requirement results, Will be populated when state == 'Complete' |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
