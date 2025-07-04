# DialerAttemptLimitsConfigChangeAttemptLimits


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **maxAttemptsPerContact** | **Long** |  |  [optional] |
| **maxAttemptsPerNumber** | **Long** |  |  [optional] |
| **timeZoneId** | **String** | The timezone is necessary to define when \"today\" starts and ends |  [optional] |
| **resetPeriod** | [**ResetPeriodEnum**](#Enum--ResetPeriodEnum) | After how long the number of attempts will be set back to 0 |  [optional] |
| **recallEntries** | [**Map&lt;String, DialerAttemptLimitsConfigChangeRecallEntry&gt;**](DialerAttemptLimitsConfigChangeRecallEntry) | Configuration for recall attempts |  [optional] |
| **breadthFirstRecalls** | **Boolean** | Whether recalls are performed before considering other numbers (true) or after (false) |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Long** | Required for updates, must match the version number of the most recent update |  [optional] |


## Enum: ResetPeriodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEVER | &quot;NEVER&quot; | 
| TODAY | &quot;TODAY&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
