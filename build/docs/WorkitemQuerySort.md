# WorkitemQuerySort


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | [**NameEnum**](#Enum--NameEnum) | Specify an attribute for sorting. It's possible to use an attribute both for sorting and in the query at the same time, but these restrictions apply: Only the operators EQ, LT, LTE, GT, GTE, BETWEEN and BEGINS_WITH are supported and the attribute can't be present in more than one filter. |  [optional] |
| **ascending** | **Boolean** | Sort Ascending |  [optional] |


## Enum: NameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DATEDUE | &quot;dateDue&quot; | 
| PRIORITY | &quot;priority&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
