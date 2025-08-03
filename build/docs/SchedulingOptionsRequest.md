# SchedulingOptionsRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **noForecastOptions** | [**SchedulingNoForecastOptionsRequest**](SchedulingNoForecastOptionsRequest) | Schedule generation options to apply if no forecast is supplied |  [optional] |
| **activitySmoothingType** | [**ActivitySmoothingTypeEnum**](#Enum--ActivitySmoothingTypeEnum) | Overrides the default BU level activity smoothing type for this schedule generation |  [optional] |
| **induceScheduleVariability** | **Boolean** | Overrides the default BU level induce schedule variability setting for this schedule generation |  [optional] |


## Enum: ActivitySmoothingTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REDUCECONCURRENTACTIVITIESACROSSBU | &quot;ReduceConcurrentActivitiesAcrossBu&quot; | 
| REDUCECONCURRENTACTIVITIESACROSSMU | &quot;ReduceConcurrentActivitiesAcrossMu&quot; | 
| CONSISTENTSERVICELEVEL | &quot;ConsistentServiceLevel&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
