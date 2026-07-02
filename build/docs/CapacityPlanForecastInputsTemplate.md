# CapacityPlanForecastInputsTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **referenceBusinessUnitDate** | [**LocalDate**](LocalDate) | The reference date for interval-based data relative to the business unit time zone for the forecast inputs. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity of the intervals |  |
| **months** | [**List&lt;YearMonth&gt;**](YearMonth) | The list of months covered by this capacity plan, formatted as yyyy-MM, populated for monthly granularity |  [optional] |
| **planningGroupsForecastData** | [**List&lt;ForecastInputPlanningGroupData&gt;**](ForecastInputPlanningGroupData) | The forecast data for the planning groups |  |
| **capacityPlanForecastSummary** | [**CapacityPlanForecastMetrics**](CapacityPlanForecastMetrics) | The summary of forecast inputs for this capacity plan, for the selected granularity |  |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
| MONTHLY | &quot;Monthly&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:257.1.0_
