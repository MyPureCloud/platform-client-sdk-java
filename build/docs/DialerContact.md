---
title: DialerContact
---
## DialerContact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **contactListId** | **String** | Identifier of the contact list containing this contact |  |
| **data** | **Map&lt;String, Object&gt;** | An ordered map of the contact&#39;s data attributes and values |  [optional] |
| **callRecords** | [**Map&lt;String, CallRecord&gt;**](CallRecord.html) | A map of call records for the contact phone columns |  [optional] |
| **callable** | **Boolean** | false if the contact is not to be called |  [optional] |
| **phoneNumberStatus** | [**Map&lt;String, PhoneNumberStatus&gt;**](PhoneNumberStatus.html) | A map of statuses for the contact phone columns |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


