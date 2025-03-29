# JourneyViewSchedule


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **frequency** | [**FrequencyEnum**](#Enum--FrequencyEnum) | Frequency of execution |  |
| **dateModified** | [**Date**](Date) | Timestamp of last update. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **user** | [**AddressableEntityRef**](AddressableEntityRef) | Last modified user |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: FrequencyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
| MONTHLY | &quot;Monthly&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.1.0_
