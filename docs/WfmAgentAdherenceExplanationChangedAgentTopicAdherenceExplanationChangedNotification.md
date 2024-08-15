# WfmAgentAdherenceExplanationChangedAgentTopicAdherenceExplanationChangedNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **agent** | [**WfmAgentAdherenceExplanationChangedAgentTopicUserReference**](WfmAgentAdherenceExplanationChangedAgentTopicUserReference) |  |  [optional] |
| **managementUnit** | [**WfmAgentAdherenceExplanationChangedAgentTopicManagementUnit**](WfmAgentAdherenceExplanationChangedAgentTopicManagementUnit) |  |  [optional] |
| **businessUnit** | [**WfmAgentAdherenceExplanationChangedAgentTopicBusinessUnit**](WfmAgentAdherenceExplanationChangedAgentTopicBusinessUnit) |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) |  |  [optional] |
| **startDate** | [**Date**](Date) |  |  [optional] |
| **lengthMinutes** | **Integer** |  |  [optional] |
| **notes** | **String** |  |  [optional] |
| **reviewedBy** | [**WfmAgentAdherenceExplanationChangedAgentTopicUserReference**](WfmAgentAdherenceExplanationChangedAgentTopicUserReference) |  |  [optional] |
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



