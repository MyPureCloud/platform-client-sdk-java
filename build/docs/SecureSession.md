---
title: SecureSession
---
## SecureSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **flow** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The flow to execute securely |  |
| **userData** | <!----><!---->**String**<!----> | Customer-provided data |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The current state of a secure session |  |
| **sourceParticipantId** | <!----><!---->**String**<!----> | Unique identifier for the participant initiating the secure session. |  [optional] |
| **disconnect** | <!----><!---->**Boolean**<!----> | If true, disconnect the agent after creating the session |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;PENDING&quot; | 
| COMPLETED | &quot;COMPLETED&quot; | 
| FAILED | &quot;FAILED&quot; | 
{: class="table table-striped"}



