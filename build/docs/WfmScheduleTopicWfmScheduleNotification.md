---
title: WfmScheduleTopicWfmScheduleNotification
---
## WfmScheduleTopicWfmScheduleNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **operationId** | <!----><!---->**String**<!----> |  |  [optional] |
| **downloadUrl** | <!----><!---->**String**<!----> |  |  [optional] |
| **percentComplete** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **eventType** | [**EventTypeEnum**](#EventTypeEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PROCESSING | &quot;Processing&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}


<a name="EventTypeEnum"></a>

## Enum: EventTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPDATE | &quot;Update&quot; | 
| IMPORT | &quot;Import&quot; | 
| COPY | &quot;Copy&quot; | 
| GENERATE | &quot;Generate&quot; | 
| RESCHEDULE | &quot;Reschedule&quot; | 
{: class="table table-striped"}



