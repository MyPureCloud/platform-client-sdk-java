# KnowledgeDocumentQuery


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pageSize** | **Integer** | Page size of the returned results. |  [optional] |
| **pageNumber** | **Integer** | Page number of the returned results. |  [optional] |
| **includeDraftDocuments** | **Boolean** | Indicates whether the results would also include draft documents. |  [optional] |
| **interval** | [**DocumentQueryInterval**](DocumentQueryInterval) | Retrieves the documents created/modified/published in specified date and time range. |  [optional] |
| **filter** | [**DocumentQuery**](DocumentQuery) | Filter for the document query. |  |
| **includeVariations** | [**IncludeVariationsEnum**](#Enum--IncludeVariationsEnum) | Indicates which document variations to include in returned documents. All: all variations regardless of the filter expression; AllMatching: all variations that match the filter expression; SingleMostRelevant: single variation that matches the filter expression and has the highest priority. The default is All. |  [optional] |
| **sortOrder** | [**SortOrderEnum**](#Enum--SortOrderEnum) | The sort order for results. |  [optional] |
| **sortBy** | [**SortByEnum**](#Enum--SortByEnum) | The field in the documents that you want to sort the results by. |  [optional] |


## Enum: IncludeVariationsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL | &quot;All&quot; | 
| ALLMATCHING | &quot;AllMatching&quot; | 
| SINGLEMOSTRELEVANT | &quot;SingleMostRelevant&quot; | 


## Enum: SortOrderEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ASC | &quot;Asc&quot; | 
| DESC | &quot;Desc&quot; | 


## Enum: SortByEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DATECREATED | &quot;DateCreated&quot; | 
| DATEMODIFIED | &quot;DateModified&quot; | 
| CATEGORYNAME | &quot;CategoryName&quot; | 
| LABELNAME | &quot;LabelName&quot; | 
| VIEWCOUNT | &quot;ViewCount&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
