# CapacityPlanRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the capacity plan |  |
| **description** | **String** | Description of the capacity plan |  [optional] |
| **startBusinessUnitDate** | [**LocalDate**](LocalDate) | The start date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **endBusinessUnitDate** | [**LocalDate**](LocalDate) | The end date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **forecast** | [**BuShortTermForecastReference**](BuShortTermForecastReference) | The generated forecast for this capacity plan. Exactly one of forecast or importedForecast must be provided |  [optional] |
| **importedForecast** | [**CapacityPlanImportedForecastRequest**](CapacityPlanImportedForecastRequest) | The externally imported forecast for this capacity plan. Exactly one of forecast or importedForecast must be provided |  [optional] |
| **fullTimeEquivalentWeeklyHours** | **Double** | The weekly hours used to calculate full time equivalent agents |  |
| **staffingGroupAllocations** | [**List&lt;CreateStaffingGroupAllocation&gt;**](CreateStaffingGroupAllocation) | List of staffing group allocations to be used for the capacity plan |  |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
