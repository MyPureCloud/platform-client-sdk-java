# AttemptLimits


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **maxAttemptsPerContact** | **Integer** | The maximum number of times a contact can be called within the resetPeriod. Required if maxAttemptsPerNumber is not defined. |  [optional] |
| **maxAttemptsPerNumber** | **Integer** | The maximum number of times a phone number can be called within the resetPeriod. Required if maxAttemptsPerContact is not defined. |  [optional] |
| **timeZoneId** | **String** | If the resetPeriod is TODAY, this specifies the timezone in which TODAY occurs. Required if the resetPeriod is TODAY. |  [optional] |
| **resetPeriod** | [**ResetPeriodEnum**](#Enum--ResetPeriodEnum) | After how long the number of attempts will be set back to 0. Defaults to NEVER. |  [optional] |
| **recallEntries** | [**Map&lt;String, RecallEntry&gt;**](RecallEntry) | Configuration for recall attempts. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ResetPeriodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEVER | &quot;NEVER&quot; | 
| TODAY | &quot;TODAY&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
