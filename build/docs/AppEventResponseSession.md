---
title: AppEventResponseSession
---
## AppEventResponseSession


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **durationInSeconds** | <!----><!---->**Integer**<!----> | Indicates how long the customer has been in the app within this session. |  [optional] |
| **eventCount** | <!----><!---->**Integer**<!----> | The count of all events recorded during this session. |  [optional] |
| **screenviewCount** | <!----><!---->**Integer**<!----> | The count of all screen views recorded during this session. |  [optional] |
| **referrer** | <!----><!---->[**Referrer**](Referrer.html)<!----> | The referrer of the first event in the app session. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | Date of the session's first event, that is when the session starts. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}



