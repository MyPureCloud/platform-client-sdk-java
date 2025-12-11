# FileSpecificationTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the File Specification template. |  |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **description** | **String** | Description of the file specification template |  [optional] |
| **format** | [**FormatEnum**](#Enum--FormatEnum) | File format |  |
| **numberOfHeadingLinesSkipped** | **Integer** | Number of heading lines to be skipped |  [optional] |
| **numberOfTrailingLinesSkipped** | **Integer** | Number of trailing lines to be skipped |  [optional] |
| **header** | **Boolean** | If true indicates that delimited file has a header row, which can provide column names |  [optional] |
| **delimiter** | [**DelimiterEnum**](#Enum--DelimiterEnum) | Kind of delimiter |  [optional] |
| **delimiterValue** | **String** | Delimiter character, used only when delimiter=\"Custom\" |  [optional] |
| **columnInformation** | [**List&lt;Column&gt;**](Column) | Columns specification |  [optional] |
| **preprocessingRules** | [**List&lt;PreprocessingRule&gt;**](PreprocessingRule) | Preprocessing rules |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: FormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FIXEDLENGTH | &quot;FixedLength&quot; | 
| DELIMITED | &quot;Delimited&quot; | 


## Enum: DelimiterEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMMA | &quot;Comma&quot; | 
| PIPE | &quot;Pipe&quot; | 
| COLON | &quot;Colon&quot; | 
| TAB | &quot;Tab&quot; | 
| SEMICOLON | &quot;Semicolon&quot; | 
| CUSTOM | &quot;Custom&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
