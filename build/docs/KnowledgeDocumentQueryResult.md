# KnowledgeDocumentQueryResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **title** | **String** | Document title, having a limit of 500 words. |  [optional] |
| **visible** | **Boolean** | Indicates if the knowledge document should be included in search results. |  [optional] |
| **alternatives** | [**List&lt;KnowledgeDocumentAlternative&gt;**](KnowledgeDocumentAlternative) | List of alternate phrases related to the title which improves search results. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | State of the document. |  [optional] |
| **dateCreated** | [**Date**](Date) | Document creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Document last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateImported** | [**Date**](Date) | Document import date-time, or null if was not imported. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lastPublishedVersionNumber** | **Integer** | The last published version number of the document. |  [optional] |
| **datePublished** | [**Date**](Date) | The date on which the document was last published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The user who created the document. |  [optional] |
| **modifiedBy** | [**UserReference**](UserReference) | The user who modified the document. |  [optional] |
| **documentVersion** | [**AddressableEntityRef**](AddressableEntityRef) | The version of the document. |  [optional] |
| **category** | [**CategoryResponse**](CategoryResponse) | The reference to category associated with the document. |  [optional] |
| **labels** | [**List&lt;LabelResponse&gt;**](LabelResponse) | The references to labels associated with the document. |  [optional] |
| **knowledgeBase** | [**KnowledgeBaseReference**](KnowledgeBaseReference) | Knowledge base to which the document belongs to. |  [optional] |
| **externalId** | **String** | The reference to external id associated with the document. |  [optional] |
| **externalUrl** | **String** | The URL to external document. |  [optional] |
| **source** | [**AddressableEntityRef**](AddressableEntityRef) | The reference to source associated with the document. |  [optional] |
| **readonly** | **Boolean** | Whether the document is read-only. |  [optional] |
| **variations** | [**List&lt;KnowledgeDocumentQueryVariation&gt;**](KnowledgeDocumentQueryVariation) | Variations of the document. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| ARCHIVED | &quot;Archived&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:231.0.0_
