# CreateCapacityPlanStaffingGroupMetricChangeRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **numberOfWeeks** | **Integer** | The number of weeks to which the metric change applies |  |
| **weekStartNumber** | **Integer** | The start number of the week (starting from 1) to which the metric change applies, related to numberOfWeeks |  |
| **value** | **Double** | The value of the metric |  |
| **metric** | [**MetricEnum**](#Enum--MetricEnum) | The metric which is going to be modified for the selected staffing groups |  |
| **notes** | **String** | Notes about the staffing groups metric changes |  [optional] |
| **staffingGroupIds** | **List&lt;String&gt;** | The IDs of the staffing groups affected by the metric change |  |
| **version** | **Integer** | The version of the capacity plan |  |


## Enum: MetricEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STARTINGWEEKLYFULLTIMEEQUIVALENTCOUNT | &quot;StartingWeeklyFullTimeEquivalentCount&quot; | 
| NEWHIRESFULLTIMEEQUIVALENTCOUNT | &quot;NewHiresFullTimeEquivalentCount&quot; | 
| ATTRITIONPERCENTAGE | &quot;AttritionPercentage&quot; | 
| SHRINKAGEPERCENTAGE | &quot;ShrinkagePercentage&quot; | 
| TRANSFERSFULLTIMEEQUIVALENTCOUNT | &quot;TransfersFullTimeEquivalentCount&quot; | 
| EXTRATIMEUNDERTIMEFULLTIMEEQUIVALENTCOUNT | &quot;ExtraTimeUnderTimeFullTimeEquivalentCount&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
