# AnswerOption


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **contextId** | **String** | An identifier for this answer that stays the same across versions of the form. |  [optional] |
| **builtInType** | [**BuiltInTypeEnum**](#Enum--BuiltInTypeEnum) | The built-in type of this answer option. Only used for built-in answer options such as selection states for Multiple Select answer options. Possible values include: Selected, Unselected |  [optional] |
| **text** | **String** |  |  [optional] |
| **value** | **Integer** |  |  [optional] |
| **assistanceConditions** | [**List&lt;AssistanceCondition&gt;**](AssistanceCondition) | List of assistance conditions which are combined together with a logical AND operator. Eg ( assistanceCondtion1 && assistanceCondition2 ) wherein assistanceCondition could be ( EXISTS topic1 || topic2 || ... ) or (NOTEXISTS topic3 || topic4 || ...). |  [optional] |


## Enum: BuiltInTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SELECTED | &quot;Selected&quot; | 
| UNSELECTED | &quot;Unselected&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
