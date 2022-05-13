---
title: PostTextMessage
---
## PostTextMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Message type |  |
| **text** | <!----><!---->**String**<!----> | Message text. If type is structured, used as fallback for clients that do not support particular structured content |  [optional] |
| **content** | <!----><!---->[**List&lt;MessageContent&gt;**](MessageContent.html)<!----> | A list of content elements in message |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| STRUCTURED | &quot;Structured&quot; | 
| RECEIPT | &quot;Receipt&quot; | 
{: class="table table-striped"}



