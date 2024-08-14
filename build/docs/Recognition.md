---
title: Recognition
---
## Recognition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **recipient** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The recipient of the recognition |  [optional] |
| **createdBy** | <!----><!---->[**UserReference**](UserReference.html)<!----> | The creator of the recognition |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of recognition |  [optional] |
| **title** | <!----><!---->**String**<!----> | The recognition title |  [optional] |
| **note** | <!----><!---->**String**<!----> | The recognition note |  [optional] |
| **contextType** | [**ContextTypeEnum**](#ContextTypeEnum)<!----> | The context type (optional) |  [optional] |
| **contextId** | <!----><!---->**String**<!----> | The context id (optional) |  [optional] |
| **dateDisplayed** | <!----><!---->[**Date**](Date.html)<!----> | The displayed date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateAcknowledged** | <!----><!---->[**Date**](Date.html)<!----> | The acknowledged date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| THANKYOU | &quot;ThankYou&quot; | 
| CONGRATULATIONS | &quot;Congratulations&quot; | 
| HIGHPERFORMANCE | &quot;HighPerformance&quot; | 
| COMPANYVALUES | &quot;CompanyValues&quot; | 
{: class="table table-striped"}


<a name="ContextTypeEnum"></a>

## Enum: ContextTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INTERACTION | &quot;Interaction&quot; | 
| INSIGHTS | &quot;Insights&quot; | 
| DEVELOPMENT | &quot;Development&quot; | 
| SCORECARD | &quot;Scorecard&quot; | 
{: class="table table-striped"}



