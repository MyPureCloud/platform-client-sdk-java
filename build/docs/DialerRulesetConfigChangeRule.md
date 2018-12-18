---
title: DialerRulesetConfigChangeRule
---
## DialerRulesetConfigChangeRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **order** | **Integer** |  |  [optional] |
| **category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional] |
| **actions** | [**List&lt;DialerRulesetConfigChangeAction&gt;**](DialerRulesetConfigChangeAction.html) |  |  [optional] |
| **conditions** | [**List&lt;DialerRulesetConfigChangeCondition&gt;**](DialerRulesetConfigChangeCondition.html) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DIALER_PRECALL | &quot;DIALER_PRECALL&quot; |
| DIALER_WRAPUP | &quot;DIALER_WRAPUP&quot; |
{: class="table table-striped"}



