# CommonRulePredicateEntity


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **entityType** | [**EntityTypeEnum**](#Enum--EntityTypeEnum) | Specifies the type of entity being evaluated |  |
| **user** | [**AddressableEntityRef**](AddressableEntityRef) | User id of the entity being monitored |  [optional] |
| **group** | [**AddressableEntityRef**](AddressableEntityRef) | Group id of the entity being monitored |  [optional] |
| **queue** | [**AddressableEntityRef**](AddressableEntityRef) | Queue id of the entity being monitored |  [optional] |
| **team** | [**AddressableEntityRef**](AddressableEntityRef) | Team id of the entity being monitored |  [optional] |


## Enum: EntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;User&quot; | 
| GROUP | &quot;Group&quot; | 
| QUEUE | &quot;Queue&quot; | 
| TEAM | &quot;Team&quot; | 
| TEAMMEMBERS | &quot;TeamMembers&quot; | 
| ORGANIZATION | &quot;Organization&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
