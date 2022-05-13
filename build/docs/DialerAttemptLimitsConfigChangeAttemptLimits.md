---
title: DialerAttemptLimitsConfigChangeAttemptLimits
---
## DialerAttemptLimitsConfigChangeAttemptLimits


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **maxAttemptsPerContact** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **maxAttemptsPerNumber** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **timeZoneId** | <!----><!---->**String**<!----> | The timezone is necessary to define when \"today\" starts and ends |  [optional] |
| **resetPeriod** | [**ResetPeriodEnum**](#ResetPeriodEnum)<!----> | After how long the number of attempts will be set back to 0 |  [optional] |
| **recallEntries** | <!----><!---->[**Map&lt;String, DialerAttemptLimitsConfigChangeRecallEntry&gt;**](DialerAttemptLimitsConfigChangeRecallEntry.html)<!----> | Configuration for recall attempts |  [optional] |
| **breadthFirstRecalls** | <!----><!---->**Boolean**<!----> | Whether recalls are performed before considering other numbers (true) or after (false) |  [optional] |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The UI-visible name of the object |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
{: class="table table-striped"}


<a name="ResetPeriodEnum"></a>

## Enum: ResetPeriodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEVER | &quot;NEVER&quot; | 
| TODAY | &quot;TODAY&quot; | 
{: class="table table-striped"}



