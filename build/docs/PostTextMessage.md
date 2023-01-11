---
title: PostTextMessage
---
## PostTextMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Message type |  |
| **text** | <!----><!---->**String**<!----> | Message text. If type is structured, used as fallback for clients that do not support particular structured content |  [optional] |
| **content** | <!----><!---->[**List&lt;ConversationMessageContent&gt;**](ConversationMessageContent.html)<!----> | A list of content elements in message |  [optional] |
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
| MESSAGE | &quot;Message&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



