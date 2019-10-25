---
title: AuditMessage
---
## AuditMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | AuditMessage ID. |  |
| **user** | <!----><!---->[**AuditUser**](AuditUser.html)<!----> |  |  [optional] |
| **correlationId** | <!----><!---->**String**<!----> | Correlation ID. |  [optional] |
| **transactionId** | <!----><!---->**String**<!----> | Transaction ID. |  [optional] |
| **transactionInitiator** | <!----><!---->**Boolean**<!----> | Whether or not this audit can be considered the initiator of the transaction it is a part of. |  [optional] |
| **application** | <!----><!---->**String**<!----> | The application through which the action of this AuditMessage was initiated. |  [optional] |
| **serviceName** | <!----><!---->**String**<!----> | The name of the service which sent this AuditMessage. |  |
| **level** | <!----><!---->**String**<!----> | The level of this audit. USER or SYSTEM. |  |
| **timestamp** | <!----><!---->**String**<!----> | The time at which the action of this AuditMessage was initiated. |  [optional] |
| **receivedTimestamp** | <!----><!---->**String**<!----> | The time at which this AuditMessage was received. |  |
| **status** | <!----><!---->**String**<!----> | The status of the action of this AuditMessage |  |
| **actionContext** | <!----><!---->**String**<!----> | The context of a system-level action |  [optional] |
| **action** | <!----><!---->**String**<!----> | A string representing the action that took place |  [optional] |
| **changes** | <!----><!---->[**List&lt;Change&gt;**](Change.html)<!----> | Details about any changes that occurred in this audit |  [optional] |
| **entity** | <!----><!---->[**AuditEntity**](AuditEntity.html)<!----> |  |  [optional] |
| **serviceContext** | <!----><!---->[**ServiceContext**](ServiceContext.html)<!----> | The service-specific context associated with this AuditMessage. |  [optional] |
{: class="table table-striped"}



