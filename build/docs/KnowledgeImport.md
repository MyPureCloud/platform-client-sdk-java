---
title: KnowledgeImport
---
## KnowledgeImport


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Id of the import operation |  [optional] |
| **name** | <!----><!---->**String**<!----> | Name of the import operation |  [optional] |
| **uploadKey** | <!----><!---->**String**<!----> | Upload key |  |
| **fileType** | [**FileTypeEnum**](#FileTypeEnum)<!----> | file type of the document |  |
| **ignoreHeaders** | <!----><!---->**Boolean**<!----> | Ignore headers for the specified file |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of the operation |  [optional] |
| **report** | <!----><!---->[**ImportReport**](ImportReport.html)<!----> | Report of the import operation |  [optional] |
| **knowledgeBase** | <!----><!---->[**KnowledgeBase**](KnowledgeBase.html)<!----> | Knowledge base which document import does belong to |  [optional] |
| **languageCode** | [**LanguageCodeEnum**](#LanguageCodeEnum)<!----> | Language code |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Created date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="FileTypeEnum"></a>

## Enum: FileTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CSV | &quot;Csv&quot; |
| JSONLINES | &quot;JsonLines&quot; |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CREATED | &quot;Created&quot; |
| VALIDATIONINPROGRESS | &quot;ValidationInProgress&quot; |
| VALIDATIONCOMPLETED | &quot;ValidationCompleted&quot; |
| VALIDATIONFAILED | &quot;ValidationFailed&quot; |
| STARTED | &quot;Started&quot; |
| INPROGRESS | &quot;InProgress&quot; |
| COMPLETED | &quot;Completed&quot; |
| PARTIALCOMPLETED | &quot;PartialCompleted&quot; |
| FAILED | &quot;Failed&quot; |
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



