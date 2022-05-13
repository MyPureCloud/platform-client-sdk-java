---
title: ListedTopic
---
## ListedTopic


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **published** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **strictness** | [**StrictnessEnum**](#StrictnessEnum)<!----> |  |  [optional] |
| **programsCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **tags** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **dialect** | <!----><!---->**String**<!----> |  |  [optional] |
| **participants** | [**ParticipantsEnum**](#ParticipantsEnum)<!----> |  |  [optional] |
| **phrasesCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **modifiedBy** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StrictnessEnum"></a>

## Enum: StrictnessEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| _1 | &quot;1&quot; | 
| _55 | &quot;55&quot; | 
| _65 | &quot;65&quot; | 
| _72 | &quot;72&quot; | 
| _85 | &quot;85&quot; | 
| _90 | &quot;90&quot; | 
{: class="table table-striped"}


<a name="ParticipantsEnum"></a>

## Enum: ParticipantsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EXTERNAL | &quot;External&quot; | 
| INTERNAL | &quot;Internal&quot; | 
| ALL | &quot;All&quot; | 
{: class="table table-striped"}



