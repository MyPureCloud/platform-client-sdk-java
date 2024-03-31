---
title: V2MobiusAlertsTopicAlertSummaryEntity
---
## V2MobiusAlertsTopicAlertSummaryEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entityType** | [**EntityTypeEnum**](#EntityTypeEnum)<!----> |  |  [optional] |
| **user** | <!----><!---->[**V2MobiusAlertsTopicAlertingAddressableEntityRef**](V2MobiusAlertsTopicAlertingAddressableEntityRef.html)<!----> |  |  [optional] |
| **group** | <!----><!---->[**V2MobiusAlertsTopicAlertingAddressableEntityRef**](V2MobiusAlertsTopicAlertingAddressableEntityRef.html)<!----> |  |  [optional] |
| **queue** | <!----><!---->[**V2MobiusAlertsTopicAlertingAddressableEntityRef**](V2MobiusAlertsTopicAlertingAddressableEntityRef.html)<!----> |  |  [optional] |
| **team** | <!----><!---->[**V2MobiusAlertsTopicAlertingAddressableEntityRef**](V2MobiusAlertsTopicAlertingAddressableEntityRef.html)<!----> |  |  [optional] |
| **alerting** | <!----><!---->**Boolean**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="EntityTypeEnum"></a>

## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ORGANIZATION | &quot;Organization&quot; | 
| USER | &quot;User&quot; | 
| QUEUE | &quot;Queue&quot; | 
| GROUP | &quot;Group&quot; | 
| EDGE | &quot;Edge&quot; | 
| TEAM | &quot;Team&quot; | 
| TEAMMEMBERS | &quot;TeamMembers&quot; | 
{: class="table table-striped"}



