# TrunkBaseMetrics


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **trunkBase** | [**AddressableEntityRef**](AddressableEntityRef) | TrunkBase resource identifier |  |
| **trunkType** | [**TrunkTypeEnum**](#Enum--TrunkTypeEnum) | The type of the TrunkBase |  [optional] |
| **inboundCallCount** | **Integer** | The number of inbound calls |  [optional] |
| **outboundCallCount** | **Integer** | The number of outbound calls |  [optional] |
| **eventTime** | [**Date**](Date) | The timestamp of the data publication. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **qosMismatchCount** | **Integer** | The number of QoS mismatch events |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: TrunkTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXTERNAL | &quot;EXTERNAL&quot; | 
| PHONE | &quot;PHONE&quot; | 
| EDGE | &quot;EDGE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:267.0.0_
