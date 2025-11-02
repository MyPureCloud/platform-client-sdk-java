# DialerRulesetConfigChangeRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conditions** | [**List&lt;DialerRulesetConfigChangeCondition&gt;**](DialerRulesetConfigChangeCondition) | The list of rule conditions; all must evaluate to true to trigger the rule actions |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **id** | **String** | The identifier of the rule |  [optional] |
| **name** | **String** | The name of the rule |  [optional] |
| **order** | **Long** | The ranked order of the rule; rules are processed from lowest number to highest |  [optional] |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) | The category of the rule |  [optional] |
| **actions** | [**List&lt;DialerRulesetConfigChangeAction&gt;**](DialerRulesetConfigChangeAction) | The list of rule actions to be taken if the conditions are true |  [optional] |
| **getAdditionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIALER_PRECALL | &quot;DIALER_PRECALL&quot; | 
| DIALER_WRAPUP | &quot;DIALER_WRAPUP&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
