# ConversationMessageMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | Message type. |  [optional] |
| **events** | [**List&lt;ConversationMessageMetadataEvent&gt;**](ConversationMessageMetadataEvent) | List of events metadata |  [optional] |
| **content** | [**List&lt;ConversationMessageMetadataContent&gt;**](ConversationMessageMetadataContent) | List of message content |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
