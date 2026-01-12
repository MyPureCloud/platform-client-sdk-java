# PersistentConnectionChangeTopicPersistentConnectionChangeEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **errorInfo** | [**PersistentConnectionChangeTopicErrorInfo**](PersistentConnectionChangeTopicErrorInfo) |  |  [optional] |
| **stationId** | **String** |  |  [optional] |
| **userId** | **String** |  |  [optional] |
| **persistentState** | [**PersistentStateEnum**](#Enum--PersistentStateEnum) |  |  [optional] |
| **eventTime** | [**Date**](Date) |  |  [optional] |


## Enum: PersistentStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;UNKNOWN&quot; | 
| PERSISTED | &quot;PERSISTED&quot; | 
| ACTIVE_CALL | &quot;ACTIVE_CALL&quot; | 
| DISCONNECTED | &quot;DISCONNECTED&quot; | 
| FAILED | &quot;FAILED&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
