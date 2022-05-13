---
title: GDPRRequest
---
## GDPRRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **createdBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The user that created this request |  |
| **replacementTerms** | <!----><!---->[**List&lt;ReplacementTerm&gt;**](ReplacementTerm.html)<!----> | The replacement terms for the provided search terms, in the case of a GDPR_UPDATE request |  [optional] |
| **requestType** | [**RequestTypeEnum**](#RequestTypeEnum)<!----> | The type of GDPR request |  |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | When the request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the request |  |
| **subject** | <!----><!---->[**GDPRSubject**](GDPRSubject.html)<!----> | The subject of the GDPR request |  |
| **resultsUrl** | <!----><!---->**String**<!----> | The location where the results of the request can be retrieved |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="RequestTypeEnum"></a>

## Enum: RequestTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| GDPR_EXPORT | &quot;GDPR_EXPORT&quot; | 
| GDPR_UPDATE | &quot;GDPR_UPDATE&quot; | 
| GDPR_DELETE | &quot;GDPR_DELETE&quot; | 
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INITIATED | &quot;INITIATED&quot; | 
| SEARCHING | &quot;SEARCHING&quot; | 
| UPDATING | &quot;UPDATING&quot; | 
| DELETING | &quot;DELETING&quot; | 
| COMPLETED | &quot;COMPLETED&quot; | 
| ERROR | &quot;ERROR&quot; | 
| FINALIZING | &quot;FINALIZING&quot; | 
{: class="table table-striped"}



