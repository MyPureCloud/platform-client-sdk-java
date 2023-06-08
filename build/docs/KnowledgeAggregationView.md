---
title: KnowledgeAggregationView
---
## KnowledgeAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#TargetEnum)<!----> | Target metric name |  |
| **name** | <!----><!---->**String**<!----> | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#FunctionEnum)<!----> | Type of view you wish to create |  |
| **range** | <!----><!---->[**AggregationRange**](AggregationRange.html)<!----> | Range of numbers for slicing up data |  [optional] |
{: class="table table-striped"}


<a name="TargetEnum"></a>

## Enum: TargetEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NDISTINCTKNOWLEDGESESSIONS | &quot;nDistinctKnowledgeSessions&quot; | 
| NKNOWLEDGEDOCUMENTCOPIED | &quot;nKnowledgeDocumentCopied&quot; | 
| NKNOWLEDGEDOCUMENTFEEDBACK | &quot;nKnowledgeDocumentFeedback&quot; | 
| NKNOWLEDGEDOCUMENTPRESENTED | &quot;nKnowledgeDocumentPresented&quot; | 
| NKNOWLEDGEDOCUMENTSURFACED | &quot;nKnowledgeDocumentSurfaced&quot; | 
| NKNOWLEDGEDOCUMENTVIEWED | &quot;nKnowledgeDocumentViewed&quot; | 
| NKNOWLEDGESEARCH | &quot;nKnowledgeSearch&quot; | 
| NKNOWLEDGESEARCHANSWERED | &quot;nKnowledgeSearchAnswered&quot; | 
| NKNOWLEDGESEARCHFEEDBACK | &quot;nKnowledgeSearchFeedback&quot; | 
| NKNOWLEDGESEARCHUNANSWERED | &quot;nKnowledgeSearchUnanswered&quot; | 
| NKNOWLEDGESESSIONS | &quot;nKnowledgeSessions&quot; | 
| OKNOWLEDGEDOCUMENTQUERY | &quot;oKnowledgeDocumentQuery&quot; | 
| OKNOWLEDGEDOCUMENTQUERYSELFSERVED | &quot;oKnowledgeDocumentQuerySelfServed&quot; | 
| OKNOWLEDGESEARCH | &quot;oKnowledgeSearch&quot; | 
{: class="table table-striped"}


<a name="FunctionEnum"></a>

## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 
{: class="table table-striped"}



