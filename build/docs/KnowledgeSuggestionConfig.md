---
title: KnowledgeSuggestionConfig
---
## KnowledgeSuggestionConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **vendorName** | [**VendorNameEnum**](#VendorNameEnum)<!----> | The name of vendor used for knowledge suggestions. |  |
| **knowledgeBase** | <!----><!---->[**KnowledgeBaseReference**](KnowledgeBaseReference.html)<!----> | The ID of knowledge base to query when Genesys is the knowledge suggestions provider. |  [optional] |
| **knowledgeBases** | <!----><!---->[**List&lt;KnowledgeBaseWithDialectReference&gt;**](KnowledgeBaseWithDialectReference.html)<!----> | The knowledge bases to query based on dialect, when Genesys is the knowledge suggestions provider. |  [optional] |
{: class="table table-striped"}


<a name="VendorNameEnum"></a>

## Enum: VendorNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GOOGLEDIALOGFLOW | &quot;GoogleDialogflow&quot; | 
| GENESYSKNOWLEDGE | &quot;GenesysKnowledge&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



