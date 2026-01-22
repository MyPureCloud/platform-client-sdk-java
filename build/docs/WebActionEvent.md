# WebActionEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **action** | [**EventAction**](EventAction) | The action that triggered the event. |  |
| **actionMap** | [**ActionEventActionMap**](ActionEventActionMap) | The action map that triggered the action. |  |
| **actionTarget** | [**AddressableEntityRef**](AddressableEntityRef) | The target for engagement actions. |  |
| **timeToDisposition** | **Long** | Milliseconds elapsed until the action is disposed. |  [optional] |
| **errorCode** | **String** | Code of the error returned when the action fails. |  [optional] |
| **errorMessage** | **String** | Message of the error returned when the action fails. |  [optional] |
| **userAgentString** | **String** | HTTP User-Agent string (see https://tools.ietf.org/html/rfc1945#section-10.15). |  |
| **browser** | [**Browser**](Browser) | Customer's browser. |  |
| **device** | [**Device**](Device) | Customer's device. |  |
| **geolocation** | [**JourneyGeolocation**](JourneyGeolocation) | Customer's geolocation. |  [optional] |
| **ipAddress** | **String** | Visitor's IP address. |  [optional] |
| **ipOrganization** | **String** | Visitor's IP-based organization or ISP name. |  [optional] |
| **mktCampaign** | [**JourneyCampaign**](JourneyCampaign) | Marketing / traffic source information. |  [optional] |
| **visitReferrer** | [**Referrer**](Referrer) | Visit's referrer. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
