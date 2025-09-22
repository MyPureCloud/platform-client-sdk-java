# DecisionTableExecutionResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **table** | [**DecisionTableVersionEntity**](DecisionTableVersionEntity) | The decision table version entity that was executed. |  [optional] |
| **totalMatchRowCount** | **Integer** | Total number of rows that matched execution input and would return results |  [optional] |
| **topMatchRows** | [**List&lt;DecisionTableRowEntityRef&gt;**](DecisionTableRowEntityRef) | Top 5 rows matching execution input, excluding the one produced the result. |  [optional] |
| **rowExecutionOutputs** | [**List&lt;DecisionTableRowExecutionOutput&gt;**](DecisionTableRowExecutionOutput) | The output data for each executed row for which output is collected. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
