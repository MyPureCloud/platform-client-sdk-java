---
title: AlertRequest
---
## AlertRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The action being taken on the alert. |  |
| **dateStart** | <!----><!---->[**Date**](Date.html)<!----> | The start date of the mute/snooze period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnd** | <!----><!---->[**Date**](Date.html)<!----> | The end date of the mute/snooze period. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **unread** | <!----><!---->[**UnreadFields**](UnreadFields.html)<!----> | The fields need for an unread update requests |  [optional] |
| **validRequest** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MUTE | &quot;Mute&quot; | 
| SNOOZE | &quot;Snooze&quot; | 
| UNREAD | &quot;Unread&quot; | 
{: class="table table-striped"}



