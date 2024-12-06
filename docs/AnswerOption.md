# AnswerOption


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **text** | **String** |  |  [optional] |
| **value** | **Integer** |  |  [optional] |
| **assistanceConditions** | [**List&lt;AssistanceCondition&gt;**](AssistanceCondition) | List of assistance conditions which are combined together with a logical AND operator. Eg ( assistanceCondtion1 && assistanceCondition2 ) wherein assistanceCondition could be ( EXISTS topic1 || topic2 || ... ) or (NOTEXISTS topic3 || topic4 || ...). |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
