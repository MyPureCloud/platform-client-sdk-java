---
title: AdherenceExplanationResponse
---
## AdherenceExplanationResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **agent** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The agent to whom this adherence explanation applies |  |
| **managementUnit** | <!----><!---->[**ManagementUnitReference**](ManagementUnitReference.html)<!----> | The management unit to which the agent belonged at the time the adherence explanation was submitted |  |
| **businessUnit** | <!----><!---->[**BusinessUnitReference**](BusinessUnitReference.html)<!----> | The business unit to which the agent belonged at the time the adherence explanation was submitted |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the adherence explanation |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the adherence explanation |  |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start timestamp of the adherence explanation in ISO-8601 format |  |
| **lengthMinutes** | <!----><!---->**Integer**<!----> | The length of the adherence explanation in minutes |  |
| **notes** | <!----><!---->**String**<!----> | Notes about the adherence explanation |  [optional] |
| **reviewedBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who reviewed the adherence explanation, if applicable |  [optional] |
| **reviewedDate** | <!----><!---->[**Date**](Date.html)<!----> | The timestamp for when the adherence explanation was reviewed, if applicable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LATE | &quot;Late&quot; | 
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



