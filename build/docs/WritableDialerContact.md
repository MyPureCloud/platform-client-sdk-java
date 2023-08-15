---
title: WritableDialerContact
---
## WritableDialerContact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **contactListId** | <!----><!---->**String**<!----> | The identifier of the contact list containing this contact. |  |
| **data** | <!----><!---->**Map&lt;String, String&gt;**<!----> | An ordered map of the contact's columns and corresponding values. |  |
| **latestSmsEvaluations** | <!----><!---->[**Map&lt;String, MessageEvaluation&gt;**](MessageEvaluation.html)<!----> | A map of SMS records for the contact phone columns. |  [optional] |
| **latestEmailEvaluations** | <!----><!---->[**Map&lt;String, MessageEvaluation&gt;**](MessageEvaluation.html)<!----> | A map of email records for the contact email columns. |  [optional] |
| **callable** | <!----><!---->**Boolean**<!----> | Indicates whether or not the contact can be called. |  [optional] |
| **phoneNumberStatus** | <!----><!---->[**Map&lt;String, PhoneNumberStatus&gt;**](PhoneNumberStatus.html)<!----> | A map of phone number columns to PhoneNumberStatuses, which indicate if the phone number is callable or not. |  [optional] |
| **contactableStatus** | <!----><!---->[**Map&lt;String, ContactableStatus&gt;**](ContactableStatus.html)<!----> | A map of media types (Voice, SMS and Email) to ContactableStatus, which indicates if the contact can be contacted using the specified media type. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Timestamp for when the contact was added. Contacts added prior to 2023 September 1 may be missing this value. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}



