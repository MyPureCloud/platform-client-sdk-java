---
title: AlternativeShiftNotification
---
## AlternativeShiftNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **weekDate** | <!----><!---->[**LocalDate**](LocalDate.html)<!----> | The start date of the schedule with which this trade is associated. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  |
| **granularity** | [**GranularityEnum**](#GranularityEnum)<!----> | The granularity of alternative shifts to be traded |  |
| **newState** | [**NewStateEnum**](#NewStateEnum)<!----> | The new state of the alternative shift trade, null if there was no change |  [optional] |
| **initiatingUser** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user who initiated the alternative shift trade |  |
| **initiatingShiftDate** | <!----><!---->[**Date**](Date.html)<!----> | The start date and time of the initiating shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **receivingUser** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The user on the receiving this alternative shift trade |  [optional] |
| **receivingShiftDate** | <!----><!---->[**Date**](Date.html)<!----> | The start date and time of the receiving alternative shift. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="GranularityEnum"></a>

## Enum: GranularityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DAILY | &quot;Daily&quot; | 
| WEEKLY | &quot;Weekly&quot; | 
{: class="table table-striped"}


<a name="NewStateEnum"></a>

## Enum: NewStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CANCELED | &quot;Canceled&quot; | 
| DENIED | &quot;Denied&quot; | 
| EXPIRED | &quot;Expired&quot; | 
| SUBMITTED | &quot;Submitted&quot; | 
| APPROVED | &quot;Approved&quot; | 
{: class="table table-striped"}



