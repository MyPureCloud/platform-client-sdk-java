---
title: WorkPlanConstraintConflictMessage
---
## WorkPlanConstraintConflictMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Type of constraint conflict that can be resolved by clients in order to generate agent schedules |  [optional] |
| **arguments** | <!----><!---->[**List&lt;WorkPlanValidationMessageArgument&gt;**](WorkPlanValidationMessageArgument.html)<!----> | The arguments to the type of the message that can help clients resolve validation issues |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWNFIX | &quot;UnknownFix&quot; | 
| WITHPOTENTIALFIXES | &quot;WithPotentialFixes&quot; | 
{: class="table table-striped"}



