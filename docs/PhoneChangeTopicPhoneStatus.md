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
{: class="table table-striped"}


## Enum: OperationalStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPERATIONAL | &quot;OPERATIONAL&quot; | 
| DEGRADED | &quot;DEGRADED&quot; | 
| OFFLINE | &quot;OFFLINE&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
