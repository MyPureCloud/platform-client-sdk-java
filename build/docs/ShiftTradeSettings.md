---
title: ShiftTradeSettings
---
## ShiftTradeSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **enabled** | <!----><!---->**Boolean**<!----> | Whether shift trading is enabled for this management unit |  [optional] |
| **autoReview** | <!----><!---->**Boolean**<!----> | Whether automatic shift trade review is enabled according to the rules defined in for this management unit |  [optional] |
| **allowDirectTrades** | <!----><!---->**Boolean**<!----> | Whether direct shift trades between agents are allowed |  [optional] |
| **minHoursInFuture** | <!----><!---->**Integer**<!----> | The minimum number of hours in the future shift trades are allowed |  [optional] |
| **unequalPaid** | [**UnequalPaidEnum**](#UnequalPaidEnum)<!----> | How to handle shift trades which involve unequal paid times |  [optional] |
| **oneSided** | [**OneSidedEnum**](#OneSidedEnum)<!----> | How to handle one-sided shift trades |  [optional] |
| **weeklyMinPaidViolations** | [**WeeklyMinPaidViolationsEnum**](#WeeklyMinPaidViolationsEnum)<!----> | How to handle shift trades which result in violations of weekly minimum paid time constraint |  [optional] |
| **weeklyMaxPaidViolations** | [**WeeklyMaxPaidViolationsEnum**](#WeeklyMaxPaidViolationsEnum)<!----> | How to handle shift trades which result in violations of weekly maximum paid time constraint |  [optional] |
| **requiresMatchingQueues** | <!----><!---->**Boolean**<!----> | Whether to constrain shift trades to agents with matching queues |  [optional] |
| **requiresMatchingLanguages** | <!----><!---->**Boolean**<!----> | Whether to constrain shift trades to agents with matching languages |  [optional] |
| **requiresMatchingSkills** | <!----><!---->**Boolean**<!----> | Whether to constrain shift trades to agents with matching skills |  [optional] |
| **requiresMatchingPlanningGroups** | <!----><!---->**Boolean**<!----> | Whether to constrain shift trades to agents with matching planning groups |  [optional] |
| **activityCategoryRules** | <!----><!---->[**List&lt;ShiftTradeActivityRule&gt;**](ShiftTradeActivityRule.html)<!----> | Rules that specify what to do with activity categories that are part of a shift defined in a trade |  [optional] |
{: class="table table-striped"}


<a name="UnequalPaidEnum"></a>

## Enum: UnequalPaidEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;Allow&quot; | 
| DISALLOW | &quot;Disallow&quot; | 
| ADMINREVIEW | &quot;AdminReview&quot; | 
{: class="table table-striped"}


<a name="OneSidedEnum"></a>

## Enum: OneSidedEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;Allow&quot; | 
| DISALLOW | &quot;Disallow&quot; | 
| ADMINREVIEW | &quot;AdminReview&quot; | 
{: class="table table-striped"}


<a name="WeeklyMinPaidViolationsEnum"></a>

## Enum: WeeklyMinPaidViolationsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;Allow&quot; | 
| DISALLOW | &quot;Disallow&quot; | 
| ADMINREVIEW | &quot;AdminReview&quot; | 
{: class="table table-striped"}


<a name="WeeklyMaxPaidViolationsEnum"></a>

## Enum: WeeklyMaxPaidViolationsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALLOW | &quot;Allow&quot; | 
| DISALLOW | &quot;Disallow&quot; | 
| ADMINREVIEW | &quot;AdminReview&quot; | 
{: class="table table-striped"}



