---
title: WhatsAppIntegration
---
## WhatsAppIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | A unique Integration Id. |  |
| **name** | <!----><!---->**String**<!----> | The name of the WhatsApp integration. |  |
| **supportedContent** | <!----><!---->[**SupportedContentReference**](SupportedContentReference.html)<!----> | Defines the SupportedContent profile configured for an integration |  [optional] |
| **messagingSetting** | <!----><!---->[**MessagingSettingReference**](MessagingSettingReference.html)<!----> |  |  [optional] |
| **phoneNumber** | <!----><!---->**String**<!----> | The phone number associated to the WhatsApp integration. |  |
| **availablePhoneNumbers** | <!----><!---->[**WhatsAppAvailablePhoneNumberDetailsListing**](WhatsAppAvailablePhoneNumberDetailsListing.html)<!----> | The list of available WhatsApp phone numbers for this account. Please select one phone number from this list to use with the created integration. |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The status of the WhatsApp Integration |  [optional] |
| **recipient** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The recipient associated to the WhatsApp Integration. This recipient is used to associate a flow to an integration |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date this Integration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createdBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User reference that created this Integration |  [optional] |
| **modifiedBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | User reference that last modified this Integration |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Version number required for updates. |  |
| **activationStatusCode** | [**ActivationStatusCodeEnum**](#ActivationStatusCodeEnum)<!----> | The status code of WhatsApp Integration activation process |  [optional] |
| **activationErrorInfo** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | The error information of WhatsApp Integration activation process |  [optional] |
| **createStatus** | [**CreateStatusEnum**](#CreateStatusEnum)<!----> | Status of asynchronous create operation |  [optional] |
| **createError** | <!----><!---->[**ErrorBody**](ErrorBody.html)<!----> | Error information returned, if createStatus is set to Error |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| ERROR | &quot;Error&quot; | 
| STARTING | &quot;Starting&quot; | 
| INCOMPLETE | &quot;Incomplete&quot; | 
| DELETING | &quot;Deleting&quot; | 
| DELETIONFAILED | &quot;DeletionFailed&quot; | 
{: class="table table-striped"}


<a name="ActivationStatusCodeEnum"></a>

## Enum: ActivationStatusCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CODESENT | &quot;CodeSent&quot; | 
| WAITREQUIRED | &quot;WaitRequired&quot; | 
| ACTIVATIONFAILED | &quot;ActivationFailed&quot; | 
| CODECONFIRMED | &quot;CodeConfirmed&quot; | 
| CONFIRMATIONFAILED | &quot;ConfirmationFailed&quot; | 
| RESENDCODE | &quot;ResendCode&quot; | 
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



