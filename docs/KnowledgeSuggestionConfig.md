# KnowledgeSuggestionConfig


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **vendorName** | [**VendorNameEnum**](#Enum--VendorNameEnum) | The name of vendor used for knowledge suggestions. |  |
| **knowledgeBase** | [**KnowledgeBaseReference**](KnowledgeBaseReference) | The ID of knowledge base to query when Genesys is the knowledge suggestions provider. |  [optional] |
| **knowledgeBases** | [**List&lt;KnowledgeBaseWithDialectReference&gt;**](KnowledgeBaseWithDialectReference) | The knowledge bases to query based on dialect, when Genesys is the knowledge suggestions provider. |  [optional] |
| **receiveSegmentedArticles** | **Boolean** | Include segmented articles in knowledge suggestions. |  [optional] |


## Enum: VendorNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GOOGLEDIALOGFLOW | &quot;GoogleDialogflow&quot; | 
| GENESYSKNOWLEDGE | &quot;GenesysKnowledge&quot; | 
| GENESYSKNOWLEDGEV3 | &quot;GenesysKnowledgeV3&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
