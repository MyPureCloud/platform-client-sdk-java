# DecisionTableRow


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **table** | [**DecisionTableVersionEntity**](DecisionTableVersionEntity) | The decision table to which this row belongs |  |
| **rowIndex** | **Integer** | The absolute index of this row in the decision table, starting at 1 |  [optional] |
| **dateCreated** | [**Date**](Date) | The date when this row was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date when this row was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **inputs** | [**Map&lt;String, DecisionTableRowParameterValue&gt;**](DecisionTableRowParameterValue) | The map input values of the row being created. At least one value must be provided. The key for this map is the column ID the row value relates |  [optional] |
| **outputs** | [**Map&lt;String, DecisionTableRowParameterValue&gt;**](DecisionTableRowParameterValue) | The map output values of the row being created. At least one value must be provided. The key for this map is the column ID the row value relates |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:235.0.0_
