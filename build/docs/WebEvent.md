---
title: WebEvent
---
## WebEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventName** | **String** | Represents the action the customer performed. A good event name is typically an object followed by the action performed in past tense (e.g. page_viewed, order_completed, user_registered). |  |
| **totalEventCount** | **Integer** | The total count of events performed by the customer across all sessions. |  [optional] |
| **totalPageviewCount** | **Integer** | The total count of pageviews performed by the customer across all sessions. |  [optional] |
| **page** | [**JourneyPage**](JourneyPage.html) | The webpage where the user interaction occurred. |  [optional] |
| **userAgentString** | **String** | HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15). |  [optional] |
| **browser** | [**Browser**](Browser.html) | Customer&#39;s browser. |  [optional] |
| **device** | [**Device**](Device.html) | Customer&#39;s device. |  [optional] |
| **geolocation** | [**JourneyGeolocation**](JourneyGeolocation.html) | Customer&#39;s geolocation. |  [optional] |
| **ipAddress** | **String** | Customer&#39;s IP address. May be null if the business configures the tracker to not collect IP addresses. |  [optional] |
| **ipOrganization** | **String** | Customer&#39;s IP-based organization or ISP name. |  [optional] |
| **mktCampaign** | [**JourneyCampaign**](JourneyCampaign.html) | Marketing / traffic source information. |  [optional] |
| **referrer** | [**Referrer**](Referrer.html) | Identifies the page URL that originally generated the request for the current page being viewed. |  [optional] |
| **attributes** | [**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute.html) | User-defined attributes associated with a particular event. |  [optional] |
{: class="table table-striped"}



