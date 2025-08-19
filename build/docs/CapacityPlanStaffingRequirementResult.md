# CapacityPlanStaffingRequirementResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **businessUnit** | [**BusinessUnitReference**](BusinessUnitReference) | The business unit to which the capacity plan belongs |  |
| **capacityPlan** | [**CapacityPlanReference**](CapacityPlanReference) | The capacity plan for which requirements are generated |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the requirement generation of the capacity plan |  |
| **referenceBusinessUnitDate** | [**LocalDate**](LocalDate) | The reference date for interval-based data for the requirements. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity of the intervals |  |
| **errorCode** | [**ErrorCodeEnum**](#Enum--ErrorCodeEnum) | The error code when status is 'Failed' |  [optional] |
| **downloadUrl** | **String** | The URL to get the requirements results for the capacity plan. It will be populated if the status is 'Complete' |  [optional] |
| **downloadTemplate** | [**StaffingRequirementResultResponseTemplate**](StaffingRequirementResultResponseTemplate) | Staffing requirement results always come through downloadUrl, the schema included here is just for documentation |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEEKLY | &quot;Weekly&quot; | 


## Enum: ErrorCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TIMEDOUT | &quot;TimedOut&quot; | 
| NODATA | &quot;NoData&quot; | 
| CLIENTDATAINVALID | &quot;ClientDataInvalid&quot; | 
| CONFIGURATIONINVALID | &quot;ConfigurationInvalid&quot; | 
| REQUIREMENTSFAILED | &quot;RequirementsFailed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
