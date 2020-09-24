---
title: KnowledgeSearchDocument
---
## KnowledgeSearchDocument


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **languageCode** | [**LanguageCodeEnum**](#LanguageCodeEnum)<!----> | Language of the document |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Document type |  |
| **faq** | <!----><!---->[**DocumentFaq**](DocumentFaq.html)<!----> | FAQ document details |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Document creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Document last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **categories** | <!----><!---->[**List&lt;KnowledgeCategory&gt;**](KnowledgeCategory.html)<!----> | Document categories |  [optional] |
| **knowledgeBase** | <!----><!---->[**KnowledgeBase**](KnowledgeBase.html)<!----> | Knowledge base which document does belong to |  [optional] |
| **externalUrl** | <!----><!---->**String**<!----> | External URL to the document |  [optional] |
| **confidence** | <!----><!---->**Double**<!----> | The confidence associated with a document with respect to a search query |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="LanguageCodeEnum"></a>

## Enum: LanguageCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EN_US | &quot;en-US&quot; |
| DE_DE | &quot;de-DE&quot; |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| FAQ | &quot;Faq&quot; |
{: class="table table-striped"}



