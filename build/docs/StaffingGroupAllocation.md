# StaffingGroupAllocation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **staffingGroupId** | **String** | The staffing group to which the result allocation belongs |  |
| **shrinkagePercentages** | **List&lt;Double&gt;** | The weekly projected shrinkage percentage of staffing group, in the scale of 0 - 100 |  |
| **attritionPercentages** | **List&lt;Double&gt;** | The weekly projected attrition percentage of the staffing group, in the scale of 0 - 100 |  |
| **newHiresFullTimeEquivalentCount** | **List&lt;Double&gt;** | The weekly projected full time equivalent agents of new hire agents added to the staffing group |  [optional] |
| **startingWeeklyFullTimeEquivalentCount** | **Double** | The weekly count of full time equivalent agents that can be used for the first week of the capacity plan |  |
| **planningGroupIds** | **List&lt;String&gt;** | The IDs of the planning groups associated with this staffing group |  [optional] |
| **baseStartingFullTimeEquivalentCount** | **List&lt;Double&gt;** | The weekly calculated starting full time equivalent count |  [optional] |
| **attritionFullTimeEquivalentCount** | **List&lt;Double&gt;** | The weekly projected attrition full time equivalent count |  [optional] |
| **staffingGroupPlannedFullTimeEquivalentCount** | **List&lt;Double&gt;** | The weekly calculated staffing group full time equivalent count |  [optional] |
| **endOfMonthPlannedFullTimeEquivalentCount** | **List&lt;Double&gt;** | The end of month planned full time equivalent count of this staffing group |  [optional] |
| **shrinkageFullTimeEquivalentCount** | **List&lt;Double&gt;** | The weekly projected shrinkage full time equivalent count of this staffing group |  [optional] |
| **netFullTimeEquivalentCount** | **List&lt;Double&gt;** | The weekly net full time equivalent count of this staffing group |  [optional] |
| **extraTimeUnderTimeFullTimeEquivalentCount** | **List&lt;Double&gt;** | The weekly projected extra or under full time equivalent to the staffing group |  [optional] |
| **transfersFullTimeEquivalentCount** | **List&lt;Double&gt;** | The weekly projected full time equivalent transfers of agents into or out of this staffing group |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:258.0.0_
