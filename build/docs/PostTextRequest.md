# PostTextRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **botId** | **String** | ID of the bot to send the text to. |  |
| **botAlias** | **String** | Alias/Version of the bot |  [optional] |
| **integrationId** | **String** | the integration service id for the bot's credentials |  |
| **botSessionId** | **String** | GUID for this bot's session |  |
| **postTextMessage** | [**PostTextMessage**](PostTextMessage) | Message to send to the bot |  |
| **languageCode** | **String** | The launguage code the bot will run under |  [optional] |
| **botSessionTimeoutMinutes** | **Integer** | Override timeout for the bot session. This should be greater than 10 minutes. |  [optional] |
| **botChannels** | [**List<BotChannelsEnum>**](#Enum--BotChannelsEnum) | The channels this bot is utilizing |  [optional] |
| **botCorrelationId** | **String** | Id for tracking the activity - this will be returned in the response |  [optional] |
| **messagingPlatformType** | [**MessagingPlatformTypeEnum**](#Enum--MessagingPlatformTypeEnum) | If the channels list contains a 'Messaging' item and the messaging platform is known, include it here to get accurate analytics |  [optional] |
| **amazonLexRequest** | [**AmazonLexRequest**](AmazonLexRequest) | Provider specific settings, if any |  [optional] |
| **googleDialogflow** | [**GoogleDialogflowCustomSettings**](GoogleDialogflowCustomSettings) | Provider specific settings, if any |  [optional] |
| **genesysBotConnector** | [**GenesysBotConnector**](GenesysBotConnector) | Provider specific settings, if any |  [optional] |
| **nuanceMixDlg** | [**NuanceMixDlgSettings**](NuanceMixDlgSettings) | Provider specific settings, if any |  [optional] |


## Enum: BotChannelsEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| CALL | &quot;Call&quot; |
| CALLBACK | &quot;Callback&quot; |
| MESSAGING | &quot;Messaging&quot; |
| WEBCHAT | &quot;Webchat&quot; |


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




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
