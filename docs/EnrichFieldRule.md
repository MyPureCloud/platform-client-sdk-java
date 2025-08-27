# EnrichFieldRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **field** | **String** | A restricted JSONPath naming the specific field this combining behavior should apply to. You may use dot-notation for named fields, and array indexing for lists, but nothing more sophisticated (e.g. wildcards, sublists, filter expressions, etc). For example, to target the `firstName` field of a Contact, this should be \"$.firstName\". |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | The behavior for how to combine data from the request body and the database. |  [optional] |
| **arrayAction** | [**ArrayActionEnum**](#Enum--ArrayActionEnum) | The behavior for how to combine items in array field from the request body and the database. |  [optional] |


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALWAYSUSEPROVIDED | &quot;AlwaysUseProvided&quot; | 
| PREFEREXISTING | &quot;PreferExisting&quot; | 
| PREFERPROVIDED | &quot;PreferProvided&quot; | 


## Enum: ArrayActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REPLACE | &quot;Replace&quot; | 
| EXTEND | &quot;Extend&quot; | 
| FILL | &quot;Fill&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
