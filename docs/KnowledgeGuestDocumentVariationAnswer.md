# KnowledgeGuestDocumentVariationAnswer


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the variation. |  [optional] |
| **dateCreated** | [**Date**](Date) | The creation date-time for the document variation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The last modification date-time for the document variation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **documentVersion** | [**AddressableEntityRef**](AddressableEntityRef) | The version of the document. |  [optional] |
| **contexts** | [**List&lt;KnowledgeGuestDocumentVariationContext&gt;**](KnowledgeGuestDocumentVariationContext) | The context values associated with the variation. |  |
| **document** | [**AddressableEntityRef**](AddressableEntityRef) | The reference to document to which the variation is associated. |  [optional] |
| **body** | [**DocumentBodyWithHighlight**](DocumentBodyWithHighlight) | The content for the variation. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
