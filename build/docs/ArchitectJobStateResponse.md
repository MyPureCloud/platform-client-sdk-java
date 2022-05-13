---
title: ArchitectJobStateResponse
---
## ArchitectJobStateResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **flow** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Flow created from the Architect Job |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | Status of the Architect Job |  [optional] |
| **command** | [**CommandEnum**](#CommandEnum)<!----> | The command executed by the Architect Job |  [optional] |
| **messages** | <!----><!---->[**List&lt;ArchitectJobMessage&gt;**](ArchitectJobMessage.html)<!----> | Warnings and Errors messages of the Architect Job |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REGISTERED | &quot;Registered&quot; | 
| STARTED | &quot;Started&quot; | 
| SUCCESS | &quot;Success&quot; | 
| FAILURE | &quot;Failure&quot; | 
{: class="table table-striped"}


<a name="CommandEnum"></a>

## Enum: CommandEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLISH | &quot;Publish&quot; | 
| CREATE | &quot;Create&quot; | 
| UPDATE | &quot;Update&quot; | 
{: class="table table-striped"}



