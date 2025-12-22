# ChecklistItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | ID of the checklist item. |  |
| **name** | **String** | Name of the checklist item. |  |
| **description** | **String** | Description of the checklist item. |  [optional] |
| **automatedCheckEnabled** | **Boolean** | Flag to indicate whether automated check is enabled for this checklist item. |  [optional] |
| **important** | **Boolean** | Flag to indicate whether this checklist item is marked as important. |  [optional] |
| **stateFromModel** | [**StateFromModelEnum**](#Enum--StateFromModelEnum) | Checklist state as evaluated by the model. |  [optional] |
| **stateFromAgent** | [**StateFromAgentEnum**](#Enum--StateFromAgentEnum) | Checklist state as evaluated by the agent. |  [optional] |
| **dateLastModifiedByModel** | [**Date**](Date) | Date when the checklist item was last modified by the model. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateLastModifiedByAgent** | [**Date**](Date) | Date when the checklist item was last modified by the agent. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lastModifiedInAcw** | **Boolean** | Flag to indicate whether this checklist item was modified in ACW. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateFromModelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TICKED | &quot;Ticked&quot; | 
| UNTICKED | &quot;Unticked&quot; | 


## Enum: StateFromAgentEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TICKED | &quot;Ticked&quot; | 
| UNTICKED | &quot;Unticked&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
