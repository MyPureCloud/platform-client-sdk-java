---
title: ScreenRecordingSessionRequest
---
## ScreenRecordingSessionRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**StateEnum**](#StateEnum)<!----> | The screen recording session's state.  Values can be: 'stopped' |  [optional] |
| **archiveDate** | <!----><!---->[**Date**](Date.html)<!----> | The screen recording session's archive date. Must be greater than 1 day from now if set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **deleteDate** | <!----><!---->[**Date**](Date.html)<!----> | The screen recording session's delete date. Must be greater than archiveDate if set, otherwise one day from now. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STOPPED | &quot;STOPPED&quot; | 
{: class="table table-striped"}



