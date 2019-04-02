---
title: WebActionEvent
---
## WebActionEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**EventAction**](EventAction.html) | The action that triggered the event. |  |
| **actionMap** | [**ActionMap**](ActionMap.html) | The action map that triggered the action. |  [optional] |
| **actionTarget** | [**ActionTarget**](ActionTarget.html) | The target for engagement actions. |  [optional] |
| **timeToDisposition** | **Long** | Milliseconds elapsed until the action is disposed. |  [optional] |
| **errorCode** | **String** | Code of the error returned when the action fails. |  [optional] |
| **errorMessage** | **String** | Message of the error returned when the action fails. |  [optional] |
| **userAgentString** | **String** | HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15). |  [optional] |
| **browser** | [**Browser**](Browser.html) | Customer&#39;s browser. |  [optional] |
| **device** | [**Device**](Device.html) | Customer&#39;s device. |  [optional] |
| **geolocation** | [**JourneyGeolocation**](JourneyGeolocation.html) | Customer&#39;s geolocation. |  [optional] |
| **ipAddress** | **String** | Visitor&#39;s IP address. |  [optional] |
| **ipOrganization** | **String** | Visitor&#39;s IP-based organization or ISP name. |  [optional] |
| **mktCampaign** | [**JourneyCampaign**](JourneyCampaign.html) | Marketing / traffic source information. |  [optional] |
| **visitReferrer** | [**Referrer**](Referrer.html) | Visit&#39;s referrer. |  [optional] |
{: class="table table-striped"}



