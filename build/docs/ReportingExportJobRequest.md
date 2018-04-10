---
title: ReportingExportJobRequest
---
## ReportingExportJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The user supplied name of the export request |  |
| **timeZone** | [**TimeZone**](TimeZone.html) | The requested timezone of the exported data |  |
| **exportFormat** | [**ExportFormatEnum**](#ExportFormatEnum) | The requested format of the exported data |  |
| **interval** | **String** | The time period used to limit the the exported data. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss |  [optional] |
| **dataColumns** | [**List&lt;DataColumn&gt;**](DataColumn.html) | The data columns included in the export |  |
| **period** | **String** | The Period of the request in which to break down the intervals. Periods are represented as an ISO-8601 string. For example: P1D or P1DT12H |  [optional] |
| **viewType** | [**ViewTypeEnum**](#ViewTypeEnum) | The type of view export job to be created |  |
| **filter** | [**ViewFilter**](ViewFilter.html) | Filters to apply to create the view |  |
| **read** | **Boolean** | Indicates if the request has been marked as read |  [optional] |
{: class="table table-striped"}


<a name="ExportFormatEnum"></a>

## Enum: ExportFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CSV | &quot;CSV&quot; |


<a name="ViewTypeEnum"></a>

## Enum: ViewTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| QUEUE_PERFORMANCE_SUMMARY_VIEW | &quot;QUEUE_PERFORMANCE_SUMMARY_VIEW&quot; |
| QUEUE_PERFORMANCE_DETAIL_VIEW | &quot;QUEUE_PERFORMANCE_DETAIL_VIEW&quot; |
| INTERACTION_SEARCH_VIEW | &quot;INTERACTION_SEARCH_VIEW&quot; |
| AGENT_PERFORMANCE_SUMMARY_VIEW | &quot;AGENT_PERFORMANCE_SUMMARY_VIEW&quot; |
| AGENT_PERFORMANCE_DETAIL_VIEW | &quot;AGENT_PERFORMANCE_DETAIL_VIEW&quot; |
| AGENT_STATUS_SUMMARY_VIEW | &quot;AGENT_STATUS_SUMMARY_VIEW&quot; |
| AGENT_STATUS_DETAIL_VIEW | &quot;AGENT_STATUS_DETAIL_VIEW&quot; |
| AGENT_EVALUATION_SUMMARY_VIEW | &quot;AGENT_EVALUATION_SUMMARY_VIEW&quot; |
| AGENT_EVALUATION_DETAIL_VIEW | &quot;AGENT_EVALUATION_DETAIL_VIEW&quot; |
| AGENT_QUEUE_DETAIL_VIEW | &quot;AGENT_QUEUE_DETAIL_VIEW&quot; |
| AGENT_INTERACTION_DETAIL_VIEW | &quot;AGENT_INTERACTION_DETAIL_VIEW&quot; |
| ABANDON_INSIGHTS_VIEW | &quot;ABANDON_INSIGHTS_VIEW&quot; |
| SKILLS_PERFORMANCE_VIEW | &quot;SKILLS_PERFORMANCE_VIEW&quot; |
{: class="table table-striped"}


