# AlertSummary


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entities** | [**List&lt;AlertSummaryEntity&gt;**](AlertSummaryEntity) | The entities who violated the rule condition over the duration of the alert. |  |
| **conversation** | [**AddressableEntityRef**](AddressableEntityRef) | The id of the conversation that triggered the alert.  Only used for alerts based on instance-based conversation metrics. |  [optional] |
| **metricType** | [**MetricTypeEnum**](#Enum--MetricTypeEnum) | The metric type that is monitored. |  |
| **entitiesAreTeamMembers** | **Boolean** | Flag that indicated whether or not the alert is for a rule with a condition for all members of a team. |  |


## Enum: MetricTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTERVAL | &quot;Interval&quot; | 
| INSTANCE | &quot;Instance&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
