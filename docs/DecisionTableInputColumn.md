# DecisionTableInputColumn


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the column. |  [optional] |
| **defaultsTo** | [**DecisionTableColumnDefaultRowValue**](DecisionTableColumnDefaultRowValue) | The default row value for this column that will complete the condition expression where no value is provided by a row. |  [optional] |
| **expression** | [**DecisionTableInputColumnExpression**](DecisionTableInputColumnExpression) | The input column condition expression, comprising the left side and comparator of a logical condition in the form of left|comparator|right, where each row of the decision table will provide the right side to form a complete condition |  |




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
