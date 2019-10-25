---
title: TimeZoneMappingPreview
---
## TimeZoneMappingPreview


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contactList** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The associated ContactList |  [optional] |
| **contactsPerTimeZone** | <!----><!---->**Map&lt;String, Long&gt;**<!----> | The number of contacts per time zone that mapped to only that time zone |  [optional] |
| **contactsMappedUsingZipCode** | <!----><!---->**Map&lt;String, Long&gt;**<!----> | The number of contacts per time zone that mapped to only that time zone and were mapped using the zip code column |  [optional] |
| **contactsMappedToASingleZone** | <!----><!---->**Long**<!----> | The total number of contacts that mapped to a single time zone |  [optional] |
| **contactsMappedToASingleZoneUsingZipCode** | <!----><!---->**Long**<!----> | The total number of contacts that mapped to a single time zone and were mapped using the zip code column |  [optional] |
| **contactsMappedToMultipleZones** | <!----><!---->**Long**<!----> | The total number of contacts that mapped to multiple time zones |  [optional] |
| **contactsMappedToMultipleZonesUsingZipCode** | <!----><!---->**Long**<!----> | The total number of contacts that mapped to multiple time zones and were mapped using the zip code column |  [optional] |
| **contactsInDefaultWindow** | <!----><!---->**Long**<!----> | The total number of contacts that will be dialed during the default window |  [optional] |
| **contactListSize** | <!----><!---->**Long**<!----> | The total number of contacts in the contact list |  [optional] |
{: class="table table-striped"}



