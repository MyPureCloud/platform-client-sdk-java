# WorkitemOnCreateRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the rule. |  [optional] |
| **action** | [**WorkitemRuleAction**](WorkitemRuleAction) | The rules action. If the condition criteria is met this action will be executed. |  [optional] |
| **worktype** | [**WorktypeReference**](WorktypeReference) | The Worktype containing the rule. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ONCREATE | &quot;OnCreate&quot; | 
| ONATTRIBUTECHANGE | &quot;OnAttributeChange&quot; | 
| DATE | &quot;Date&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
