# CreateKpiRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Key Performance Indicator. |  |
| **description** | **String** | The description of the Key Performance Indicator. |  [optional] |
| **kpiType** | [**KpiTypeEnum**](#Enum--KpiTypeEnum) | The type of the Key Performance Indicator. |  |
| **wrapUpCodeConfig** | [**WrapUpCodeConfig**](WrapUpCodeConfig) | Defines what wrap up codes are mapped to Key Performance Indicator. |  [optional] |
| **source** | [**SourceEnum**](#Enum--SourceEnum) | The source of the Key Performance Indicator. |  |


## Enum: KpiTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SALESCONVERSION | &quot;SalesConversion&quot; | 
| CHURN | &quot;Churn&quot; | 
| RETENTION | &quot;Retention&quot; | 
| SALESVALUE | &quot;SalesValue&quot; | 


## Enum: SourceEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WRAPUPCODE | &quot;WrapUpCode&quot; | 
| OUTCOME | &quot;Outcome&quot; | 
| NONE | &quot;None&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
