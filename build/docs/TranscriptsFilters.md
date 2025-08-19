# TranscriptsFilters


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type of the transcripts, default value is all  |  [optional] |
| **startTimeMs** | **Long** | start time to filter by, default value is 7 days into the past |  [optional] |
| **endTimeMs** | **Long** | end time to filter by, default value is current time |  [optional] |
| **queues** | **List&lt;String&gt;** | list of queues ids to filter by |  [optional] |
| **flows** | **List&lt;String&gt;** | list of flows ids to filter by |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;call&quot; | 
| MESSAGE | &quot;message&quot; | 
| EMAIL | &quot;email&quot; | 
| CHAT | &quot;chat&quot; | 
| CALLBACK | &quot;callback&quot; | 
| ALL | &quot;all&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
