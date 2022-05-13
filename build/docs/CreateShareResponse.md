---
title: CreateShareResponse
---
## CreateShareResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **sharedEntityType** | [**SharedEntityTypeEnum**](#SharedEntityTypeEnum)<!----> |  |  [optional] |
| **sharedEntity** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **memberType** | [**MemberTypeEnum**](#MemberTypeEnum)<!----> |  |  [optional] |
| **member** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **sharedBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **workspace** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **succeeded** | <!----><!---->[**List&lt;Share&gt;**](Share.html)<!----> |  |  [optional] |
| **failed** | <!----><!---->[**List&lt;Share&gt;**](Share.html)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="SharedEntityTypeEnum"></a>

## Enum: SharedEntityTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DOCUMENT | &quot;DOCUMENT&quot; | 
{: class="table table-striped"}


<a name="MemberTypeEnum"></a>

## Enum: MemberTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| GROUP | &quot;GROUP&quot; | 
| PUBLIC | &quot;PUBLIC&quot; | 
{: class="table table-striped"}



