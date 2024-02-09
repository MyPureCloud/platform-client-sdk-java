---
title: AppEventRequest
---
## AppEventRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventName** | <!----><!---->**String**<!----> | Represents the action the customer performed. Event types are created for each unique event name and can be faceted on in segment and outcome conditions. A valid event name must only contain alphanumeric characters and underscores. A good event name is typically an object followed by the action performed in past tense, e.g. screen_viewed, search_performed, user_registered. |  |
| **screenName** | <!----><!---->**String**<!----> | The name of the screen, view, or fragment in the app where the event took place. |  |
| **app** | <!----><!---->[**JourneyApp**](JourneyApp.html)<!----> | Application that the customer is interacting with. |  |
| **device** | <!----><!---->[**RequestDevice**](RequestDevice.html)<!----> | Customer's device. |  |
| **sdkLibrary** | <!----><!---->[**SdkLibrary**](SdkLibrary.html)<!----> | SDK library used to generate the event. |  [optional] |
| **networkConnectivity** | <!----><!---->[**NetworkConnectivity**](NetworkConnectivity.html)<!----> | Information relating to the device's network connectivity. |  [optional] |
| **referrerUrl** | <!----><!---->**String**<!----> | The referrer URL of the first event in the app session. |  [optional] |
| **searchQuery** | <!----><!---->**String**<!----> | Represents the keywords in a customer search query. |  [optional] |
| **attributes** | <!----><!---->[**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute.html)<!----> | User-defined attributes associated with a particular event. These attributes provide additional context about the event. For example, items_in_cart or subscription_level. |  [optional] |
| **traits** | <!----><!---->[**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute.html)<!----> | Traits are attributes intrinsic to the customer that may be sent in selected events, (e.g. email, lastName, cellPhone). Traits are used to collect information for identity resolution. For example, the same person might be using an application on different devices which might create two sessions with different customerIds. Additional information can be provided as traits to help link those two sessions and customers to a single external contact through common identifiers that were submitted via a form fill, message, or other input in both sessions. |  [optional] |
| **customerCookieId** | <!----><!---->**String**<!----> | Cookie ID of the customer associated with the app event. This is expected to be set per application install or device and can be used to identify a single customer across multiple sessions. This identifier, along with others passed as traits, is used for identity resolution. |  |
| **createdDate** | <!----><!---->[**Date**](Date.html)<!----> | UTC timestamp indicating when the event actually took place, events older than an hour will be rejected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
{: class="table table-striped"}



