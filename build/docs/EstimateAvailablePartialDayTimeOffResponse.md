# EstimateAvailablePartialDayTimeOffResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**Date**](Date) | Start date-time in ISO-8601 format for partial day request |  |
| **durationMinutes** | **Integer** | An estimation of time off request length in minutes |  |
| **payableMinutes** | **Integer** | An estimation of payable part of time off request in minutes |  |
| **flexible** | **Boolean** | Whether there is flexibility for a user to choose different hours than the system estimated |  |
| **overrideDateType** | [**OverrideDateTypeEnum**](#Enum--OverrideDateTypeEnum) | The override date type, if the partial day request overlaps with an override date |  [optional] |


## Enum: OverrideDateTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BLOCKED | &quot;Blocked&quot; | 
| MANUALREVIEW | &quot;ManualReview&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.1.0_
