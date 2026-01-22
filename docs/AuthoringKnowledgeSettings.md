# AuthoringKnowledgeSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **knowledgeId** | **String** | The ID of the knowledge settings to use |  [optional] |
| **description** | **String** | Description of the knowledge settings |  [optional] |
| **knowledgeType** | [**KnowledgeTypeEnum**](#Enum--KnowledgeTypeEnum) | The type of the knowledge settings (Standard or Enhanced) |  [optional] |
| **inheritFromExternal** | **Boolean** | Whether to inherit knowledge settings from externalIf disabled, query detection is always enabled on the guide. |  [optional] |


## Enum: KnowledgeTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STANDARD | &quot;Standard&quot; | 
| ENHANCED | &quot;Enhanced&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
