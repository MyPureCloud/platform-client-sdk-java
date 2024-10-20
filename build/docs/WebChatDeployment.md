# WebChatDeployment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **description** | **String** |  |  [optional] |
| **authenticationRequired** | **Boolean** |  |  [optional] |
| **authenticationUrl** | **String** | URL for third party service authenticating web chat clients. See https://github.com/MyPureCloud/authenticated-web-chat-server-examples |  [optional] |
| **disabled** | **Boolean** |  |  [optional] |
| **webChatConfig** | [**WebChatConfig**](WebChatConfig) |  |  [optional] |
| **allowedDomains** | **List&lt;String&gt;** |  |  [optional] |
| **flow** | [**DomainEntityRef**](DomainEntityRef) | The URI of the Inbound Chat Flow to run when new chats are initiated under this Deployment. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:212.0.0_
