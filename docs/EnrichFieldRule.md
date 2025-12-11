# EnrichFieldRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **field** | **String** | A restricted JSONPath naming the specific field this combining behavior should apply to. Only dot notation with alphanumeric characters and underscores (e.g., $.address.address1, $.externalOrganization, $.tickers) are allowed. Bracket notation, array indexing, wildcards, sublists, and filter expressions are not permitted. |  [optional] |
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




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
