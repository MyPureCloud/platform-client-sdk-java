# MediaStatisticsPostRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sourceType** | [**SourceTypeEnum**](#Enum--SourceTypeEnum) | Source type of media endpoint |  |
| **clientInfo** | [**MediaStatisticsClientInfo**](MediaStatisticsClientInfo) | Client information associated with media endpoint |  [optional] |
| **rtp** | [**MediaRtpStatistics**](MediaRtpStatistics) | Statistics of sent and received RTP. Reference: https://www.rfc-editor.org/rfc/rfc3550 |  |
| **reconnectAttempts** | **Integer** | Media reconnect attempt count |  [optional] |


## Enum: SourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLIENT | &quot;Client&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
