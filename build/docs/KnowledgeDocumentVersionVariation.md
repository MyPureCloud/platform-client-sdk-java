---
title: KnowledgeDocumentVersionVariation
---
## KnowledgeDocumentVersionVariation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the variation. |  [optional] |
| **body** | <!----><!---->[**DocumentBody**](DocumentBody.html)<!----> | The content for the variation. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The creation date-time for the document variation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The last modification date-time for the document variation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **contexts** | <!----><!---->[**List&lt;DocumentVariationContext&gt;**](DocumentVariationContext.html)<!----> | The context values associated with the variation. |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **documentVersion** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Reference to the document version to which the variation is associated with. |  [optional] |
{: class="table table-striped"}



