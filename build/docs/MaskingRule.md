# MaskingRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | Masking rule name. |  |
| **description** | **String** | Description about masking rule. |  [optional] |
| **substituteCharacter** | **String** | Replacement character for masked text character. |  |
| **definition** | **String** | Definition of masking rule (a valid regex or builtin AI based mask name). |  |
| **enabled** | **Boolean** | True/False |  |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Masking rule type |  |
| **integrations** | **List&lt;String&gt;** | Associated integration channels |  [optional] |
| **dateCreated** | [**Date**](Date) | Date when the rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date when the rule was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CUSTOM | &quot;Custom&quot; | 
| PREDEFINED | &quot;Predefined&quot; | 
| DEFAULT | &quot;Default&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
