---
title: WfmAgentAdherenceExplanationChangedAgentTopicAdherenceExplanationChangedNotification
---
## WfmAgentAdherenceExplanationChangedAgentTopicAdherenceExplanationChangedNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **agent** | <!----><!---->[**WfmAgentAdherenceExplanationChangedAgentTopicUserReference**](WfmAgentAdherenceExplanationChangedAgentTopicUserReference.html)<!----> |  |  [optional] |
| **managementUnit** | <!----><!---->[**WfmAgentAdherenceExplanationChangedAgentTopicManagementUnit**](WfmAgentAdherenceExplanationChangedAgentTopicManagementUnit.html)<!----> |  |  [optional] |
| **businessUnit** | <!----><!---->[**WfmAgentAdherenceExplanationChangedAgentTopicBusinessUnit**](WfmAgentAdherenceExplanationChangedAgentTopicBusinessUnit.html)<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **lengthMinutes** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **notes** | <!----><!---->**String**<!----> |  |  [optional] |
| **reviewedBy** | <!----><!---->[**WfmAgentAdherenceExplanationChangedAgentTopicUserReference**](WfmAgentAdherenceExplanationChangedAgentTopicUserReference.html)<!----> |  |  [optional] |
| **reviewedDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LATE | &quot;Late&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
{: class="table table-striped"}



