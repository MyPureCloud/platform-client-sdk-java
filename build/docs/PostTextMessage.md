# PostTextMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Message type |  |
| **text** | **String** | Message text. If type is structured, used as fallback for clients that do not support particular structured content |  [optional] |
| **content** | [**List&lt;ConversationMessageContent&gt;**](ConversationMessageContent) | A list of content elements in message |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| STRUCTURED | &quot;Structured&quot; | 
| RECEIPT | &quot;Receipt&quot; | 
| EVENT | &quot;Event&quot; | 
| MESSAGE | &quot;Message&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:239.0.0_
