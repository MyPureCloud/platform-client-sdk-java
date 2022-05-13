---
title: ShiftTradeMatchViolation
---
## ShiftTradeMatchViolation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of constraint violation |  [optional] |
| **params** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Clarifying user params for constructing helpful error messages |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AGENTCAPABILITYMISMATCH | &quot;AgentCapabilityMismatch&quot; | 
| CANNOTTRADEWITHYOURSELF | &quot;CannotTradeWithYourself&quot; | 
| DIRECTTRADEFOROTHERUSER | &quot;DirectTradeForOtherUser&quot; | 
| INITIATINGAGENTSCHEDULEDOESNOTEXIST | &quot;InitiatingAgentScheduleDoesNotExist&quot; | 
| INITIATINGSHIFTDISALLOWEDACTIVITYCATEGORY | &quot;InitiatingShiftDisallowedActivityCategory&quot; | 
| INITIATINGSHIFTDOESNOTEXIST | &quot;InitiatingShiftDoesNotExist&quot; | 
| INITIATINGSHIFTHASEXTERNALACTIVITIES | &quot;InitiatingShiftHasExternalActivities&quot; | 
| INITIATINGSHIFTOVERLAPSEXISTING | &quot;InitiatingShiftOverlapsExisting&quot; | 
| INITIATINGSHIFTSTARTTOOCLOSE | &quot;InitiatingShiftStartTooClose&quot; | 
| INITIATINGSHIFTTIMESCHANGED | &quot;InitiatingShiftTimesChanged&quot; | 
| INITIATINGWEEKLYMAXPAIDTIME | &quot;InitiatingWeeklyMaxPaidTime&quot; | 
| INITIATINGWEEKLYMINPAIDTIME | &quot;InitiatingWeeklyMinPaidTime&quot; | 
| INVALIDSTATE | &quot;InvalidState&quot; | 
| ONESIDEDTRADECREATION | &quot;OneSidedTradeCreation&quot; | 
| RECEIVINGAGENTSCHEDULEDOESNOTEXIST | &quot;ReceivingAgentScheduleDoesNotExist&quot; | 
| RECEIVINGSHIFTDISALLOWEDACTIVITYCATEGORY | &quot;ReceivingShiftDisallowedActivityCategory&quot; | 
| RECEIVINGSHIFTDOESNOTEXIST | &quot;ReceivingShiftDoesNotExist&quot; | 
| RECEIVINGSHIFTFORONESIDEDTRADE | &quot;ReceivingShiftForOneSidedTrade&quot; | 
| RECEIVINGSHIFTHASEXTERNALACTIVITIES | &quot;ReceivingShiftHasExternalActivities&quot; | 
| RECEIVINGSHIFTMISSINGFORTWOSIDEDTRADE | &quot;ReceivingShiftMissingForTwoSidedTrade&quot; | 
| RECEIVINGSHIFTOUTSIDEACCEPTABLEINTERVALS | &quot;ReceivingShiftOutsideAcceptableIntervals&quot; | 
| RECEIVINGSHIFTOVERLAPSEXISTING | &quot;ReceivingShiftOverlapsExisting&quot; | 
| RECEIVINGSHIFTSTARTTOOCLOSE | &quot;ReceivingShiftStartTooClose&quot; | 
| RECEIVINGSHIFTTIMESCHANGED | &quot;ReceivingShiftTimesChanged&quot; | 
| RECEIVINGWEEKLYMAXPAIDTIME | &quot;ReceivingWeeklyMaxPaidTime&quot; | 
| RECEIVINGWEEKLYMINPAIDTIME | &quot;ReceivingWeeklyMinPaidTime&quot; | 
| SHIFTTRADINGNOTENABLED | &quot;ShiftTradingNotEnabled&quot; | 
| UNEQUALPAIDTIME | &quot;UnequalPaidTime&quot; | 
| WEEKSCHEDULEDIFFERENT | &quot;WeekScheduleDifferent&quot; | 
| WEEKSCHEDULEDOESNOTEXIST | &quot;WeekScheduleDoesNotExist&quot; | 
| WEEKSCHEDULEUNPUBLISHED | &quot;WeekScheduleUnpublished&quot; | 
{: class="table table-striped"}



