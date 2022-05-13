---
title: WritableDialerContact
---
## WritableDialerContact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **contactListId** | <!----><!---->**String**<!----> | The identifier of the contact list containing this contact. |  |
| **data** | <!----><!---->**Map&lt;String, Object&gt;**<!----> | An ordered map of the contact's columns and corresponding values. |  |
| **latestSmsEvaluations** | <!----><!---->[**Map&lt;String, MessageEvaluation&gt;**](MessageEvaluation.html)<!----> | A map of SMS records for the contact phone columns. |  [optional] |
| **callable** | <!----><!---->**Boolean**<!----> | Indicates whether or not the contact can be called. |  [optional] |
| **phoneNumberStatus** | <!----><!---->[**Map&lt;String, PhoneNumberStatus&gt;**](PhoneNumberStatus.html)<!----> | A map of phone number columns to PhoneNumberStatuses, which indicate if the phone number is callable or not. |  [optional] |
{: class="table table-striped"}



