---
title: LearningModule
---
## LearningModule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of learning module |  |
| **excludedFromCatalog** | <!----><!---->**Boolean**<!----> | If true, learning module is excluded when retrieving modules for manual assignment |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who created learning module |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date/time learning module was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who modified learning module |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The date/time learning module was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | The version of published learning module |  [optional] |
| **externalId** | <!----><!---->**String**<!----> | The external ID of the learning module |  [optional] |
| **source** | [**SourceEnum**](#SourceEnum)<!----> | The source of the learning module |  [optional] |
| **rule** | <!----><!---->[**LearningModuleRule**](LearningModuleRule.html)<!----> | The rule for learning module; read-only, and only populated when requested via expand param. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **isArchived** | <!----><!---->**Boolean**<!----> | If true, learning module is archived |  [optional] |
| **isPublished** | <!----><!---->**Boolean**<!----> | If true, learning module is published |  [optional] |
| **description** | <!----><!---->**String**<!----> | The description of learning module |  [optional] |
| **completionTimeInDays** | <!----><!---->**Integer**<!----> | The completion time of learning module in days |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type for the learning module |  [optional] |
| **informSteps** | <!----><!---->[**List&lt;LearningModuleInformStep&gt;**](LearningModuleInformStep.html)<!----> | The list of inform steps in a learning module |  [optional] |
| **assessmentForm** | <!----><!---->[**AssessmentForm**](AssessmentForm.html)<!----> | The assessment form for learning module |  [optional] |
| **summaryData** | <!----><!---->[**LearningModuleSummary**](LearningModuleSummary.html)<!----> | The learning module summary data |  [optional] |
| **reassignSummaryData** | <!----><!---->[**LearningModuleReassignSummary**](LearningModuleReassignSummary.html)<!----> | The learning module reassign summary data |  [optional] |
| **coverArt** | <!----><!---->[**LearningModuleCoverArtResponse**](LearningModuleCoverArtResponse.html)<!----> | The cover art for the learning module |  [optional] |
| **lengthInMinutes** | <!----><!---->**Integer**<!----> | The recommended time in minutes to complete the module |  [optional] |
| **archivalMode** | [**ArchivalModeEnum**](#ArchivalModeEnum)<!----> | The mode of archival for learning module |  [optional] |
{: class="table table-striped"}


<a name="SourceEnum"></a>

## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USERCREATED | &quot;UserCreated&quot; | 
| GENESYSBEYOND | &quot;GenesysBeyond&quot; | 
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INFORMATIONAL | &quot;Informational&quot; | 
| ASSESSEDCONTENT | &quot;AssessedContent&quot; | 
| ASSESSMENT | &quot;Assessment&quot; | 
| EXTERNAL | &quot;External&quot; | 
{: class="table table-striped"}


<a name="ArchivalModeEnum"></a>

## Enum: ArchivalModeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GRACEFUL | &quot;Graceful&quot; | 
| IMMEDIATE | &quot;Immediate&quot; | 
{: class="table table-striped"}



