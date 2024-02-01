---
title: FileSpecificationTemplate
---
## FileSpecificationTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the File Specification template. |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **description** | <!----><!---->**String**<!----> | Description of the file specification template |  [optional] |
| **format** | [**FormatEnum**](#FormatEnum)<!----> | File format |  |
| **numberOfHeadingLinesSkipped** | <!----><!---->**Integer**<!----> | Number of heading lines to be skipped |  [optional] |
| **numberOfTrailingLinesSkipped** | <!----><!---->**Integer**<!----> | Number of trailing lines to be skipped |  [optional] |
| **header** | <!----><!---->**Boolean**<!----> | If true indicates that delimited file has a header row, which can provide column names |  [optional] |
| **delimiter** | [**DelimiterEnum**](#DelimiterEnum)<!----> | Kind of delimiter |  [optional] |
| **delimiterValue** | <!----><!---->**String**<!----> | Delimiter character, used only when delimiter=\"Custom\" |  [optional] |
| **columnInformation** | <!----><!---->[**List&lt;Column&gt;**](Column.html)<!----> | Columns specification |  [optional] |
| **preprocessingRules** | <!----><!---->[**List&lt;PreprocessingRule&gt;**](PreprocessingRule.html)<!----> | Preprocessing rules |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="FormatEnum"></a>

## Enum: FormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FIXEDLENGTH | &quot;FixedLength&quot; | 
| DELIMITED | &quot;Delimited&quot; | 
{: class="table table-striped"}


<a name="DelimiterEnum"></a>

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
{: class="table table-striped"}



