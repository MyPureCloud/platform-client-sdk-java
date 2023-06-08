---
title: QueryCriteria
---
## QueryCriteria


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **criteriaKey** | [**CriteriaKeyEnum**](#CriteriaKeyEnum)<!----> | The is the name of the criteria that can be queried. |  [optional] |
| **criteriaGroups** | <!---->[**List&lt;CriteriaGroupsEnum&gt;**](#CriteriaGroupsEnum)<!----> | The executionData type that this criteria item can be used on. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The is the description of the criteria. |  [optional] |
| **operators** | <!----><!---->**List&lt;String&gt;**<!----> | A list of operators that can be used on this criteria. |  [optional] |
| **dataType** | [**DataTypeEnum**](#DataTypeEnum)<!----> | The type of data for the criteria (string, int, etc). |  [optional] |
| **categoryInfo** | <!----><!---->[**CriteriaCategoryInfo**](CriteriaCategoryInfo.html)<!----> | A logical grouping and display order for this item. |  [optional] |
{: class="table table-striped"}


<a name="CriteriaKeyEnum"></a>

## Enum: CriteriaKeyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| FLOWSTARTDATETIME | &quot;FlowStartDateTime&quot; | 
| FLOWENDDATETIME | &quot;FlowEndDateTime&quot; | 
| CONVERSATIONID | &quot;ConversationId&quot; | 
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
{: class="table table-striped"}


<a name="CriteriaGroupsEnum"></a>

## Enum: CriteriaGroupsEnum

| Name | Value |
| ---- | ----- |
| FLOW | &quot;flow&quot; |
| BOT | &quot;bot&quot; |
{: class="table table-striped"}


<a name="DataTypeEnum"></a>

## Enum: DataTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STRING | &quot;string&quot; | 
| GUID | &quot;guid&quot; | 
| DATETIME | &quot;dateTime&quot; | 
{: class="table table-striped"}



