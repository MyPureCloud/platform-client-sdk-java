# StaffingGroupMetricChangeResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **numberOfWeeks** | **Integer** | The number of weeks to which the metric change applies |  |
| **weekStartNumber** | **Integer** | The start number of the week (starting from 1) to which the metric change applies, related to numberOfWeeks |  |
| **value** | **Double** | The value of the metric |  |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | The metric which is going to be modified for the selected staffing groups |  |
| **notes** | **String** | Notes about the staffing groups metric changes |  [optional] |
| **staffingGroups** | [**List&lt;StaffingGroupReference&gt;**](StaffingGroupReference) | The staffing groups affected by the metric change |  |
| **createdBy** | [**UserReference**](UserReference) | The user who created the metric change |  |
| **createdDate** | [**Date**](Date) | The date the entity was created, in ISO-8601 format |  |


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STARTINGWEEKLYFULLTIMEEQUIVALENTCOUNT | &quot;StartingWeeklyFullTimeEquivalentCount&quot; | 
| NEWHIRESFULLTIMEEQUIVALENTCOUNT | &quot;NewHiresFullTimeEquivalentCount&quot; | 
| ATTRITIONPERCENTAGE | &quot;AttritionPercentage&quot; | 
| SHRINKAGEPERCENTAGE | &quot;ShrinkagePercentage&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:234.0.0_
