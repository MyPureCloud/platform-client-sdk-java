---
title: AddAdherenceExplanationAgentRequest
---
## AddAdherenceExplanationAgentRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the adherence explanation |  |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start timestamp of the adherence explanation in ISO-8601 format |  |
| **lengthMinutes** | <!----><!---->**Integer**<!----> | The length of the adherence explanation in minutes |  |
| **notes** | <!----><!---->**String**<!----> | Notes about the adherence explanation |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LATE | &quot;Late&quot; | 
{: class="table table-striped"}



