# WfmAgentAdherenceExplanationChangedBusinessUnitTopicAdherenceExplanationChangedNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **agent** | [**WfmAgentAdherenceExplanationChangedBusinessUnitTopicUserReference**](WfmAgentAdherenceExplanationChangedBusinessUnitTopicUserReference) |  |  [optional] |
| **managementUnit** | [**WfmAgentAdherenceExplanationChangedBusinessUnitTopicManagementUnit**](WfmAgentAdherenceExplanationChangedBusinessUnitTopicManagementUnit) |  |  [optional] |
| **businessUnit** | [**WfmAgentAdherenceExplanationChangedBusinessUnitTopicBusinessUnit**](WfmAgentAdherenceExplanationChangedBusinessUnitTopicBusinessUnit) |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **startDate** | [**Date**](Date) |  |  [optional] |
| **lengthMinutes** | **Integer** |  |  [optional] |
| **notes** | **String** |  |  [optional] |
| **reviewedBy** | [**WfmAgentAdherenceExplanationChangedBusinessUnitTopicUserReference**](WfmAgentAdherenceExplanationChangedBusinessUnitTopicUserReference) |  |  [optional] |
| **reviewedDate** | [**Date**](Date) |  |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LATE | &quot;Late&quot; | 
{: class="table table-striped"}


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
