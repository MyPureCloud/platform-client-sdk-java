# CreateReprocessJobRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name given for the job. |  |
| **description** | **String** | The description of the job. |  [optional] |
| **dateStart** | [**Date**](Date) | The start date for the search criteria. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **dateEnd** | [**Date**](Date) | The end date for the search criteria. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **programs** | **List&lt;String&gt;** | A list of program IDs to filter conversations by. |  |
| **mediaTypes** | [**List<MediaTypesEnum>**](#Enum--MediaTypesEnum) | The types of conversations to reprocess. |  |
| **dialects** | **List&lt;String&gt;** | The dialects to filter by the conversations. |  [optional] |


## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALL | &quot;Call&quot; |
| CALLBACK | &quot;Callback&quot; |
| CHAT | &quot;Chat&quot; |
| EMAIL | &quot;Email&quot; |
| MESSAGE | &quot;Message&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:244.0.0_
