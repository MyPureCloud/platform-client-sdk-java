# CaseManagementAggregationView


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
| NCASESOPENED | &quot;nCasesOpened&quot; | 
| NCASESOVERSLA | &quot;nCasesOverSla&quot; | 
| NCASESPURGED | &quot;nCasesPurged&quot; | 
| NCASESSTATUSCHANGED | &quot;nCasesStatusChanged&quot; | 
| NCASESTERMINATED | &quot;nCasesTerminated&quot; | 
| OCASESSERVICELEVEL | &quot;oCasesServiceLevel&quot; | 
| TCASESRESOLVED | &quot;tCasesResolved&quot; | 
| TCASESSTATUS | &quot;tCasesStatus&quot; | 


## Enum: FunctionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RANGEBOUND | &quot;rangeBound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:250.0.0_
