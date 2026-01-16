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
| DAYS_2 | &quot;DAYS_2&quot; | 
| DAYS_3 | &quot;DAYS_3&quot; | 
| DAYS_4 | &quot;DAYS_4&quot; | 
| DAYS_5 | &quot;DAYS_5&quot; | 
| DAYS_6 | &quot;DAYS_6&quot; | 
| DAYS_7 | &quot;DAYS_7&quot; | 
| DAYS_8 | &quot;DAYS_8&quot; | 
| DAYS_9 | &quot;DAYS_9&quot; | 
| DAYS_10 | &quot;DAYS_10&quot; | 
| DAYS_11 | &quot;DAYS_11&quot; | 
| DAYS_12 | &quot;DAYS_12&quot; | 
| DAYS_13 | &quot;DAYS_13&quot; | 
| DAYS_14 | &quot;DAYS_14&quot; | 
| DAYS_15 | &quot;DAYS_15&quot; | 
| DAYS_16 | &quot;DAYS_16&quot; | 
| DAYS_17 | &quot;DAYS_17&quot; | 
| DAYS_18 | &quot;DAYS_18&quot; | 
| DAYS_19 | &quot;DAYS_19&quot; | 
| DAYS_20 | &quot;DAYS_20&quot; | 
| DAYS_21 | &quot;DAYS_21&quot; | 
| DAYS_22 | &quot;DAYS_22&quot; | 
| DAYS_23 | &quot;DAYS_23&quot; | 
| DAYS_24 | &quot;DAYS_24&quot; | 
| DAYS_25 | &quot;DAYS_25&quot; | 
| DAYS_26 | &quot;DAYS_26&quot; | 
| DAYS_27 | &quot;DAYS_27&quot; | 
| DAYS_28 | &quot;DAYS_28&quot; | 
| DAYS_29 | &quot;DAYS_29&quot; | 
| DAYS_30 | &quot;DAYS_30&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
