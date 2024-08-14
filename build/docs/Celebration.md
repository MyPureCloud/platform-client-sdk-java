---
title: Celebration
---
## Celebration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **recipient** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The Recipient of the celebration |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The creator of the celebration |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date the celebration was created on. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The Celebration Type |  [optional] |
| **title** | <!----><!---->**String**<!----> | The Celebration title |  [optional] |
| **note** | <!----><!---->**String**<!----> | The Celebration note |  [optional] |
| **sourceEntity** | <!----><!---->[**SourceEntity**](SourceEntity.html)<!----> | The celebration's source entity |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RECOGNITION | &quot;Recognition&quot; | 
{: class="table table-striped"}



