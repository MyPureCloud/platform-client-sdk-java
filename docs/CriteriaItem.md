# CriteriaItem


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **key** | [**KeyEnum**](#Enum--KeyEnum) | The id of the criteria to be checked. |  [optional] |
| **operator** | [**OperatorEnum**](#Enum--OperatorEnum) | The operator used to check on the criteria id. |  [optional] |
| **value** | **String** | The target value used to query on. |  [optional] |


## Enum: KeyEnum

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


## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EQ | &quot;eq&quot; | 
| GT | &quot;gt&quot; | 
| GTE | &quot;gte&quot; | 
| LT | &quot;lt&quot; | 
| LTE | &quot;lte&quot; | 
| NOT | &quot;not&quot; | 
| BEGINS | &quot;begins&quot; | 
| NOT_NULL | &quot;not_null&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
