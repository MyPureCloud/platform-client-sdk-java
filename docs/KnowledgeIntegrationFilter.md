# KnowledgeIntegrationFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | [**NameEnum**](#Enum--NameEnum) | Filter name, which is the name of a setting in a knowledge source. |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Filter type. |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | Filter action. |  [optional] |
| **values** | [**List&lt;KnowledgeIntegrationFilterValue&gt;**](KnowledgeIntegrationFilterValue) | Available options of the filter setting. |  [optional] |


## Enum: NameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CATEGORIES | &quot;categories&quot; | 
| CHANNEL | &quot;channel&quot; | 
| KNOWLEDGEBASEIDS | &quot;knowledgeBaseIds&quot; | 


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SINGLESELECT | &quot;SingleSelect&quot; | 
| MULTISELECT | &quot;MultiSelect&quot; | 


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;None&quot; | 
| FILTERUPDATE | &quot;FilterUpdate&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
