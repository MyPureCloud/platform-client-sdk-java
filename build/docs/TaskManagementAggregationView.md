---
title: TaskManagementAggregationView
---
## TaskManagementAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#TargetEnum)<!----> | Target metric name |  |
| **name** | <!----><!---->**String**<!----> | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#FunctionEnum)<!----> | Type of view you wish to create |  |
| **range** | <!----><!---->[**AggregationRange**](AggregationRange.html)<!----> | Range of numbers for slicing up data |  [optional] |
{: class="table table-striped"}


<a name="TargetEnum"></a>

## Enum: TargetEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NWORKITEMSACDCANCELLED | &quot;nWorkitemsAcdCancelled&quot; | 
| NWORKITEMSACDEXPIRED | &quot;nWorkitemsAcdExpired&quot; | 
| NWORKITEMSACDSTARTED | &quot;nWorkitemsAcdStarted&quot; | 
| NWORKITEMSAGENTTRANSFERRED | &quot;nWorkitemsAgentTransferred&quot; | 
| NWORKITEMSCREATED | &quot;nWorkitemsCreated&quot; | 
| NWORKITEMSDECLINED | &quot;nWorkitemsDeclined&quot; | 
| NWORKITEMSDELETED | &quot;nWorkitemsDeleted&quot; | 
| NWORKITEMSDISCONNECTED | &quot;nWorkitemsDisconnected&quot; | 
| NWORKITEMSOVERSLA | &quot;nWorkitemsOverSla&quot; | 
| NWORKITEMSPURGED | &quot;nWorkitemsPurged&quot; | 
| NWORKITEMSQUEUETRANSFERRED | &quot;nWorkitemsQueueTransferred&quot; | 
| NWORKITEMSSTATUSCHANGED | &quot;nWorkitemsStatusChanged&quot; | 
| NWORKITEMSTERMINATED | &quot;nWorkitemsTerminated&quot; | 
| NWORKITEMSTIMEDOUT | &quot;nWorkitemsTimedout&quot; | 
| NWORKITEMSTRANSFERRED | &quot;nWorkitemsTransferred&quot; | 
| NWORKITEMSWRAPUPADDED | &quot;nWorkitemsWrapupAdded&quot; | 
| NWORKITEMSWRAPUPREMOVED | &quot;nWorkitemsWrapupRemoved&quot; | 
| OWORKITEMSSERVICELEVEL | &quot;oWorkitemsServiceLevel&quot; | 
| TWORKITEMSALERT | &quot;tWorkitemsAlert&quot; | 
| TWORKITEMSANSWERED | &quot;tWorkitemsAnswered&quot; | 
| TWORKITEMSDIRECTANSWERED | &quot;tWorkitemsDirectAnswered&quot; | 
| TWORKITEMSFOCUS | &quot;tWorkitemsFocus&quot; | 
| TWORKITEMSFOCUSCOMPLETE | &quot;tWorkitemsFocusComplete&quot; | 
| TWORKITEMSHANDLED | &quot;tWorkitemsHandled&quot; | 
| TWORKITEMSHELD | &quot;tWorkitemsHeld&quot; | 
| TWORKITEMSHELDCOMPLETE | &quot;tWorkitemsHeldComplete&quot; | 
| TWORKITEMSNOTRESPONDING | &quot;tWorkitemsNotResponding&quot; | 
| TWORKITEMSPARKED | &quot;tWorkitemsParked&quot; | 
| TWORKITEMSQUEUEANSWERED | &quot;tWorkitemsQueueAnswered&quot; | 
| TWORKITEMSSTATUS | &quot;tWorkitemsStatus&quot; | 
{: class="table table-striped"}


<a name="FunctionEnum"></a>

## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 
{: class="table table-striped"}



