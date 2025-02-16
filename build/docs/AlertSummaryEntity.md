# AlertSummaryEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entityType** | [**EntityTypeEnum**](#Enum--EntityTypeEnum) | Specifies the type of entity being evaluated |  |
| **user** | [**AddressableEntityRef**](AddressableEntityRef) | User id of the entity being monitored |  [optional] |
| **group** | [**AddressableEntityRef**](AddressableEntityRef) | Group id of the entity being monitored |  [optional] |
| **queue** | [**AddressableEntityRef**](AddressableEntityRef) | Queue id of the entity being monitored |  [optional] |
| **team** | [**AddressableEntityRef**](AddressableEntityRef) | Team id of the entity being monitored |  [optional] |
| **alerting** | **Boolean** | Flag that indicated if the entity is current causing the alert to be triggered |  |


## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;User&quot; | 
| GROUP | &quot;Group&quot; | 
| QUEUE | &quot;Queue&quot; | 
| TEAM | &quot;Team&quot; | 
| TEAMMEMBERS | &quot;TeamMembers&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
