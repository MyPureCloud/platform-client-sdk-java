---
title: TwitterIntegration
---
## TwitterIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | A unique Integration Id |  |
| **name** | <!----><!---->**String**<!----> | The name of the Twitter Integration |  |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.html)<!----> | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | <!----><!---->[**MessagingSettingReference**](MessagingSettingReference.html)<!----> |  |  [optional] |
| **accessTokenKey** | <!----><!---->**String**<!----> | The Access Token Key from Twitter messenger |  |
| **consumerKey** | <!----><!---->**String**<!----> | The Consumer Key from Twitter messenger |  |
| **username** | <!----><!---->**String**<!----> | The Username from Twitter |  [optional] |
| **userId** | <!----><!---->**String**<!----> | The UserId from Twitter |  [optional] |
| **status** | <!----><!---->**String**<!----> | The status of the Twitter Integration |  [optional] |
| **tier** | [**TierEnum**](#TierEnum)<!----> | The type of twitter account to be used for the integration |  |
| **envName** | <!----><!---->**String**<!----> | The Twitter environment name, e.g.: env-beta (required for premium tier) |  [optional] |
| **recipient** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The recipient associated to the Twitter Integration. This recipient is used to associate a flow to an integration |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date this Integration was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User reference that created this Integration |  [optional] |
| **modifiedBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User reference that last modified this Integration |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Version number required for updates. |  |
| **createStatus** | [**CreateStatusEnum**](#CreateStatusEnum)<!----> | Status of asynchronous create operation |  [optional] |
| **createError** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Error information returned, if createStatus is set to Error |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TierEnum"></a>

## Enum: TierEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PREMIUM | &quot;premium&quot; | 
| ENTERPRISE | &quot;enterprise&quot; | 
{: class="table table-striped"}


<a name="CreateStatusEnum"></a>

## Enum: CreateStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INITIATED | &quot;Initiated&quot; | 
| COMPLETED | &quot;Completed&quot; | 
| ERROR | &quot;Error&quot; | 
{: class="table table-striped"}



