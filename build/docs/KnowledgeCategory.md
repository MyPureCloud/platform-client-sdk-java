---
title: KnowledgeCategory
---
## KnowledgeCategory


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | Category name |  |
| **description** | <!----><!---->**String**<!----> | Category description |  [optional] |
| **knowledgeBase** | <!----><!---->[**KnowledgeBase**](KnowledgeBase.html)<!----> | Knowledge base which category does belong to |  [optional] |
| **languageCode** | [**LanguageCodeEnum**](#LanguageCodeEnum)<!----> | Actual language of the category |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Category creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Category last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
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



