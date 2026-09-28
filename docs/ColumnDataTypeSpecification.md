# ColumnDataTypeSpecification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **columnName** | **String** | The column name of a column selected for dynamic queueing |  [optional] |
| **columnDataType** | [**ColumnDataTypeEnum**](#Enum--ColumnDataTypeEnum) | The data type of the column selected for dynamic queueing (TEXT, NUMERIC, TIMESTAMP or DATETIME). DATETIME supports dates from 1000-01-01 to 9999-12-31; TIMESTAMP is limited to 1970-01-01 through 2038-01-19. |  [optional] |
| **min** | **Integer** | The minimum length of the numeric column selected for dynamic queueing |  [optional] |
| **max** | **Integer** | The maximum length of the numeric column selected for dynamic queueing |  [optional] |
| **maxLength** | **Integer** | The maximum length of the text column selected for dynamic queueing |  [optional] |


## Enum: ColumnDataTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NUMERIC | &quot;NUMERIC&quot; | 
| TEXT | &quot;TEXT&quot; | 
| TIMESTAMP | &quot;TIMESTAMP&quot; | 
| DATETIME | &quot;DATETIME&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:264.1.0_
