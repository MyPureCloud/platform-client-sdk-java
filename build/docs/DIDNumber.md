---
title: DIDNumber
---
## DIDNumber


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **number** | <!----><!---->**String**<!----> | The number of the DID formatted as E164. |  [optional] |
| **assigned** | <!----><!---->**Boolean**<!----> | True if this DID is assigned to an entity.  False otherwise. |  [optional] |
| **didPool** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | A Uri reference to the DID Pool this DID is a part of. |  [optional] |
| **owner** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | A Uri reference to the owner of this DID.  The owner's type can be found in ownerType.  If the DID is unassigned, this will be NULL. |  [optional] |
| **ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum)<!----> | The type of the entity that owns this DID.  If the DID is unassigned, this will be NULL. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="OwnerTypeEnum"></a>

## Enum: OwnerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| PHONE | &quot;PHONE&quot; | 
| IVR_CONFIG | &quot;IVR_CONFIG&quot; | 
| GROUP | &quot;GROUP&quot; | 
{: class="table table-striped"}



