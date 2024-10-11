# DigitalRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The identifier of the rule. |  [optional] |
| **name** | **String** | The name of the rule. |  |
| **order** | **Integer** | The ranked order of the rule. Rules are processed from lowest number to highest. |  |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) | The category of the rule. |  |
| **conditions** | [**List&lt;DigitalCondition&gt;**](DigitalCondition) | A list of conditions to evaluate. All of the Conditions must evaluate to true to trigger the actions. |  |
| **actions** | [**List&lt;DigitalAction&gt;**](DigitalAction) | The list of actions to be taken if all conditions are true. |  |


## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PRECONTACT | &quot;PreContact&quot; | 
| POSTCONTACT | &quot;PostContact&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
