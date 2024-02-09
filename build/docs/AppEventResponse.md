---
title: AppEventResponse
---
## AppEventResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | System-generated UUID for the event. |  |
| **customerId** | <!----><!---->**String**<!----> | Identifier of the customer in the source of the event. |  |
| **customerIdType** | <!----><!---->**String**<!----> | Type of identifier for the customer ID (cookie, email etc.). |  |
| **eventName** | <!----><!---->**String**<!----> | Represents the action the customer performed. A good event name is typically an object followed by the action performed in past tense (e.g. screen_viewed, order_completed, user_registered). |  |
| **screenName** | <!----><!---->**String**<!----> | The name of the screen in the app that the event took place. |  |
| **app** | <!----><!---->[**JourneyApp**](JourneyApp.html)<!----> | Application that the customer is interacting with. |  |
| **device** | <!----><!---->[**Device**](Device.html)<!----> | Customer's device. |  |
| **ipOrganization** | <!----><!---->**String**<!----> | Customer's IP-based organization or ISP name. |  [optional] |
| **geolocation** | <!----><!---->[**JourneyGeolocation**](JourneyGeolocation.html)<!----> | Customer's geolocation. |  [optional] |
| **sdkLibrary** | <!----><!---->[**SdkLibrary**](SdkLibrary.html)<!----> | SDK library used to generate the event. |  [optional] |
| **networkConnectivity** | <!----><!---->[**NetworkConnectivity**](NetworkConnectivity.html)<!----> | Information relating to the device's network connectivity. |  [optional] |
| **mktCampaign** | <!----><!---->[**JourneyCampaign**](JourneyCampaign.html)<!----> | Marketing / traffic source information. |  [optional] |
| **session** | <!----><!---->[**AppEventResponseSession**](AppEventResponseSession.html)<!----> | The app session the event belongs to. |  |
| **searchQuery** | <!----><!---->**String**<!----> | Represents the keywords in a customer search query. |  [optional] |
| **attributes** | <!----><!---->[**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute.html)<!----> | User-defined attributes associated with a particular event. |  |
| **traits** | <!----><!---->[**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute.html)<!----> | Traits are attributes intrinsic to the customer that may be sent in selected events (e.g. email, name, phone). |  |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | UTC timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
{: class="table table-striped"}



