# CapacityPlanForecastImportSchema


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | The granularity at which forecast values are provided for each planning group |  |
| **businessUnitStartDate** | [**LocalDate**](LocalDate) | The first day of the forecast relative to the business unit time zone in yyyy-MM-dd format. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **planningGroups** | [**List&lt;CapacityPlanForecastPlanningGroup&gt;**](CapacityPlanForecastPlanningGroup) | The forecast data for the planning groups included in this forecast |  |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HOURLY | &quot;Hourly&quot; | 
| DAILY | &quot;Daily&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
