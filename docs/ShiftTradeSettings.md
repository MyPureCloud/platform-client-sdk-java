# ShiftTradeSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | **Boolean** | Whether shift trading is enabled for this management unit |  [optional] |
| **autoReview** | **Boolean** | Whether automatic shift trade review is enabled according to the rules defined in for this management unit |  [optional] |
| **allowDirectTrades** | **Boolean** | Whether direct shift trades between agents are allowed |  [optional] |
| **minHoursInFuture** | **Integer** | The minimum number of hours in the future shift trades are allowed |  [optional] |
| **unequalPaid** | [**UnequalPaidEnum**](#Enum--UnequalPaidEnum) | How to handle shift trades which involve unequal paid times |  [optional] |
| **oneSided** | [**OneSidedEnum**](#Enum--OneSidedEnum) | How to handle one-sided shift trades |  [optional] |
| **weeklyMinPaidViolations** | [**WeeklyMinPaidViolationsEnum**](#Enum--WeeklyMinPaidViolationsEnum) | How to handle shift trades which result in violations of weekly minimum paid time constraint |  [optional] |
| **weeklyMaxPaidViolations** | [**WeeklyMaxPaidViolationsEnum**](#Enum--WeeklyMaxPaidViolationsEnum) | How to handle shift trades which result in violations of weekly maximum paid time constraint |  [optional] |
| **requiresMatchingQueues** | **Boolean** | Whether to constrain shift trades to agents with matching queues |  [optional] |
| **requiresMatchingLanguages** | **Boolean** | Whether to constrain shift trades to agents with matching languages |  [optional] |
| **requiresMatchingSkills** | **Boolean** | Whether to constrain shift trades to agents with matching skills |  [optional] |
| **requiresMatchingPlanningGroups** | **Boolean** | Whether to constrain shift trades to agents with matching planning groups |  [optional] |
| **activityCategoryRules** | [**List&lt;ShiftTradeActivityRule&gt;**](ShiftTradeActivityRule) | Rules that specify what to do with activity categories that are part of a shift defined in a trade |  [optional] |


## Enum: UnequalPaidEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;Allow&quot; | 
| DISALLOW | &quot;Disallow&quot; | 
| ADMINREVIEW | &quot;AdminReview&quot; | 


## Enum: OneSidedEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;Allow&quot; | 
| DISALLOW | &quot;Disallow&quot; | 
| ADMINREVIEW | &quot;AdminReview&quot; | 


## Enum: WeeklyMinPaidViolationsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;Allow&quot; | 
| DISALLOW | &quot;Disallow&quot; | 
| ADMINREVIEW | &quot;AdminReview&quot; | 


## Enum: WeeklyMaxPaidViolationsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;Allow&quot; | 
| DISALLOW | &quot;Disallow&quot; | 
| ADMINREVIEW | &quot;AdminReview&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:221.0.0_
