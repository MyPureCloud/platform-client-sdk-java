# DynamicListValuesAllOf


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dataActionId** | **String** | The ID of the data action to invoke at runtime to retrieve list values and synonyms. |  |
| **inputs** | [**List&lt;DataActionInput&gt;**](DataActionInput) | Array of input mappings for the data action. Maps guide variables to data action input parameters. |  [optional] |
| **fieldMapping** | [**FieldMapping**](FieldMapping) |  |  |
| **matchType** | [**MatchTypeEnum**](#Enum--MatchTypeEnum) | Defines how matching should work at runtime. Only 'Exact' matching is supported for dynamic lists. |  |


## Enum: MatchTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXACT | &quot;Exact&quot; | 
| SEMANTIC | &quot;Semantic&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:265.0.0_
