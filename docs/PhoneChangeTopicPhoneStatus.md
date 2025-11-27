# PhoneChangeTopicPhoneStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **operationalStatus** | [**OperationalStatusEnum**](#Enum--OperationalStatusEnum) |  |  [optional] |
| **edge** | [**PhoneChangeTopicEdgeReference**](PhoneChangeTopicEdgeReference) |  |  [optional] |
| **provision** | [**PhoneChangeTopicProvisionInfo**](PhoneChangeTopicProvisionInfo) |  |  [optional] |
| **lineStatuses** | [**List&lt;PhoneChangeTopicLineStatus&gt;**](PhoneChangeTopicLineStatus) |  |  [optional] |
| **eventCreationTime** | [**Date**](Date) |  |  [optional] |


## Enum: OperationalStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPERATIONAL | &quot;OPERATIONAL&quot; | 
| DEGRADED | &quot;DEGRADED&quot; | 
| OFFLINE | &quot;OFFLINE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
