---
title: DialerContact
---
## DialerContact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **contactListId** | <!----><!---->**String**<!----> | The identifier of the contact list containing this contact. |  |
| **data** | <!----><!---->**Map&lt;String, Object&gt;**<!----> | An ordered map of the contact's columns and corresponding values. |  |
| **callRecords** | <!----><!---->[**Map&lt;String, CallRecord&gt;**](CallRecord.html)<!----> | A map of call records for the contact phone columns. |  [optional] |
| **latestSmsEvaluations** | <!----><!---->[**Map&lt;String, MessageEvaluation&gt;**](MessageEvaluation.html)<!----> | A map of SMS records for the contact phone columns. |  [optional] |
| **callable** | <!----><!---->**Boolean**<!----> | Indicates whether or not the contact can be called. |  [optional] |
| **phoneNumberStatus** | <!----><!---->[**Map&lt;String, PhoneNumberStatus&gt;**](PhoneNumberStatus.html)<!----> | A map of phone number columns to PhoneNumberStatuses, which indicate if the phone number is callable or not. |  [optional] |
| **contactColumnTimeZones** | <!----><!---->[**Map&lt;String, ContactColumnTimeZone&gt;**](ContactColumnTimeZone.html)<!----> | Map containing data about the timezone the contact is mapped to. This will only be populated if the contact list has automatic timezone mapping turned on. The key is the column name. The value is the timezone it mapped to and the type of column: Phone or Zip |  [optional] |
| **configurationOverrides** | <!----><!---->[**ConfigurationOverrides**](ConfigurationOverrides.html)<!----> | the priority property within ConfigurationOverides indicates whether or not the contact to be placed in front of the queue or at the end of the queue |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



