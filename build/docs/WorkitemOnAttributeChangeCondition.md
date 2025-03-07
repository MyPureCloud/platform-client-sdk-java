# WorkitemOnAttributeChangeCondition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **attribute** | [**AttributeEnum**](#Enum--AttributeEnum) | The name of the workitem attribute whose change will be evaluated as part of the rule. |  |
| **newValue** | **String** | The new value of the attribute. If the attribute is updated to this value this part of the condition will be met. |  |
| **oldValue** | **String** | The old value of the attribute. If the attribute was updated from this value this part of the condition will be met. |  [optional] |


## Enum: AttributeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STATUSID | &quot;statusId&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
