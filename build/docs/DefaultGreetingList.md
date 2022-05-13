---
title: DefaultGreetingList
---
## DefaultGreetingList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **owner** | <!----><!---->[**GreetingOwner**](GreetingOwner.html)<!----> |  |  [optional] |
| **ownerType** | [**OwnerTypeEnum**](#OwnerTypeEnum)<!----> |  |  [optional] |
| **greetings** | <!----><!---->[**Map&lt;String, Greeting&gt;**](Greeting.html)<!----> |  |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->**String**<!----> |  |  [optional] |
| **modifiedDate** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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



