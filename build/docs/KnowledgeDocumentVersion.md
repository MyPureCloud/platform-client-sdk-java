---
title: KnowledgeDocumentVersion
---
## KnowledgeDocumentVersion


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Globally unique identifier for the document version. |  [optional] |
| **datePublished** | <!----><!---->[**Date**](Date.html)<!----> | Published date of document version. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **document** | <!----><!---->[**KnowledgeDocumentResponse**](KnowledgeDocumentResponse.html)<!----> | The document which is versioned. |  [optional] |
| **restoreFromVersionId** | <!----><!---->**String**<!----> | The globally unique identifier for the document version. If the value is provided, the document is restored to the given version. If not, it publishes the draft changes as a new version of the document. |  |
| **versionNumber** | <!----><!---->**Integer**<!----> | Version Number of the document. |  [optional] |
| **dateExpires** | <!----><!---->[**Date**](Date.html)<!----> | Expiry date of document version, applicable only to the 'Archived' version of the document. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



