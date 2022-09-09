---
title: LastAttemptOverallConditionSettings
---
## LastAttemptOverallConditionSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaTypes** | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!----> | A list of media types to evaluate. |  |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | The operator to use when comparing values. |  |
| **value** | <!----><!---->**String**<!----> | The period value to compare against the contact's data. |  |
{: class="table table-striped"}


<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| VOICE | &quot;Voice&quot; |
| EMAIL | &quot;Email&quot; |
| SMS | &quot;Sms&quot; |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BEFORE | &quot;Before&quot; | 
| AFTER | &quot;After&quot; | 
{: class="table table-striped"}



