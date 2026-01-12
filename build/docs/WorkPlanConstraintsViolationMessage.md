# WorkPlanConstraintsViolationMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Message for how to resolve a set of conflicted work plan constraints |  |
| **fixableConstraintsMessages** | [**List&lt;WorkPlanConstraintViolationMessage&gt;**](WorkPlanConstraintViolationMessage) | If type == 'ConstraintConflictWithPotentialFixes', messages for the set of conflicted work plan constraints. Each element indicates the message of potential fix to unavailable times to resolve work plan constraints |  |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CONSTRAINTCONFLICTWITHPOTENTIALFIXES | &quot;ConstraintConflictWithPotentialFixes&quot; | 
| CONSTRAINTCONFLICTUNKNOWNFIX | &quot;ConstraintConflictUnknownFix&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
