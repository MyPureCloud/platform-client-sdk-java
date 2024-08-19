# KnowledgeDocumentBulkRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Document type according to assigned template |  |
| **externalUrl** | **String** | External Url to the document |  [optional] |
| **faq** | [**DocumentFaq**](DocumentFaq) | Faq document details |  [optional] |
| **categories** | [**List&lt;DocumentCategoryInput&gt;**](DocumentCategoryInput) | Document categories |  [optional] |
| **article** | [**DocumentArticle**](DocumentArticle) | Article details |  [optional] |
| **id** | **String** | Identifier of document for update. Omit for create new Document. |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAQ | &quot;Faq&quot; | 
| ARTICLE | &quot;Article&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
