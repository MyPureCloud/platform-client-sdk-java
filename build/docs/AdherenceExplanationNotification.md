---
title: AdherenceExplanationNotification
---
## AdherenceExplanationNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **agent** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The agent for whom the adherence explanation applies |  [optional] |
| **managementUnit** | <!----><!---->[**ManagementUnitReference**](ManagementUnitReference.html)<!----> | The management unit to which the agent belonged at the time the adherence explanation was submitted |  [optional] |
| **businessUnit** | <!----><!---->[**BusinessUnitReference**](BusinessUnitReference.html)<!----> | The business unit to which the agent belonged at the time the adherence explanation was submitted |  [optional] |
| **startDate** | <!----><!---->[**Date**](Date.html)<!----> | The start date of the adherence explanation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lengthMinutes** | <!----><!---->**Integer**<!----> | The length of the adherence explanation in minutes |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the adherence explanation |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of the adherence explanation |  [optional] |
| **notes** | <!----><!---->**String**<!----> | Notes about the adherence explanation |  [optional] |
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


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LATE | &quot;Late&quot; | 
{: class="table table-striped"}



