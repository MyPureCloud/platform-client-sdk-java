# SupportedLanguagesInfoDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **language** | **String** | The given supported Language |  [optional] |
| **intentClassification** | **Boolean** | The boolean status of if intent classification is supported in this language |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The language release status |  [optional] |
| **supportedEntityTypes** | **List&lt;String&gt;** | The supported entity types for this language |  [optional] |
| **supportedEntityTypeConfiguration** | [**SupportedEntityTypeStatus**](SupportedEntityTypeStatus) | The configuration for the supported entity types |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EARLY_PREVIEW | &quot;EARLY_PREVIEW&quot; | 
| PREVIEW | &quot;PREVIEW&quot; | 
| GA | &quot;GA&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
