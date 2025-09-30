# AppEvent


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eventName** | **String** | Represents the action the customer performed. A good event name is typically an object followed by the action performed in past tense (e.g. screen_viewed, order_completed, user_registered). |  |
| **screenName** | **String** | The name of the screen in the app that the event took place. |  |
| **app** | [**JourneyApp**](JourneyApp) | Application that the customer is interacting with. |  |
| **device** | [**Device**](Device) | Customer's device. |  |
| **ipAddress** | **String** | Customer's IP address. May be null if the business configures the tracker to not collect IP addresses. |  [optional] |
| **ipOrganization** | **String** | Customer's IP-based organization or ISP name. |  [optional] |
| **geolocation** | [**JourneyGeolocation**](JourneyGeolocation) | Customer's geolocation. |  [optional] |
| **sdkLibrary** | [**SdkLibrary**](SdkLibrary) | SDK library used to generate the event. |  [optional] |
| **networkConnectivity** | [**NetworkConnectivity**](NetworkConnectivity) | Information relating to the device's network connectivity. |  [optional] |
| **mktCampaign** | [**JourneyCampaign**](JourneyCampaign) | Marketing / traffic source information. |  [optional] |
| **searchQuery** | **String** | Represents the keywords in a customer search query. |  [optional] |
| **attributes** | [**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute) | User-defined attributes associated with a particular event. |  |
| **traits** | [**Map&lt;String, CustomEventAttribute&gt;**](CustomEventAttribute) | Traits are attributes intrinsic to the customer that may be sent in selected events. Examples are email, givenName, cellPhone. |  |




_com.mypurecloud.sdk.v2:platform-client-v2:233.0.0_
