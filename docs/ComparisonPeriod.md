# ComparisonPeriod


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **kpi** | **String** | Key Performance Indicator optimised during the comparison period. |  [optional] |
| **dateStarted** | [**Date**](Date) | Start date of the comparison period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnded** | [**Date**](Date) | End date of the comparison period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **percentageBenefit** | **Double** | The percentage benefit on this queue for the duration of the comparison period |  [optional] |
| **kpiResults** | [**List&lt;KpiResult&gt;**](KpiResult) | KPI results for each metric |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
