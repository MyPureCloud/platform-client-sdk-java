# UserBestPointsItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **granularityType** | [**GranularityTypeEnum**](#Enum--GranularityTypeEnum) | Best points aggregation interval granularity |  [optional] |
| **points** | **Integer** | Gamification points |  [optional] |
| **dateStartWorkday** | [**LocalDate**](LocalDate) | Start workday of the best points aggregation interval. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEndWorkday** | [**LocalDate**](LocalDate) | End workday of the best points aggregation interval. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **rank** | **Integer** | The rank of this user |  [optional] |


## Enum: GranularityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
| MONTHLY | &quot;Monthly&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
