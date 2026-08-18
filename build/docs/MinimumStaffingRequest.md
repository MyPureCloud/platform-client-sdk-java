# MinimumStaffingRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether the setting is turned on or off |  [optional] |
| **minimumValue** | **Double** | Default minimum staff value to be applied to all planning groups |  [optional] |
| **planningGroupOverrides** | [**ListWrapperPlanningGroupMinimumsRequest**](ListWrapperPlanningGroupMinimumsRequest) | List of planning groups with their minimum staff value overrides and the days to which the overrides apply. Setting the enclosed list to empty will clear out all existing overrides |  [optional] |
| **applicableIntervals** | [**ApplicableIntervalsEnum**](#Enum--ApplicableIntervalsEnum) | The intervals to which the minimum staff values will apply |  [optional] |


## Enum: ApplicableIntervalsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLINTERVALS | &quot;AllIntervals&quot; | 
| VOLUMEONLYINTERVALS | &quot;VolumeOnlyIntervals&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:260.0.0_
