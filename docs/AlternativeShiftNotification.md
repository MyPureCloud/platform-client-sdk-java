# AlternativeShiftNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **weekDate** | [**LocalDate**](LocalDate) | The start date of the schedule with which this trade is associated. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **granularity** | [**GranularityEnum**](#Enum--GranularityEnum) | The granularity of alternative shifts to be traded |  |
| **newState** | [**NewStateEnum**](#Enum--NewStateEnum) | The new state of the alternative shift trade, null if there was no change |  [optional] |
| **initiatingUser** | [**UserReference**](UserReference) | The user who initiated the alternative shift trade |  |
| **initiatingShiftDate** | [**Date**](Date) | The start date and time of the initiating shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **receivingUser** | [**UserReference**](UserReference) | The user on the receiving this alternative shift trade |  [optional] |
| **receivingShiftDate** | [**Date**](Date) | The start date and time of the receiving alternative shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 


## Enum: NewStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| SUBMITTED | &quot;Submitted&quot; | 
| APPROVED | &quot;Approved&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:211.0.0_
