---
title: TextBotPromptSegment
---
## TextBotPromptSegment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | <!----><!---->**String**<!----> | The text of this prompt segment. |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The segment type which describes any semantics about the 'text' and also indicates which other field might include additional relevant info. |  |
| **format** | <!----><!---->[**Format**](Format.html)<!----> | Additional details describing the segment’s contents, which the client should honour where possible. |  [optional] |
| **content** | <!----><!---->[**List&lt;MessageContent&gt;**](MessageContent.html)<!----> | Details to display Rich Media content. This is only populated when the segment 'type' is 'Rich Media'. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TEXT | &quot;Text&quot; | 
| RICHMEDIA | &quot;RichMedia&quot; | 
{: class="table table-striped"}



