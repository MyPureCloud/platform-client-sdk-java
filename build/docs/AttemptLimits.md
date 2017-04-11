---
title: AttemptLimits
---
## AttemptLimits


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | [**Date**](Date.html) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **maxAttemptsPerContact** | **Integer** |  |  [optional] |
| **maxAttemptsPerNumber** | **Integer** |  |  [optional] |
| **timeZoneId** | **String** | The timezone is necessary to define when \&quot;today\&quot; starts and ends |  [optional] |
| **resetPeriod** | [**ResetPeriodEnum**](#ResetPeriodEnum) | After how long the number of attempts will be set back to 0 |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ResetPeriodEnum"></a>

## Enum: ResetPeriodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| NEVER | &quot;NEVER&quot; |
| TODAY | &quot;TODAY&quot; |
{: class="table table-striped"}


