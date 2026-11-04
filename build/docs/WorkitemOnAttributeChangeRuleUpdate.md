# WorkitemOnAttributeChangeRuleUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the rule. |  [optional] |
| **condition** | [**WorkitemOnAttributeChangeConditionUpdate**](WorkitemOnAttributeChangeConditionUpdate) | The rules condition. If the condition criteria is met the rules action will be executed. Mutually exclusive with match; supplying either replaces the rule's existing match criteria in full. |  [optional] |
| **match** | [**WorkitemOnAttributeChangeMatch**](WorkitemOnAttributeChangeMatch) | Grouped match criteria combined with logical operators. Mutually exclusive with condition; the supplied object replaces the rule's existing match criteria in full. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
