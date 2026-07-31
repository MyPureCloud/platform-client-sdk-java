# SkillExpressionValidationResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **valid** | **Boolean** | Whether the expression is valid |  [optional] |
| **expression** | **String** | Normalized SpEL expression (null if validation failed) |  [optional] |
| **skills** | [**List&lt;SkillReference&gt;**](SkillReference) | List of skill references extracted from the expression (empty if no skills found and/or invalid expression) |  [optional] |
| **errors** | [**List&lt;SkillExpressionValidationError&gt;**](SkillExpressionValidationError) | List of validation errors (empty if valid) |  [optional] |
| **hint** | **String** | Optional hint message (e.g., if expression is non-optimal or system is near capacity) |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:259.0.0_
