# Alteration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Range type (Exclusion: used to exclude a specific time within the recurrence. Inclusion: used to include a specific time within the recurrence which will execute in addition to the normal recurrence. If both an exclusion and inclusion are specified, the inclusion will take precedence over the exclusion.) |  [optional] |
| **start** | **String** | The start date of an alteration range as an ISO-8601 string |  [optional] |
| **end** | **String** | The end date of an alteration range as an ISO-8601 string |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXCLUSION | &quot;Exclusion&quot; | 
| INCLUSION | &quot;Inclusion&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
