# FlowPaths


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **category** | [**CategoryEnum**](#Enum--CategoryEnum) | Category (use case) of the paths within a given domain. |  |
| **dateStart** | [**Date**](Date) | Start date of the date range included in the flow paths data. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateEnd** | [**Date**](Date) | End date of the date range included in the flow paths data. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **elements** | [**Map&lt;String, FlowPathsElement&gt;**](FlowPathsElement) | Unique element identifiers and their corresponding elements in the trie data structure representing the paths. |  |


## Enum: CategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL | &quot;All&quot; | 
| ABANDONED | &quot;Abandoned&quot; | 
| AGENTESCALATION | &quot;AgentEscalation&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| DISCONNECT | &quot;Disconnect&quot; | 
| ERROR | &quot;Error&quot; | 
| RECOGNITIONFAILURE | &quot;RecognitionFailure&quot; | 
| TRANSFER | &quot;Transfer&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
