---
title: KnowledgeDocument
---
## KnowledgeDocument


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **languageCode** | [**LanguageCodeEnum**](#LanguageCodeEnum)<!----> | Language of the document |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Document type |  |
| **faq** | <!----><!---->[**DocumentFaq**](DocumentFaq.html)<!----> | FAQ document details |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Document creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Document last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **categories** | <!----><!---->[**List&lt;KnowledgeCategory&gt;**](KnowledgeCategory.html)<!----> | Document categories |  [optional] |
| **knowledgeBase** | <!----><!---->[**KnowledgeBase**](KnowledgeBase.html)<!----> | Knowledge base which document does belong to |  [optional] |
| **externalUrl** | <!----><!---->**String**<!----> | External URL to the document |  [optional] |
| **article** | <!----><!---->[**DocumentArticle**](DocumentArticle.html)<!----> | Article |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="LanguageCodeEnum"></a>

## Enum: LanguageCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EN_US | &quot;en-US&quot; |
| EN_UK | &quot;en-UK&quot; |
| EN_AU | &quot;en-AU&quot; |
| DE_DE | &quot;de-DE&quot; |
| ES_US | &quot;es-US&quot; |
| ES_ES | &quot;es-ES&quot; |
| FR_FR | &quot;fr-FR&quot; |
| PT_BR | &quot;pt-BR&quot; |
| NL_NL | &quot;nl-NL&quot; |
| IT_IT | &quot;it-IT&quot; |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| FAQ | &quot;Faq&quot; |
| ARTICLE | &quot;Article&quot; |
{: class="table table-striped"}



