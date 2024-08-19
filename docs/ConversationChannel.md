# ConversationChannel


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type or category of this channel. |  |
| **messageType** | [**MessageTypeEnum**](#Enum--MessageTypeEnum) | Message type for messaging conversations. |  [optional] |
| **platform** | **String** | The source provider for the conversation (e.g. Edge, PureCloud Messaging, PureCloud Email). |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| CALL | &quot;Call&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| EMAIL | &quot;Email&quot; | 
| GENERICOBJECT | &quot;GenericObject&quot; | 
| MESSAGING | &quot;Messaging&quot; | 
| SOCIAL | &quot;Social&quot; | 
| WEBCHAT | &quot;Webchat&quot; | 
| VOICE | &quot;Voice&quot; | 
| CHAT | &quot;Chat&quot; | 
| COBROWSE | &quot;Cobrowse&quot; | 
| VIDEO | &quot;Video&quot; | 
| SCREENSHARE | &quot;Screenshare&quot; | 
| MESSAGE | &quot;Message&quot; | 
{: class="table table-striped"}


## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| SMS | &quot;Sms&quot; | 
| TWITTER | &quot;Twitter&quot; | 
| FACEBOOK | &quot;Facebook&quot; | 
| LINE | &quot;Line&quot; | 
| WHATSAPP | &quot;WhatsApp&quot; | 
| WEBMESSAGING | &quot;WebMessaging&quot; | 
| OPEN | &quot;Open&quot; | 
| INSTAGRAM | &quot;Instagram&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
