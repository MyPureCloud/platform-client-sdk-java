# CapacityPlanningRequirementsResultTopicStaffingRequirementsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **capacityPlan** | [**CapacityPlanningRequirementsResultTopicCapacityPlanReference**](CapacityPlanningRequirementsResultTopicCapacityPlanReference) |  |  [optional] |
| **businessUnit** | [**CapacityPlanningRequirementsResultTopicBusinessUnit**](CapacityPlanningRequirementsResultTopicBusinessUnit) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **referenceBusinessUnitDate** | [**Date**](Date) |  |  [optional] |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) |  |  [optional] |
| **downloadUrl** | **String** |  |  [optional] |
| **errorCode** | [**ErrorCodeEnum**](#Enum--ErrorCodeEnum) |  |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
