# DialerRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The identifier of the rule. |  [optional] |
| **name** | **String** | The name of the rule. |  |
| **order** | **Integer** | The ranked order of the rule. Rules are processed from lowest number to highest. |  [optional] |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) | The category of the rule. |  |
| **conditions** | [**List&lt;Condition&gt;**](Condition) | A list of Conditions. All of the Conditions must evaluate to true to trigger the actions. |  |
| **actions** | [**List&lt;DialerAction&gt;**](DialerAction) | The list of actions to be taken if the conditions are true. |  [optional] |


## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIALER_PRECALL | &quot;DIALER_PRECALL&quot; | 
| DIALER_WRAPUP | &quot;DIALER_WRAPUP&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
