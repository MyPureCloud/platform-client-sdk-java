# ConversationChecklistTopicAgentChecklistItemState


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **stateFromModel** | [**StateFromModelEnum**](#Enum--StateFromModelEnum) |  |  [optional] |
| **stateFromAgent** | [**StateFromAgentEnum**](#Enum--StateFromAgentEnum) |  |  [optional] |
| **dateLastModifiedByModel** | [**Date**](Date) |  |  [optional] |
| **dateLastModifiedByAgent** | [**Date**](Date) |  |  [optional] |
| **automatedCheckEnabled** | **Boolean** |  |  [optional] |
| **important** | **Boolean** |  |  [optional] |
| **lastModifiedInAcw** | **Boolean** |  |  [optional] |


## Enum: StateFromModelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| TICKED | &quot;Ticked&quot; | 
| UNTICKED | &quot;Unticked&quot; | 


## Enum: StateFromAgentEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| TICKED | &quot;Ticked&quot; | 
| UNTICKED | &quot;Unticked&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
