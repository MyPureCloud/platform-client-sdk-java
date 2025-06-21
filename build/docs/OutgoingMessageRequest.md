# OutgoingMessageRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **botId** | **String** | The unique id of the bot. |  |
| **botVersion** | **String** | The version of the bot. |  |
| **botSessionId** | **String** | The id of the session. This id will be used for an entire conversation with the bot (a series of back and forth between the bot until the bot has fulfilled its intent). |  |
| **botState** | [**BotStateEnum**](#Enum--BotStateEnum) | The state of the bot reported |  |
| **languageCode** | **String** | The language used for this message. EG 'en-us' or 'es', etc; These language codes are W3C language identification tags (ISO 639-1 for the language name and ISO 3166 for the country code). |  |
| **replyMessages** | [**List&lt;ReplyMessage&gt;**](ReplyMessage) | This is a list of messages to send back to the user, this field can be null or an empty list. |  [optional] |
| **intent** | **String** | The name of the intent the bot is either processing or has processed, this will be blank if no intent could be detected. |  [optional] |
| **confidence** | **Double** | A value between 0 and 1.0 denoting the confidence of the discovered intent (if found) this is optional and if left null genesys assumes a confidence of 1.0 on success and 0 on fail. |  [optional] |
| **errorInfo** | [**ErrorInfo**](ErrorInfo) | If the botState is Failed the bot can add this error object with more details about the error. |  [optional] |
| **parameters** | **Map&lt;String, String&gt;** | This is a map of string-string key, value pairs containing optional fields that can be passed from the bot for custom behavior, tracking, etc, which can be used by the flow. |  [optional] |
| **entities** | [**List&lt;BotEntityValue&gt;**](BotEntityValue) | A set of entity values that go along with the intent. |  [optional] |


## Enum: BotStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| COMPLETE | &quot;Complete&quot; | 
| FAILED | &quot;Failed&quot; | 
| MOREDATA | &quot;MoreData&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:227.0.0_
