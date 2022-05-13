---
title: WfmUserNotificationTopicAdherenceExplanationNotification
---
## WfmUserNotificationTopicAdherenceExplanationNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **agent** | <!----><!---->[**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference.html)<!----> |  |  [optional] |
| **managementUnit** | <!----><!---->[**WfmUserNotificationTopicManagementUnit**](WfmUserNotificationTopicManagementUnit.html)<!----> |  |  [optional] |
| **businessUnit** | <!----><!---->[**WfmUserNotificationTopicBusinessUnit**](WfmUserNotificationTopicBusinessUnit.html)<!----> |  |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **lengthMinutes** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> |  |  [optional] |
| **notes** | <!----><!---->**String**<!----> |  |  [optional] |
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


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LATE | &quot;Late&quot; | 
{: class="table table-striped"}



