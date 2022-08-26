---
title: KnowledgeDocumentResponse
---
## KnowledgeDocumentResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **title** | <!----><!---->**String**<!----> | Document title. |  [optional] |
| **visible** | <!----><!---->**Boolean**<!----> | Indicates if the knowledge document should be included in search results. |  [optional] |
| **alternatives** | <!----><!---->[**List&lt;KnowledgeDocumentAlternative&gt;**](KnowledgeDocumentAlternative.html)<!----> | List of alternate phrases related to the title which improves search results. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | State of the document. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Document creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Document last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lastPublishedVersionNumber** | <!----><!---->**Integer**<!----> | The last published version number of the document. |  [optional] |
| **datePublished** | <!----><!---->[**Date**](Date.html)<!----> | The date on which the document was last published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who created the document. |  [optional] |
| **modifiedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who modified the document. |  [optional] |
| **documentVersion** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The version of the document. |  [optional] |
| **category** | <!----><!---->[**CategoryResponse**](CategoryResponse.html)<!----> | The reference to category associated with the document. |  [optional] |
| **labels** | <!----><!---->[**List&lt;LabelResponse&gt;**](LabelResponse.html)<!----> | The references to labels associated with the document. |  [optional] |
| **knowledgeBase** | <!----><!---->[**KnowledgeBaseReference**](KnowledgeBaseReference.html)<!----> | Knowledge base to which the document belongs to. |  [optional] |
| **variations** | <!----><!---->[**List&lt;DocumentVariation&gt;**](DocumentVariation.html)<!----> | Variations of the document. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DRAFT | &quot;Draft&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| ARCHIVED | &quot;Archived&quot; | 
{: class="table table-striped"}



