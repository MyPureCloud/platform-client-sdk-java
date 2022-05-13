---
title: HistoryListing
---
## HistoryListing


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **complete** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **user** | <!----><!---->[**User**](User.html)<!----> |  |  [optional] |
| **client** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **errorMessage** | <!----><!---->**String**<!----> |  |  [optional] |
| **errorCode** | <!----><!---->**String**<!----> |  |  [optional] |
| **errorDetails** | <!----><!---->[**List&lt;Detail&gt;**](Detail.html)<!----> |  |  [optional] |
| **errorMessageParams** | <!----><!---->**Map&lt;String, String&gt;**<!----> |  |  [optional] |
| **actionName** | [**ActionNameEnum**](#ActionNameEnum)<!----> | Action name |  [optional] |
| **actionStatus** | [**ActionStatusEnum**](#ActionStatusEnum)<!----> | Action status |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **system** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **started** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **completed** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **pageSize** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **pageNumber** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **total** | <!----><!---->**Long**<!----> |  |  [optional] |
| **entities** | <!----><!---->[**List&lt;HistoryEntry&gt;**](HistoryEntry.html)<!----> |  |  [optional] |
| **pageCount** | <!----><!---->**Integer**<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="ActionNameEnum"></a>

## Enum: ActionNameEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CREATE | &quot;CREATE&quot; | 
| CHECKIN | &quot;CHECKIN&quot; | 
| DEBUG | &quot;DEBUG&quot; | 
| DELETE | &quot;DELETE&quot; | 
| HISTORY | &quot;HISTORY&quot; | 
| PUBLISH | &quot;PUBLISH&quot; | 
| STATE_CHANGE | &quot;STATE_CHANGE&quot; | 
| UPDATE | &quot;UPDATE&quot; | 
| VALIDATE | &quot;VALIDATE&quot; | 
{: class="table table-striped"}


<a name="ActionStatusEnum"></a>

## Enum: ActionStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LOCKED | &quot;LOCKED&quot; | 
| UNLOCKED | &quot;UNLOCKED&quot; | 
| STARTED | &quot;STARTED&quot; | 
| PENDING_GENERATION | &quot;PENDING_GENERATION&quot; | 
| PENDING_BACKEND_NOTIFICATION | &quot;PENDING_BACKEND_NOTIFICATION&quot; | 
| SUCCESS | &quot;SUCCESS&quot; | 
| FAILURE | &quot;FAILURE&quot; | 
{: class="table table-striped"}



