---
title: RuleSetNotificationRules
---
## RuleSetNotificationRules


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **order** | **Integer** |  |  [optional] |
| **category** | [**CategoryEnum**](#CategoryEnum) |  |  [optional] |
| **conditions** | [**List&lt;RuleSetNotificationConditions&gt;**](RuleSetNotificationConditions.html) |  |  [optional] |
| **actions** | [**List&lt;RuleSetNotificationActions&gt;**](RuleSetNotificationActions.html) |  |  [optional] |
| **additionalProperties** | **Object** |  |  [optional] |
{: class="table table-striped"}


<a name="CategoryEnum"></a>

## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| PRECALL | &quot;DIALER_PRECALL&quot; |
| WRAPUP | &quot;DIALER_WRAPUP&quot; |
{: class="table table-striped"}


