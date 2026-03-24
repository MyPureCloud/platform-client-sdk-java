# Variable


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the variable. |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The data type of the variable. |  |
| **scope** | [**ScopeEnum**](#Enum--ScopeEnum) | The scope that determines the variable's usage context within Guides runtime. |  |
| **description** | **String** | The description of the variable used by Guides runtime for input/output handling. |  [optional] |
| **validation** | [**VariableValidation**](VariableValidation) | The validation configuration for the variable. Optional - if not present, no validation is applied. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;String&quot; | 
| INTEGER | &quot;Integer&quot; | 
| NUMBER | &quot;Number&quot; | 
| BOOLEAN | &quot;Boolean&quot; | 
| DATE | &quot;Date&quot; | 


## Enum: ScopeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INPUT | &quot;Input&quot; | 
| OUTPUT | &quot;Output&quot; | 
| INPUTANDOUTPUT | &quot;InputAndOutput&quot; | 
| GUIDEONLY | &quot;GuideOnly&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:250.0.0_
