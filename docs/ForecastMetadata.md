# ForecastMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateCreated** | [**Date**](Date) | Forecast creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **forecastId** | **String** | Forecast ID |  [optional] |
| **intervalLengthInMinutes** | **String** | Interval length |  [optional] |
| **source** | [**SourceEnum**](#Enum--SourceEnum) | Forecast source |  [optional] |
| **dateStart** | [**Date**](Date) | Forecast start date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **timeZone** | **String** | Timezone of the business unit |  [optional] |


## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AUTOMATICBESTMETHOD | &quot;AutomaticBestMethod&quot; | 
| MAINFORECAST | &quot;MainForecast&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
