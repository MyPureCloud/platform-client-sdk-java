# AuditLogMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Id of the audit message. |  [optional] |
| **userHomeOrgId** | **String** | Home Organization Id associated with this audit message. |  [optional] |
| **user** | [**DomainEntityRef**](DomainEntityRef) | User associated with this audit message. |  [optional] |
| **client** | [**AddressableEntityRef**](AddressableEntityRef) | Client associated with this audit message. |  [optional] |
| **remoteIp** | **List&lt;String&gt;** | List of IP addresses of systems that originated or handled the request. |  [optional] |
| **serviceName** | **String** | Name of the service that logged this audit message. |  [optional] |
| **level** | [**LevelEnum**](#Enum--LevelEnum) | Level of this audit message, USER or SYSTEM. |  [optional] |
| **eventDate** | [**Date**](Date) | Date and time of when the audit message was logged. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **message** | [**MessageInfo**](MessageInfo) | Message describing the event being audited. |  [optional] |
| **action** | **String** | Action that took place. |  [optional] |
| **entity** | [**DomainEntityRef**](DomainEntityRef) | Entity that was impacted. |  [optional] |
| **entityType** | **String** | Type of the entity that was impacted. |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the event being audited |  [optional] |
| **application** | **String** | Name of the application used to perform the audit's action |  [optional] |
| **initiatingAction** | [**InitiatingAction**](InitiatingAction) | Id and action of the audit initiating the transaction |  [optional] |
| **transactionInitiator** | **Boolean** | Whether the current audit is the initiator of the transaction |  [optional] |
| **propertyChanges** | [**List&lt;PropertyChange&gt;**](PropertyChange) | List of properties that were changed and changes made to those properties. |  [optional] |
| **context** | **Map&lt;String, String&gt;** | Additional context for this message. |  [optional] |
| **entityChanges** | [**List&lt;EntityChange&gt;**](EntityChange) | List of entities that were changed and changes made to those entities. |  [optional] |


## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| SYSTEM | &quot;SYSTEM&quot; | 
| GENESYS_INTERNAL | &quot;GENESYS_INTERNAL&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;SUCCESS&quot; | 
| FAILURE | &quot;FAILURE&quot; | 
| WARNING | &quot;WARNING&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:236.0.0_
