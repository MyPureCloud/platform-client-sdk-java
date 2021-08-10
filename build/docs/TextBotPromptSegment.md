---
title: TextBotPromptSegment
---
## TextBotPromptSegment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **text** | <!----><!---->**String**<!----> | The text of this prompt segment. |  |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The segment type which describes any semantics about the &#39;text&#39; and also indicates which other field might include additional relevant info. |  |
| **format** | <!----><!---->[**Format**](Format.html)<!----> | Additional details describing the segment’s contents, which the client should honour where possible. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| TEXT | &quot;Text&quot; |
{: class="table table-striped"}



