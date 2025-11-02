# CreateDecisionTableRowRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **rowIndex** | **Integer** | The absolute position of this row in the decision table. Must be an integerstarting from 1, must be positive and less than or equal to the size of the table. If not provided row will be append to the end of the table.  |  [optional] |
| **inputs** | [**Map&lt;String, DecisionTableRowParameterValue&gt;**](DecisionTableRowParameterValue) | The input values of the row. The key for this map is the column ID the row value relates. Column IDs are available from the decision table entity |  |
| **outputs** | [**Map&lt;String, DecisionTableRowParameterValue&gt;**](DecisionTableRowParameterValue) | The output values of the row. The key for this map is the column ID the row value relates. Column IDs are available from the decision table entity |  |




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
