# ReportingTurnBotFlowInvocationEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Represents the type of invocation event which occurred. |  [optional] |
| **action** | [**ReportingTurnAction**](ReportingTurnAction) | The action in which the event occurred. |  [optional] |
| **flow** | [**ReportingTurnFlow**](ReportingTurnFlow) | The details relating to the invoking or invoked flow. |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;Call&quot; | 
| RETURNTO | &quot;ReturnTo&quot; | 
| RETURNFROM | &quot;ReturnFrom&quot; | 
| INITIALINVOKE | &quot;InitialInvoke&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:256.0.0_
