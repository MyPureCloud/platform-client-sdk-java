# WorkPlanConstraintConflictMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Type of constraint conflict that can be resolved by clients in order to generate agent schedules |  [optional] |
| **arguments** | [**List&lt;WorkPlanValidationMessageArgument&gt;**](WorkPlanValidationMessageArgument) | The arguments to the type of the message that can help clients resolve validation issues |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWNFIX | &quot;UnknownFix&quot; | 
| WITHPOTENTIALFIXES | &quot;WithPotentialFixes&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:222.0.0_
