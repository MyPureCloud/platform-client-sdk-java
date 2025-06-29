# MediaEndpointStatistics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **trunk** | [**MediaStatisticsTrunkInfo**](MediaStatisticsTrunkInfo) | Trunk information utilized when creating the media endpoint |  [optional] |
| **station** | [**NamedEntity**](NamedEntity) | Station information associated with media endpoint |  [optional] |
| **user** | [**NamedEntity**](NamedEntity) | User information associated media endpoint |  [optional] |
| **ice** | [**MediaIceStatistics**](MediaIceStatistics) | The ICE protocol statistics and details. Reference: https://www.rfc-editor.org/rfc/rfc5245 |  [optional] |
| **rtp** | [**MediaRtpStatistics**](MediaRtpStatistics) | Statistics of sent and received RTP. Reference: https://www.rfc-editor.org/rfc/rfc3550 |  [optional] |
| **reconnectAttempts** | **Integer** | Media reconnect attempt count |  [optional] |
| **sourceType** | [**SourceTypeEnum**](#Enum--SourceTypeEnum) | Source type of media endpoint |  [optional] |
| **clientInfo** | [**MediaStatisticsClientInfo**](MediaStatisticsClientInfo) | Client information associated with media endpoint |  [optional] |


## Enum: SourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLIENT | &quot;Client&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
