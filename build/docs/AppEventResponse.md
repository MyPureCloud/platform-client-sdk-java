# AppEventResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | System-generated UUID for the event. |  |
| **customerId** | **String** | Identifier of the customer in the source of the event. |  |
| **customerIdType** | **String** | Type of identifier for the customer ID (cookie, email etc.). |  |
| **eventName** | **String** | Represents the action the customer performed. A good event name is typically an object followed by the action performed in past tense (e.g. screen_viewed, order_completed, user_registered). |  |
| **screenName** | **String** | The name of the screen in the app that the event took place. |  |
| **app** | [**JourneyApp**](JourneyApp) | Application that the customer is interacting with. |  |
| **device** | [**Device**](Device) | Customer's device. |  |
| **ipOrganization** | **String** | Customer's IP-based organization or ISP name. |  [optional] |
| **geolocation** | [**JourneyGeolocation**](JourneyGeolocation) | Customer's geolocation. |  [optional] |
| **sdkLibrary** | [**SdkLibrary**](SdkLibrary) | SDK library used to generate the event. |  [optional] |
| **networkConnectivity** | [**NetworkConnectivity**](NetworkConnectivity) | Information relating to the device's network connectivity. |  [optional] |
| **mktCampaign** | [**JourneyCampaign**](JourneyCampaign) | Marketing / traffic source information. |  [optional] |
| **session** | [**AppEventResponseSession**](AppEventResponseSession) | The app session the event belongs to. |  |
| **searchQuery** | **String** | Represents the keywords in a customer search query. |  [optional] |
| **attributes** | [**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute) | User-defined attributes associated with a particular event. |  |
| **traits** | [**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute) | Traits are attributes intrinsic to the customer that may be sent in selected events (e.g. email, givenName, cellPhone). |  |
| **createdDate** | [**Date**](Date) | UTC timestamp indicating when the event actually took place. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |




_com.mypurecloud.sdk.v2:platform-client-v2:238.0.0_
