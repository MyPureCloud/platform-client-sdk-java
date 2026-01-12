# ConversationSchemaData


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schema** | [**ConversationSchemaReference**](ConversationSchemaReference) | Schema that defines attributes. |  |
| **attributes** | [**List&lt;ConversationSchemaAttribute&gt;**](ConversationSchemaAttribute) | Attributes to use for filtering; number of elements: min: 1, max: 5. |  |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | Operator to apply for multiple attributes, default: MatchAll |  [optional] |


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MATCHANY | &quot;MatchAny&quot; | 
| MATCHALL | &quot;MatchAll&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
