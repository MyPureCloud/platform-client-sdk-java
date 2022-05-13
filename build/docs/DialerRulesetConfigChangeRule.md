---
title: DialerRulesetConfigChangeRule
---
## DialerRulesetConfigChangeRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **conditions** | <!----><!---->[**List&lt;DialerRulesetConfigChangeCondition&gt;**](DialerRulesetConfigChangeCondition.html)<!----> | The list of rule conditions; all must evaluate to true to trigger the rule actions |  [optional] |
| **id** | <!----><!---->**String**<!----> | The identifier of the rule |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the rule |  [optional] |
| **order** | <!----><!---->**Integer**<!----> | The ranked order of the rule; rules are processed from lowest number to highest |  [optional] |
| **category** | [**CategoryEnum**](#CategoryEnum)<!----> | The category of the rule |  [optional] |
| **actions** | <!----><!---->[**List&lt;DialerRulesetConfigChangeAction&gt;**](DialerRulesetConfigChangeAction.html)<!----> | The list of rule actions to be taken if the conditions are true |  [optional] |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DIALER_PRECALL | &quot;DIALER_PRECALL&quot; | 
| DIALER_WRAPUP | &quot;DIALER_WRAPUP&quot; | 
{: class="table table-striped"}



