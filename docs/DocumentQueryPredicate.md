# DocumentQueryPredicate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fields** | [**List<FieldsEnum>**](#Enum--FieldsEnum) | Specifies the document fields to be matched against. |  |
| **values** | **List&lt;String&gt;** | Specifies the values of the fields to be matched against. |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Specifies the matching criteria between the fields and values. |  |


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


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQUALS | &quot;Equals&quot; | 
| NOTEQUALS | &quot;NotEquals&quot; | 
| CONTAINS | &quot;Contains&quot; | 
| MATCHALL | &quot;MatchAll&quot; | 
| MATCHANY | &quot;MatchAny&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.1.0_
