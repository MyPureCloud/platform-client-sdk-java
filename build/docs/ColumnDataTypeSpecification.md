---
title: ColumnDataTypeSpecification
---
## ColumnDataTypeSpecification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **columnName** | <!----><!---->**String**<!----> | The column name of a column selected for dynamic queueing |  [optional] |
| **columnDataType** | [**ColumnDataTypeEnum**](#ColumnDataTypeEnum)<!----> | The data type of the column selected for dynamic queueing (TEXT, NUMERIC or TIMESTAMP) |  [optional] |
| **min** | <!----><!---->**Integer**<!----> | The minimum length of the numeric column selected for dynamic queueing |  [optional] |
| **max** | <!----><!---->**Integer**<!----> | The maximum length of the numeric column selected for dynamic queueing |  [optional] |
| **maxLength** | <!----><!---->**Integer**<!----> | The maximum length of the text column selected for dynamic queueing |  [optional] |
{: class="table table-striped"}


<a name="ColumnDataTypeEnum"></a>

## Enum: ColumnDataTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NUMERIC | &quot;NUMERIC&quot; | 
| TEXT | &quot;TEXT&quot; | 
| TIMESTAMP | &quot;TIMESTAMP&quot; | 
{: class="table table-striped"}



