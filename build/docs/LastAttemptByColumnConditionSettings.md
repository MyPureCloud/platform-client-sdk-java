---
title: LastAttemptByColumnConditionSettings
---
## LastAttemptByColumnConditionSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **emailColumnName** | <!----><!---->**String**<!----> | The name of the contact column to evaluate for Email. |  [optional] |
| **smsColumnName** | <!----><!---->**String**<!----> | The name of the contact column to evaluate for SMS. |  [optional] |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The operator to use when comparing values. |  |
| **value** | <!----><!---->**String**<!----> | The period value to compare against the contact's data. |  |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BEFORE | &quot;Before&quot; | 
| AFTER | &quot;After&quot; | 
{: class="table table-striped"}



