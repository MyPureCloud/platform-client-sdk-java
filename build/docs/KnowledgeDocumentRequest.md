---
title: KnowledgeDocumentRequest
---
## KnowledgeDocumentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Document type according to assigned template |  |
| **externalUrl** | <!----><!---->**String**<!----> | External Url to the document |  [optional] |
| **faq** | <!----><!---->[**DocumentFaq**](DocumentFaq.html)<!----> | Faq document details |  [optional] |
| **categories** | <!----><!---->[**List&lt;DocumentCategoryInput&gt;**](DocumentCategoryInput.html)<!----> | Document categories |  [optional] |
| **article** | <!----><!---->[**DocumentArticle**](DocumentArticle.html)<!----> | Article details |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAQ | &quot;Faq&quot; | 
| ARTICLE | &quot;Article&quot; | 
{: class="table table-striped"}



