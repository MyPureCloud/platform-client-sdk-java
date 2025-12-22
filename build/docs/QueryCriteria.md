# QueryCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **criteriaKey** | [**CriteriaKeyEnum**](#Enum--CriteriaKeyEnum) | The is the name of the criteria that can be queried. |  [optional] |
| **criteriaGroups** | [**List<CriteriaGroupsEnum>**](#Enum--CriteriaGroupsEnum) | The executionData type that this criteria item can be used on. |  [optional] |
| **description** | **String** | The is the description of the criteria. |  [optional] |
| **operators** | **List&lt;String&gt;** | A list of operators that can be used on this criteria. |  [optional] |
| **dataType** | [**DataTypeEnum**](#Enum--DataTypeEnum) | The type of data for the criteria (string, int, etc). |  [optional] |
| **categoryInfo** | [**CriteriaCategoryInfo**](CriteriaCategoryInfo) | A logical grouping and display order for this item. |  [optional] |


## Enum: CriteriaKeyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FLOWSTARTDATETIME | &quot;FlowStartDateTime&quot; | 
| FLOWENDDATETIME | &quot;FlowEndDateTime&quot; | 
| CONVERSATIONID | &quot;ConversationId&quot; | 
| WORKITEMID | &quot;WorkitemId&quot; | 
| FLOWTYPE | &quot;FlowType&quot; | 
| FLOWID | &quot;FlowId&quot; | 
| FLOWERRORREASON | &quot;FlowErrorReason&quot; | 
| FLOWWARNINGREASON | &quot;FlowWarningReason&quot; | 
| FLOWALTERNATEEXECUTIONID | &quot;FlowAlternateExecutionId&quot; | 
| FLOWOBJECTEXECUTIONID | &quot;FlowObjectExecutionId&quot; | 
| FLOWACTIONID | &quot;FlowActionId&quot; | 
| FLOWACTIONTYPE | &quot;FlowActionType&quot; | 
| FLOWACTIONOUTPUTPATHID | &quot;FlowActionOutputPathId&quot; | 
| FLOWACTIONOUTPUTPATHNAME | &quot;FlowActionOutputPathName&quot; | 
| FLOWACTIONIDOUTPUTPATHID | &quot;FlowActionIdOutputPathId&quot; | 
| FLOWACTIONIDOUTPUTPATHNAME | &quot;FlowActionIdOutputPathName&quot; | 
| FLOWACTIONTYPEOUTPUTPATHID | &quot;FlowActionTypeOutputPathId&quot; | 
| FLOWACTIONTYPEOUTPUTPATHNAME | &quot;FlowActionTypeOutputPathName&quot; | 
| BOTID | &quot;BotId&quot; | 
| BOTERRORREASON | &quot;BotErrorReason&quot; | 
| BOTFLOWEXECUTIONID | &quot;BotFlowExecutionId&quot; | 
| BOTOBJECTEXECUTIONID | &quot;BotObjectExecutionId&quot; | 


## Enum: CriteriaGroupsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| FLOW | &quot;flow&quot; |
| BOT | &quot;bot&quot; |


## Enum: DataTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;string&quot; | 
| GUID | &quot;guid&quot; | 
| DATETIME | &quot;dateTime&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
