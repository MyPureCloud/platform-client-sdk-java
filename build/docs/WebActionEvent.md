---
title: WebActionEvent
---
## WebActionEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | <!----><!---->[**EventAction**](EventAction.html)<!----> | The action that triggered the event. |  |
| **actionMap** | <!----><!---->[**ActionEventActionMap**](ActionEventActionMap.html)<!----> | The action map that triggered the action. |  |
| **actionTarget** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | The target for engagement actions. |  |
| **timeToDisposition** | <!----><!---->**Long**<!----> | Milliseconds elapsed until the action is disposed. |  [optional] |
| **errorCode** | <!----><!---->**String**<!----> | Code of the error returned when the action fails. |  [optional] |
| **errorMessage** | <!----><!---->**String**<!----> | Message of the error returned when the action fails. |  [optional] |
| **userAgentString** | <!----><!---->**String**<!----> | HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15). |  |
| **browser** | <!----><!---->[**Browser**](Browser.html)<!----> | Customer's browser. |  |
| **device** | <!----><!---->[**Device**](Device.html)<!----> | Customer's device. |  |
| **geolocation** | <!----><!---->[**JourneyGeolocation**](JourneyGeolocation.html)<!----> | Customer's geolocation. |  [optional] |
| **ipAddress** | <!----><!---->**String**<!----> | Visitor's IP address. |  [optional] |
| **ipOrganization** | <!----><!---->**String**<!----> | Visitor's IP-based organization or ISP name. |  [optional] |
| **mktCampaign** | <!----><!---->[**JourneyCampaign**](JourneyCampaign.html)<!----> | Marketing / traffic source information. |  [optional] |
| **visitReferrer** | <!----><!---->[**Referrer**](Referrer.html)<!----> | Visit's referrer. |  [optional] |
{: class="table table-striped"}



