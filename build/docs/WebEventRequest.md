# WebEventRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **customerCookieId** | **String** | A UUID representing the customer making the request. |  |
| **eventName** | **String** | Represents the action the customer performed. Event types are created for each unique event name and can be faceted on in segment and outcome conditions. A valid event name must only contain alphanumeric characters and underscores. A good event name is typically an object followed by the action performed in past tense, e.g. page_viewed, order_completed, user_registered. |  |
| **page** | [**RequestPage**](RequestPage) | The webpage where the user interaction occurred. |  |
| **userAgentString** | **String** | Override for HTTP User-Agent string from request header (see https://tools.ietf.org/html/rfc1945#section-10.15). |  [optional] |
| **browser** | [**WebEventBrowser**](WebEventBrowser) | Customer's browser. |  [optional] |
| **device** | [**WebEventDevice**](WebEventDevice) | Customer's device. |  [optional] |
| **searchQuery** | **String** | Represents the keywords in a customer search query. |  [optional] |
| **ipAddress** | **String** | Customer's IP address. |  [optional] |
| **referrerUrl** | **String** | Identifies the referrer URL that originally generated the request for the current page being viewed. |  [optional] |
| **attributes** | [**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute) | User-defined attributes associated with a particular event. These attributes provide additional context about the event. For example, items_in_cart or subscription_level. |  [optional] |
| **traits** | [**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute) | Traits are attributes intrinsic to the customer that may be sent in selected events, e.g. email, givenName, cellPhone. Traits are used to collect information for identity resolution. For example, the same person might be using an application on different devices which might create two sessions with different customerIds. Additional information can be provided as traits to help link those two sessions and customers to a single external contact through common identifiers that were submitted via a form fill, message, or other input in both sessions. |  [optional] |
| **createdDate** | [**Date**](Date) | UTC timestamp indicating when the event actually took place, events older than an hour will be rejected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
