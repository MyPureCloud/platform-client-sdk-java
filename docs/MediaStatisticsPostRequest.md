# MediaStatisticsPostRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **sourceType** | [**SourceTypeEnum**](#Enum--SourceTypeEnum) | Source type of media endpoint |  |
| **clientInfo** | [**MediaStatisticsClientInfo**](MediaStatisticsClientInfo) | Client information associated with media endpoint |  [optional] |
| **rtp** | [**MediaRtpStatistics**](MediaRtpStatistics) | Statistics of sent and received RTP. Reference: https://www.rfc-editor.org/rfc/rfc3550 |  |
| **reconnectAttempts** | **Integer** | Media reconnect attempt count |  [optional] |
| **dateCreated** | [**Date**](Date) | Media endpoint statistics creation time. Format: yyyy-MM-dd'T'HH:mm:ss.SSS'Z'. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |


## Enum: SourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CLIENT | &quot;Client&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
