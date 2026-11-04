# CopyCapacityPlanRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the new capacity plan |  |
| **description** | **String** | Description of the new capacity plan |  [optional] |
| **startBusinessUnitDate** | [**LocalDate**](LocalDate) | The start date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **endBusinessUnitDate** | [**LocalDate**](LocalDate) | The end date for the capacity plan relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **forecast** | [**ValueWrapperBuShortTermForecastReference**](ValueWrapperBuShortTermForecastReference) | The generated forecast for the capacity plan. Uses forecast from original capacity plan if not specified |  [optional] |
| **importedForecast** | [**ValueWrapperCapacityPlanImportedForecastRequest**](ValueWrapperCapacityPlanImportedForecastRequest) | The externally imported forecast for the capacity plan. Uses forecast from original capacity plan if not specified |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
