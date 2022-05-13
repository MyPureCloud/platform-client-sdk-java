---
title: Greeting
---
## Greeting


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Greeting type |  |
| **ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum)<!----> | Greeting owner type |  |
| **owner** | <!----><!---->[**DomainEntity**](DomainEntity.html)<!----> | Greeting owner |  |
| **audioFile** | <!----><!---->[**GreetingAudioFile**](GreetingAudioFile.html)<!----> |  |  [optional] |
| **audioTTS** | <!----><!---->**String**<!----> |  |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->**String**<!----> |  |  [optional] |
| **modifiedDate** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| STATION | &quot;STATION&quot; | 
| VOICEMAIL | &quot;VOICEMAIL&quot; | 
| NAME | &quot;NAME&quot; | 
{: class="table table-striped"}


<a name="OwnerTypeEnum"></a>

## Enum: OwnerTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| USER | &quot;USER&quot; | 
| ORGANIZATION | &quot;ORGANIZATION&quot; | 
| GROUP | &quot;GROUP&quot; | 
{: class="table table-striped"}



