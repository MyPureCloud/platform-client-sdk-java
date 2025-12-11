# EnrichFieldRules


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **defaultAction** | [**DefaultActionEnum**](#Enum--DefaultActionEnum) | Default behavior for combining data from the submitted request with any entity found in the database. The default behavior if unspecified is `PreferProvided`, meaning any non-null fields in the submitted request will override data in the database, but all null fields will remain unchanged. Omitting a field in the request payload means that it will be treated as null. |  [optional] |
| **rules** | [**List&lt;EnrichFieldRule&gt;**](EnrichFieldRule) | Field-specific behaviors for how to combine data from different sources. For example, you can set a `defaultAction` of `PreferProvided`, but use different behaviors such as `AlwaysUseProvided` or `PreferExisting` for specific fields. |  [optional] |
| **defaultArrayAction** | [**DefaultArrayActionEnum**](#Enum--DefaultArrayActionEnum) | Default behavior for combining items in array field from the submitted request with any array entity found in the database. The default behavior if unspecified is `fill`, meaning the field value will always be the partial concatenation of both the array in the Database and the array in the contact body, up to the size limit of the array |  [optional] |


## Enum: DefaultActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALWAYSUSEPROVIDED | &quot;AlwaysUseProvided&quot; | 
| PREFEREXISTING | &quot;PreferExisting&quot; | 
| PREFERPROVIDED | &quot;PreferProvided&quot; | 


## Enum: DefaultArrayActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REPLACE | &quot;Replace&quot; | 
| EXTEND | &quot;Extend&quot; | 
| FILL | &quot;Fill&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
