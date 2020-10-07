---
title: WorkPlanConfigurationViolationMessage
---
## WorkPlanConfigurationViolationMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Type of configuration violation message for this work plan |  [optional] |
| **arguments** | <!----><!---->[**List&lt;WorkPlanValidationMessageArgument&gt;**](WorkPlanValidationMessageArgument.html)<!----> | Arguments of the message that provide information about the misconfigured value or the threshold that is exceeded by the misconfigured value |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| DAILYEXACTPAIDMINUTES | &quot;DailyExactPaidMinutes&quot; |
| DAILYSHIFTMAXIMUMPOSSIBILITIESVIOLATED | &quot;DailyShiftMaximumPossibilitiesViolated&quot; |
| MAXSHIFTS | &quot;MaxShifts&quot; |
| NOSHIFTS | &quot;NoShifts&quot; |
| WEEKLYEXACTPAIDMINUTES | &quot;WeeklyExactPaidMinutes&quot; |
{: class="table table-striped"}



