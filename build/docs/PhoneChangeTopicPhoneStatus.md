---
title: PhoneChangeTopicPhoneStatus
---
## PhoneChangeTopicPhoneStatus


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **operationalStatus** | [**OperationalStatusEnum**](#OperationalStatusEnum)<!----> |  |  [optional] |
| **edge** | <!----><!---->[**PhoneChangeTopicEdgeReference**](PhoneChangeTopicEdgeReference.html)<!----> |  |  [optional] |
| **provision** | <!----><!---->[**PhoneChangeTopicProvisionInfo**](PhoneChangeTopicProvisionInfo.html)<!----> |  |  [optional] |
| **lineStatuses** | <!----><!---->[**List&lt;PhoneChangeTopicLineStatus&gt;**](PhoneChangeTopicLineStatus.html)<!----> |  |  [optional] |
| **eventCreationTime** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="OperationalStatusEnum"></a>

## Enum: OperationalStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OPERATIONAL | &quot;OPERATIONAL&quot; | 
| DEGRADED | &quot;DEGRADED&quot; | 
| OFFLINE | &quot;OFFLINE&quot; | 
{: class="table table-striped"}



