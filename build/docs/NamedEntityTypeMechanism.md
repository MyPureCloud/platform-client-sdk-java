# NamedEntityTypeMechanism


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **items** | [**List&lt;NamedEntityTypeItem&gt;**](NamedEntityTypeItem) | The items that define the named entity type. |  |
| **restricted** | **Boolean** | Whether the named entity type is restricted to the items provided. Default: false |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the mechanism. |  |
| **subType** | [**SubTypeEnum**](#Enum--SubTypeEnum) | Subtype of detection mechanism |  [optional] |
| **maxLength** | **Integer** | The maximum length of the entity resolved value |  [optional] |
| **minLength** | **Integer** | The minimum length of the entity resolved value |  [optional] |
| **allowSpecialChars** | **Boolean** | Flag whether to allow for special characters during AI slot capture |  [optional] |
| **examples** | [**List&lt;NamedEntityTypeMechanismExample&gt;**](NamedEntityTypeMechanismExample) | Examples for entity detection |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AI | &quot;AI&quot; | 
| DYNAMICDATETIME | &quot;DynamicDateTime&quot; | 
| DYNAMICLIST | &quot;DynamicList&quot; | 
| LIST | &quot;List&quot; | 
| REGEX | &quot;Regex&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: SubTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALPHANUMERIC | &quot;Alphanumeric&quot; | 
| NUMBERSEQUENCE | &quot;NumberSequence&quot; | 
| FREEFORM | &quot;FreeForm&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
