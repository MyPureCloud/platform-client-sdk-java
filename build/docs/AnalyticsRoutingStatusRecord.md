---
title: AnalyticsRoutingStatusRecord
---
## AnalyticsRoutingStatusRecord


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **startTime** | <!----><!---->[**Date**](Date.html)<!----> | The start time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **endTime** | <!----><!---->[**Date**](Date.html)<!----> | The end time of the record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **routingStatus** | [**RoutingStatusEnum**](#RoutingStatusEnum)<!----> | The user's ACD routing status |  [optional] |
{: class="table table-striped"}


<a name="RoutingStatusEnum"></a>

## Enum: RoutingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFF_QUEUE | &quot;OFF_QUEUE&quot; | 
| IDLE | &quot;IDLE&quot; | 
| INTERACTING | &quot;INTERACTING&quot; | 
| NOT_RESPONDING | &quot;NOT_RESPONDING&quot; | 
| COMMUNICATING | &quot;COMMUNICATING&quot; | 
{: class="table table-striped"}



