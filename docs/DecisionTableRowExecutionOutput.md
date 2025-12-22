# DecisionTableRowExecutionOutput


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **rowId** | **String** | Unique rule identifier. |  |
| **rowIndex** | **Integer** | Unique rule identifier. |  |
| **outputs** | **Map&lt;String, Object&gt;** | The JSON output produced by this rule. Valid according to the execution output contract. In the case of enum decision table output columns, the enum options key will be provided as the value, not the enum options label as this can be changed. For business rules queue columns both “queue” and “id” keys will always be returned  regardless of the business rules queue attribute key and these do not change. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
