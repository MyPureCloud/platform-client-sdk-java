---
title: WfmUserNotificationTopicAlternativeShiftNotification
---
## WfmUserNotificationTopicAlternativeShiftNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **weekDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> |  |  [optional] |
| **newState** | [**NewStateEnum**](#NewStateEnum)<!----> |  |  [optional] |
| **initiatingUser** | <!----><!---->[**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference.html)<!----> |  |  [optional] |
| **initiatingShiftDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
| **receivingUser** | <!----><!---->[**WfmUserNotificationTopicUserReference**](WfmUserNotificationTopicUserReference.html)<!----> |  |  [optional] |
| **receivingShiftDate** | <!----><!---->[**Date**](Date.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="GranularityEnum"></a>

## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
{: class="table table-striped"}


<a name="NewStateEnum"></a>

## Enum: NewStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUBMITTED | &quot;Submitted&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
| CANCELED | &quot;Canceled&quot; | 
{: class="table table-striped"}



