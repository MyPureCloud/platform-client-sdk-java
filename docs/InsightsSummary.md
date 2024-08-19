# InsightsSummary


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entities** | [**List&lt;InsightsSummaryUserItem&gt;**](InsightsSummaryUserItem) |  |  [optional] |
| **pageSize** | **Integer** |  |  [optional] |
| **pageNumber** | **Integer** |  |  [optional] |
| **total** | **Long** |  |  [optional] |
| **performanceProfile** | [**AddressableEntityRef**](AddressableEntityRef) | The performance profile |  [optional] |
| **division** | [**DivisionReference**](DivisionReference) | The division |  [optional] |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | Granularity |  [optional] |
| **comparativePeriod** | [**WorkdayPeriod**](WorkdayPeriod) | The comparative period work day date range |  [optional] |
| **primaryPeriod** | [**WorkdayPeriod**](WorkdayPeriod) | The primary period work day date range |  [optional] |
| **pageCount** | **Integer** |  |  [optional] |
{: class="table table-striped"}


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
| MONTHLY | &quot;Monthly&quot; | 
{: class="table table-striped"}



