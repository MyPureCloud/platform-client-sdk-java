---
title: DocumentQueryPredicate
---
## DocumentQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fields** | <!---->[**List&lt;FieldsEnum&gt;**](#FieldsEnum)<!----> | Specifies the document fields to be matched against. |  |
| **values** | <!----><!---->**List&lt;String&gt;**<!----> | Specifies the values of the fields to be matched against. |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Specifies the matching criteria between the fields and values. |  |
{: class="table table-striped"}


<a name="FieldsEnum"></a>

## Enum: FieldsEnum

| Name | Value |
| ---- | ----- |
| ALTERNATIVES | &quot;alternatives&quot; |
| CATEGORYID | &quot;categoryId&quot; |
| CATEGORYNAME | &quot;categoryName&quot; |
| CONTEXTID | &quot;contextId&quot; |
| CONTEXTNAME | &quot;contextName&quot; |
| CONTEXTVALUEID | &quot;contextValueId&quot; |
| CONTEXTVALUENAME | &quot;contextValueName&quot; |
| DOCUMENTID | &quot;documentId&quot; |
| LABELID | &quot;labelId&quot; |
| LABELNAME | &quot;labelName&quot; |
| TITLE | &quot;title&quot; |
| VARIATIONID | &quot;variationId&quot; |
| VISIBLE | &quot;visible&quot; |
| STATE | &quot;state&quot; |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;Equals&quot; | 
| NOTEQUALS | &quot;NotEquals&quot; | 
| CONTAINS | &quot;Contains&quot; | 
| MATCHALL | &quot;MatchAll&quot; | 
| MATCHANY | &quot;MatchAny&quot; | 
{: class="table table-striped"}



