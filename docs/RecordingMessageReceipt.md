# RecordingMessageReceipt


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The id of the message receipt. Message receipts will have the same ID as the message they reference. |  [optional] |
| **receiptTime** | [**Date**](Date) | Original time of the event (receipt). Example: delivery receipt time, read receipt time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The message receipt status |  [optional] |
| **reasons** | [**List&lt;RecordingMessageReceiptReason&gt;**](RecordingMessageReceiptReason) | List of reasons for a message receipt that indicates the message has failed. Only used with Failed status. |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SENT | &quot;Sent&quot; | 
| DELIVERED | &quot;Delivered&quot; | 
| READ | &quot;Read&quot; | 
| FAILED | &quot;Failed&quot; | 
| PUBLISHED | &quot;Published&quot; | 
| REMOVED | &quot;Removed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
