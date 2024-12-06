# DocumentVariationAnswer


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the variation. |  [optional] |
| **dateCreated** | [**Date**](Date) | The creation date-time for the document variation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The last modification date-time for the document variation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **documentVersion** | [**AddressableEntityRef**](AddressableEntityRef) | The version of the document. |  [optional] |
| **contexts** | [**List&lt;DocumentVariationContext&gt;**](DocumentVariationContext) | The context values associated with the variation. |  |
| **document** | [**KnowledgeDocumentReference**](KnowledgeDocumentReference) | The reference to document to which the variation is associated. |  [optional] |
| **priority** | **Integer** | The priority of the variation. |  [optional] |
| **name** | **String** | The name of the variation. |  [optional] |
| **body** | [**DocumentBodyWithHighlight**](DocumentBodyWithHighlight) | The content for the variation. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:215.0.0_
