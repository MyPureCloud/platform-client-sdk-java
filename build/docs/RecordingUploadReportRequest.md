---
title: RecordingUploadReportRequest
---
## RecordingUploadReportRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateSince** | <!----><!---->[**Date**](Date.html)<!----> | Report will include uploads since this date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **uploadStatus** | [**UploadStatusEnum**](#UploadStatusEnum)<!----> | Report will include uploads with this status |  [optional] |
{: class="table table-striped"}


<a name="UploadStatusEnum"></a>

## Enum: UploadStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 
| WAITFORCONVERSATION | &quot;WaitForConversation&quot; | 
{: class="table table-striped"}



