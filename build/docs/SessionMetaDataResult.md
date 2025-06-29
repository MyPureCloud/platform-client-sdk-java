# SessionMetaDataResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sessionInfo** | [**SessionInfo**](SessionInfo) | Information about the continuous forecast session |  [optional] |
| **snapshots** | [**List&lt;Snapshots&gt;**](Snapshots) | Captured snapshots |  [optional] |
| **dateForecastStart** | [**Date**](Date) | Start date of the forecast. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateHistoricalStart** | [**Date**](Date) | Start date of the oldest available historical week. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **aggregateOfferedHistoricalAvailability** | [**AggregateHistoricalAvailability**](AggregateHistoricalAvailability) | Total historical availability for offered metric across all planning groups |  [optional] |
| **aggregateAverageHandleTimeHistoricalAvailability** | [**AggregateHistoricalAvailability**](AggregateHistoricalAvailability) | Total historical availability for average handle time metric across all planning groups |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
