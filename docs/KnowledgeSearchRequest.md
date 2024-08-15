# KnowledgeSearchRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **query** | **String** | Input query to search content in the knowledge base |  |
| **pageSize** | **Integer** | Page size of the returned results |  [optional] |
| **pageNumber** | **Integer** | Page number of the returned results |  [optional] |
| **documentType** | [**DocumentTypeEnum**](#Enum--DocumentTypeEnum) | Document type to be used while searching |  [optional] |
| **languageCode** | **String** | query search for specific languageCode |  |
| **searchOnDraftDocuments** | **Boolean** | If true the search query will be executed on draft documents, else it will be on active documents |  [optional] |
{: class="table table-striped"}


## Enum: DocumentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FAQ | &quot;Faq&quot; | 
| ARTICLE | &quot;Article&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:207.0.0_
