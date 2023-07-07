---
title: DialerCampaignProgressEventCampaignProgress
---
## DialerCampaignProgressEventCampaignProgress


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **campaign** | <!----><!---->[**DialerCampaignProgressEventUriReference**](DialerCampaignProgressEventUriReference.html)<!----> |  |  [optional] |
| **numberOfContactsCalled** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> | The number of contacts that have been called so far |  [optional] |
| **numberOfContactsMessaged** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> | The number of contacts that have been messaged so far |  [optional] |
| **totalNumberOfContacts** | <!----><!---->[**BigDecimal**](BigDecimal.html)<!----> | The total number of contacts in the contact list |  [optional] |
| **percentage** | <!----><!---->**Integer**<!----> | numberOfContactsContacted/totalNumberOfContacts*100 |  [optional] |
| **numberOfContactsSkipped** | <!----><!---->**Map&lt;String, Integer&gt;**<!----> | A map of skipped reasons and the number of contacts associated with each. |  [optional] |
| **additionalProperties** | <!----><!---->**Map&lt;String, Object&gt;**<!----> |  |  [optional] |
{: class="table table-striped"}



