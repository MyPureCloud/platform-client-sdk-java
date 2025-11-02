# AdditionalMatchCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **topics** | [**List&lt;TopicCriteria&gt;**](TopicCriteria) | List of topics with specific data ingestion rules to filter messages for escalation. |  [optional] |
| **mediaFilter** | [**MediaFilterEnum**](#Enum--MediaFilterEnum) | Escalate message based on media presence. Not setting any value will escalate all types of msg. |  [optional] |


## Enum: MediaFilterEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WITHMEDIA | &quot;WithMedia&quot; | 
| WITHOUTMEDIA | &quot;WithoutMedia&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
