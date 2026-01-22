# EvaluationSearchAggregationBucket


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | **String** | The key for this bucket |  [optional] |
| **keyAsString** | **String** | The key as a string representation |  [optional] |
| **documentCount** | **Long** | Number of documents in this bucket |  [optional] |
| **keyValue** | **Long** | Numeric key value for date histograms |  [optional] |
| **from** | **Double** | Lower bound for range buckets |  [optional] |
| **to** | **Double** | Upper bound for range buckets |  [optional] |
| **value** | **Double** | Simple aggregation value |  [optional] |
| **count** | **Long** | Count of documents |  [optional] |
| **minimum** | **Double** | Minimum value in the aggregation |  [optional] |
| **maximum** | **Double** | Maximum value in the aggregation |  [optional] |
| **average** | **Double** | Average value in the aggregation |  [optional] |
| **sum** | **Double** | Sum of values in the aggregation |  [optional] |
| **subAggregations** | [**Map&lt;String, EvaluationSearchAggregationResponse&gt;**](EvaluationSearchAggregationResponse) | Nested sub-aggregations |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
