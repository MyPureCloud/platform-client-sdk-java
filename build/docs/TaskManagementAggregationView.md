# TaskManagementAggregationView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **target** | [**TargetEnum**](#Enum--TargetEnum) | Target metric name |  |
| **name** | **String** | A unique name for this view. Must be distinct from other views and built-in metric names. |  |
| **function** | [**FunctionEnum**](#Enum--FunctionEnum) | Type of view you wish to create |  |
| **range** | [**AggregationRange**](AggregationRange) | Range of numbers for slicing up data |  [optional] |


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
| NWORKITEMSOFFERED | &quot;nWorkitemsOffered&quot; | 
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
| TWORKITEMSAGENTFOCUSCOMPLETE | &quot;tWorkitemsAgentFocusComplete&quot; | 
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


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
