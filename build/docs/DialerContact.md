---
title: DialerContact
---
## DialerContact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **contactListId** | **String** | The identifier of the contact list containing this contact. |  |
| **data** | **Map&lt;String, Object&gt;** | An ordered map of the contact&#39;s columns and corresponding values. |  |
| **callRecords** | [**Map&lt;String, CallRecord&gt;**](CallRecord.html) | A map of call records for the contact phone columns. |  [optional] |
| **callable** | **Boolean** | Indicates whether or not the contact can be called. |  [optional] |
| **phoneNumberStatus** | [**Map&lt;String, PhoneNumberStatus&gt;**](PhoneNumberStatus.html) | A map of phone number columns to PhoneNumberStatuses, which indicate if the phone number is callable or not. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


