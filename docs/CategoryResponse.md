# CategoryResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the category. |  |
| **description** | **String** |  |  [optional] |
| **externalId** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **parentCategory** | [**CategoryReference**](CategoryReference) | The reference to category to which this category belongs to. |  [optional] |
| **documentCount** | **Integer** | Number of documents assigned to this category. |  [optional] |
| **knowledgeBase** | [**KnowledgeBaseReference**](KnowledgeBaseReference) | The reference to knowledge base to which the category belongs to. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
