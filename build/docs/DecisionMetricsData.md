# DecisionMetricsData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **user** | [**UserReference**](UserReference) | The user associated with the decision metrics |  |
| **performanceRank** | **Integer** | The performance ranking value of the user for decision metrics. The value ranges from 0 to 9999, with the highest value indicating the best performer |  [optional] |
| **tieBreakerValue** | **Integer** | A numeric tie-breaker value used to resolve ties in performance rankings. Values are sorted in ascending order, with lower values taking precedence |  [optional] |
| **metadata** | [**WfmEntityMetadata**](WfmEntityMetadata) | The metadata associated to the users decision metric, which will be null if the user has no associated decision metrics |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
