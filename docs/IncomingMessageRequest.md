# IncomingMessageRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **botId** | **String** | The unique id of the bot. |  |
| **botName** | **String** | Name of the bot |  |
| **botVersion** | **String** | The version of the bot. |  |
| **integrationId** | **String** | The Integration Id for the bot's configuration |  |
| **botSessionId** | **String** | The id of the session. This id will be used for an entire conversation with the bot (a series of back and forth between the bot until the bot has fulfilled its intent). |  |
| **automateFlowExecId** | **String** | Execution ID of the Automate Flow. |  |
| **conversationId** | **String** | Genesys conversation ID. |  |
| **languageCode** | **String** | Language code for the conversation (e.g., 'en-US'). |  |
| **inputMessage** | [**InputMessage**](InputMessage) | Message received from the user to send to the bot |  |
| **messagingPlatformType** | [**MessagingPlatformTypeEnum**](#Enum--MessagingPlatformTypeEnum) | Type of messaging platform being used |  |
| **channels** | [**List<ChannelsEnum>**](#Enum--ChannelsEnum) | The channels this bot is utilizing. |  |
| **botSessionTimeout** | **Integer** | Timeout duration for bot session in minutes. |  [optional] |
| **parameters** | **Map&lt;String, String&gt;** | This is a map of string-string key, value pairs containing optional fields that can be passed to the bot for custom behavior, tracking, etc. |  [optional] |


## Enum: MessagingPlatformTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PHONE | &quot;Phone&quot; | 
| SMS | &quot;SMS&quot; | 
| GENESYSWEBWIDGET | &quot;GenesysWebWidget&quot; | 
| FACEBOOKMESSENGER | &quot;FacebookMessenger&quot; | 
| WECHAT | &quot;WeChat&quot; | 
| WHATSAPP | &quot;Whatsapp&quot; | 
| APPLEBUSINESSCHAT | &quot;AppleBusinessChat&quot; | 
| APPLE | &quot;Apple&quot; | 
| TELEGRAM | &quot;Telegram&quot; | 
| SLACK | &quot;Slack&quot; | 
| SIGNAL | &quot;Signal&quot; | 
| LINE | &quot;Line&quot; | 
| DISCORD | &quot;Discord&quot; | 
| TWITTERDIRECTMESSAGE | &quot;TwitterDirectMessage&quot; | 
| OPEN | &quot;Open&quot; | 
| INSTAGRAM | &quot;Instagram&quot; | 
| OTHER | &quot;Other&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 


## Enum: ChannelsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALL | &quot;Call&quot; |
| CALLBACK | &quot;Callback&quot; |
| MESSAGING | &quot;Messaging&quot; |
| WEBCHAT | &quot;Webchat&quot; |




_com.mypurecloud.sdk.v2:platform-client-v2:241.0.0_
