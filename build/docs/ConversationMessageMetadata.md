---
title: ConversationMessageMetadata
---
## ConversationMessageMetadata


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Message type. |  [optional] |
| **events** | <!----><!---->[**List&lt;ConversationMessageMetadataEvent&gt;**](ConversationMessageMetadataEvent.html)<!----> | List of events metadata |  [optional] |
| **content** | <!----><!---->[**List&lt;ConversationMessageMetadataContent&gt;**](ConversationMessageMetadataContent.html)<!----> | List of message content |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| STRUCTURED | &quot;Structured&quot; | 
| RECEIPT | &quot;Receipt&quot; | 
| EVENT | &quot;Event&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



