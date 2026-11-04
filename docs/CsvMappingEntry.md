# CsvMappingEntry


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sourceField** | **String** | CSV field to map data from |  |
| **targetField** | **String** | Json path to map data to |  |
| **valueFormat** | [**ValueFormatEnum**](#Enum--ValueFormatEnum) | How the CSV cell value is interpreted at the target path. When omitted, the cell is treated as a string. |  [optional] |


## Enum: ValueFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;String&quot; | 
| JSON | &quot;Json&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
