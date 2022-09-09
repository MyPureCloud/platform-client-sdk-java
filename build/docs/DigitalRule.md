---
title: DigitalRule
---
## DigitalRule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The identifier of the rule. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the rule. |  |
| **order** | <!----><!---->**Integer**<!----> | The ranked order of the rule. Rules are processed from lowest number to highest. |  |
| **category** | [**CategoryEnum**](#CategoryEnum)<!----> | The category of the rule. |  |
| **conditions** | <!----><!---->[**List&lt;DigitalCondition&gt;**](DigitalCondition.html)<!----> | A list of conditions to evaluate. All of the Conditions must evaluate to true to trigger the actions. |  |
| **actions** | <!----><!---->[**List&lt;DigitalAction&gt;**](DigitalAction.html)<!----> | The list of actions to be taken if all conditions are true. |  |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PRECONTACT | &quot;PreContact&quot; | 
| POSTCONTACT | &quot;PostContact&quot; | 
{: class="table table-striped"}



