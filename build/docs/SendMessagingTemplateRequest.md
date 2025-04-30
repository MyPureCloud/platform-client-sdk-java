# SendMessagingTemplateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **responseId** | **String** | A Response Management response identifier for a messaging template defined response |  [optional] |
| **parameters** | [**List&lt;TemplateParameter&gt;**](TemplateParameter) | A list of Response Management response substitutions for the response's messaging template. (Deprecated) use bodyParameters instead. |  [optional] |
| **headerParameters** | [**List&lt;TemplateParameter&gt;**](TemplateParameter) | A list of Response Management header parameter substitutions for the response's messaging template |  [optional] |
| **bodyParameters** | [**List&lt;TemplateParameter&gt;**](TemplateParameter) | A list of Response Management body parameter substitutions for the response's messaging template |  [optional] |
| **buttonUrlParameters** | [**List&lt;TemplateParameter&gt;**](TemplateParameter) | A list of Response Management button url parameter substitutions for the response's messaging template |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:224.0.0_
