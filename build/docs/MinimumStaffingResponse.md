# MinimumStaffingResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether the setting is turned on or off |  |
| **minimumValue** | **Double** | Default minimum staff value to be applied to all planning groups |  |
| **planningGroupOverrides** | [**List&lt;PlanningGroupMinimumsResponse&gt;**](PlanningGroupMinimumsResponse) | List of planning groups with their minimum staff value overrides and the days to which the overrides apply |  |
| **applicableIntervals** | [**ApplicableIntervalsEnum**](#Enum--ApplicableIntervalsEnum) | The intervals to which the minimum staff values will apply |  |
| **metadata** | [**WfmVersionedEntityMetadata**](WfmVersionedEntityMetadata) | Metadata for the business unit's minimum staffing settings |  |


## Enum: ApplicableIntervalsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLINTERVALS | &quot;AllIntervals&quot; | 
| VOLUMEONLYINTERVALS | &quot;VolumeOnlyIntervals&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:256.0.0_
