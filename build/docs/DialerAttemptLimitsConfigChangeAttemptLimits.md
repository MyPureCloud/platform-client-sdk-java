---
title: DialerAttemptLimitsConfigChangeAttemptLimits
---
## DialerAttemptLimitsConfigChangeAttemptLimits


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **version** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **maxAttemptsPerContact** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **maxAttemptsPerNumber** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **timeZoneId** | <!----><!---->**String**<!----> |  |  [optional] |
| **resetPeriod** | [**ResetPeriodEnum**](#ResetPeriodEnum)<!----> |  |  [optional] |
| **recallEntries** | <!----><!---->[**Map&lt;String, DialerAttemptLimitsConfigChangeRecallEntry&gt;**](DialerAttemptLimitsConfigChangeRecallEntry.html)<!----> |  |  [optional] |
| **breadthFirstRecalls** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **additionalProperties** | <!----><!---->**Object**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ResetPeriodEnum"></a>

## Enum: ResetPeriodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NEVER | &quot;NEVER&quot; |
| TODAY | &quot;TODAY&quot; |
{: class="table table-striped"}



