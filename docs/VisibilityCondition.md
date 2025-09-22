# VisibilityCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **combiningOperation** | [**CombiningOperationEnum**](#Enum--CombiningOperationEnum) |  |  [optional] |
| **predicates** | **List&lt;Object&gt;** | A list of strings, each representing the location in the form of the Answer Option to depend on. In the format of \"/form/questionGroup/{questionGroupIndex}/question/{questionIndex}/answer/{answerIndex}\" or, to assume the current question group, \"../question/{questionIndex}/answer/{answerIndex}\". Note: Indexes are zero-based |  [optional] |


## Enum: CombiningOperationEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;AND&quot; | 
| OR | &quot;OR&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
