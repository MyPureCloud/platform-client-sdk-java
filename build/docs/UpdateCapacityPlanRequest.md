# UpdateCapacityPlanRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the capacity plan |  [optional] |
| **description** | **String** | Description of the capacity plan |  [optional] |
| **startBusinessUnitDate** | [**LocalDate**](LocalDate) | The start date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **endBusinessUnitDate** | [**LocalDate**](LocalDate) | The end date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **forecast** | [**ValueWrapperBuShortTermForecastReference**](ValueWrapperBuShortTermForecastReference) | The selected forecast for this capacity plan |  [optional] |
| **fullTimeEquivalentWeeklyHours** | **Double** | The weekly hours used to calculate full time equivalent agents |  [optional] |
| **useLatestPlanningGroupStaffingGroupAssociation** | **Boolean** | Whether to use latest staffing group to planning group association |  [optional] |
| **metadata** | [**CapacityPlanMetadata**](CapacityPlanMetadata) | The metadata of this capacity plan |  |




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
