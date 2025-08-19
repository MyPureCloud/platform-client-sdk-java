# KnowledgeAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#Enum--TargetEnum) | Target metric name |  |
| **name** | **String** | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#Enum--FunctionEnum) | Type of view you wish to create |  |
| **range** | [**AggregationRange**](AggregationRange) | Range of numbers for slicing up data |  [optional] |


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


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
