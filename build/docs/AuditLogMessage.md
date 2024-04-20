---
title: AuditLogMessage
---
## AuditLogMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Id of the audit message. |  [optional] |
| **userHomeOrgId** | <!----><!---->**String**<!----> | Home Organization Id associated with this audit message. |  [optional] |
| **user** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User associated with this audit message. |  [optional] |
| **client** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Client associated with this audit message. |  [optional] |
| **remoteIp** | <!----><!---->**List&lt;String&gt;**<!----> | List of IP addresses of systems that originated or handled the request. |  [optional] |
| **serviceName** | <!----><!---->**String**<!----> | Name of the service that logged this audit message. |  [optional] |
| **level** | [**LevelEnum**](#LevelEnum)<!----> | Level of this audit message, USER or SYSTEM. |  [optional] |
| **eventDate** | <!----><!---->[**Date**](Date.html)<!----> | Date and time of when the audit message was logged. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **message** | <!----><!---->[**MessageInfo**](MessageInfo.html)<!----> | Message describing the event being audited. |  [optional] |
| **action** | <!----><!---->**String**<!----> | Action that took place. |  [optional] |
| **entity** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | Entity that was impacted. |  [optional] |
| **entityType** | <!----><!---->**String**<!----> | Type of the entity that was impacted. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of the event being audited |  [optional] |
| **application** | <!----><!---->**String**<!----> | Name of the application used to perform the audit's action |  [optional] |
| **initiatingAction** | <!----><!---->[**InitiatingAction**](InitiatingAction.html)<!----> | Id and action of the audit initiating the transaction |  [optional] |
| **transactionInitiator** | <!----><!---->**Boolean**<!----> | Whether the current audit is the initiator of the transaction |  [optional] |
| **propertyChanges** | <!----><!---->[**List&lt;PropertyChange&gt;**](PropertyChange.html)<!----> | List of properties that were changed and changes made to those properties. |  [optional] |
| **context** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Additional context for this message. |  [optional] |
| **entityChanges** | <!----><!---->[**List&lt;EntityChange&gt;**](EntityChange.html)<!----> | List of entities that were changed and changes made to those entities. |  [optional] |
{: class="table table-striped"}


<a name="LevelEnum"></a>

## Enum: LevelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| SYSTEM | &quot;SYSTEM&quot; | 
| GENESYS_INTERNAL | &quot;GENESYS_INTERNAL&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SUCCESS | &quot;SUCCESS&quot; | 
| FAILURE | &quot;FAILURE&quot; | 
| WARNING | &quot;WARNING&quot; | 
{: class="table table-striped"}



