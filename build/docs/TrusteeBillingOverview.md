---
title: TrusteeBillingOverview
---
## TrusteeBillingOverview


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **organization** | <!----><!---->[**NamedEntity**](NamedEntity.html)<!----> | Organization |  |
| **currency** | <!----><!---->**String**<!----> | The currency type. |  |
| **enabledProducts** | <!----><!---->**List&lt;String&gt;**<!----> | The charge short names for products enabled during the specified period. |  |
| **subscriptionType** | [**SubscriptionTypeEnum**](#SubscriptionTypeEnum)<!----> | The subscription type. |  |
| **rampPeriodStartDate** | <!----><!---->[**Date**](Date.html)<!----> | Date-time the ramp period starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **rampPeriodEndDate** | <!----><!---->[**Date**](Date.html)<!----> | Date-time the ramp period ends. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **billingPeriodStartDate** | <!----><!---->[**Date**](Date.html)<!----> | Date-time the billing period started. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **billingPeriodEndDate** | <!----><!---->[**Date**](Date.html)<!----> | Date-time the billing period ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **usages** | <!----><!---->[**List&lt;SubscriptionOverviewUsage&gt;**](SubscriptionOverviewUsage.html)<!----> | Usages for the specified period. |  |
| **contractAmendmentDate** | <!----><!---->[**Date**](Date.html)<!----> | Date-time the contract was last amended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **contractEffectiveDate** | <!----><!---->[**Date**](Date.html)<!----> | Date-time the contract became effective. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **contractEndDate** | <!----><!---->[**Date**](Date.html)<!----> | Date-time the contract ends. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **minimumMonthlyAmount** | <!----><!---->**String**<!----> | Minimum amount that will be charged for the month |  [optional] |
| **inRampPeriod** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="SubscriptionTypeEnum"></a>

## Enum: SubscriptionTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ININ | &quot;ININ&quot; | 
| MONTH_TO_MONTH | &quot;MONTH_TO_MONTH&quot; | 
| FREE_TRIAL_MONTH_TO_MONTH | &quot;FREE_TRIAL_MONTH_TO_MONTH&quot; | 
| PREPAY_MONTHLY_COMMITMENT | &quot;PREPAY_MONTHLY_COMMITMENT&quot; | 
| PREPAY | &quot;PREPAY&quot; | 
| DEV_ORG_MONTH_TO_MONTH | &quot;DEV_ORG_MONTH_TO_MONTH&quot; | 
| DEV_ORG_PREPAY_MONTHLY_COMMITMENT | &quot;DEV_ORG_PREPAY_MONTHLY_COMMITMENT&quot; | 
| DEV_ORG_PREPAY | &quot;DEV_ORG_PREPAY&quot; | 
{: class="table table-striped"}



