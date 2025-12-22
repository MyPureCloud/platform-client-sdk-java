# RecordingUploadReportRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateSince** | [**Date**](Date) | Report will include uploads since this date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **uploadStatus** | [**UploadStatusEnum**](#Enum--UploadStatusEnum) | Report will include uploads with this status |  [optional] |


## Enum: UploadStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 
| WAITFORCONVERSATION | &quot;WaitForConversation&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
