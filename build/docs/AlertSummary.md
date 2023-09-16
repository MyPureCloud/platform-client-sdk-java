---
title: AlertSummary
---
## AlertSummary


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entities** | <!----><!---->[**List&lt;AlertSummaryEntity&gt;**](AlertSummaryEntity.html)<!----> | The entities who violated the rule condition over the duration of the alert. |  |
| **conversation** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The id of the conversation that triggered the alert.  Only used for alerts based on instance-based conversation metrics. |  [optional] |
| **metricType** | [**MetricTypeEnum**](#MetricTypeEnum)<!----> | The metric type that is monitored. |  |
| **entitiesAreTeamMembers** | <!----><!---->**Boolean**<!----> | Flag that indicated whether or not the alert is for a rule with a condition for all members of a team. |  |
{: class="table table-striped"}


<a name="MetricTypeEnum"></a>

## Enum: MetricTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTERVAL | &quot;Interval&quot; | 
| INSTANCE | &quot;Instance&quot; | 
{: class="table table-striped"}



