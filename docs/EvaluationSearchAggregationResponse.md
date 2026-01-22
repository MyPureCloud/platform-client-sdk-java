# EvaluationSearchAggregationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **value** | **Double** | Simple aggregation value (for SUM, COUNT, AVERAGE, etc.) |  [optional] |
| **count** | **Long** | Count of documents |  [optional] |
| **minimum** | **Double** | Minimum value |  [optional] |
| **maximum** | **Double** | Maximum value |  [optional] |
| **average** | **Double** | Average value |  [optional] |
| **sum** | **Double** | Total Sum |  [optional] |
| **documentCountErrorUpperBound** | **Long** | Upper bound estimate of the error in document count for this aggregation |  [optional] |
| **sumOtherDocumentCount** | **Long** | Total document count for buckets not included in the response due to size limits |  [optional] |
| **buckets** | [**List&lt;EvaluationSearchAggregationBucket&gt;**](EvaluationSearchAggregationBucket) | List of aggregation buckets |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
