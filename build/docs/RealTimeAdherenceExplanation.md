---
title: RealTimeAdherenceExplanation
---
## RealTimeAdherenceExplanation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start timestamp of the adherence explanation in ISO-8601 format |  [optional] |
| **lengthMinutes** | <!----><!---->**Integer**<!----> | The length of the adherence explanation in minutes |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the adherence explanation |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 
{: class="table table-striped"}



