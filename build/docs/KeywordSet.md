---
title: KeywordSet
---
## KeywordSet


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **queues** | <!----><!---->[**List&lt;Queue&gt;**](Queue.html)<!----> |  |  [optional] |
| **language** | <!----><!---->**String**<!----> | Language code, such as &#39;en-US&#39; |  |
| **agents** | <!----><!---->[**List&lt;User&gt;**](User.html)<!----> |  |  [optional] |
| **keywords** | <!----><!---->[**List&lt;Keyword&gt;**](Keyword.html)<!----> | The list of keywords to be used for keyword spotting. |  |
| **participantPurposes** | <!---->[**List&lt;ParticipantPurposesEnum&gt;**](#ParticipantPurposesEnum)<!----> | The types of participants to use keyword spotting on. |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ParticipantPurposesEnum"></a>

## Enum: ParticipantPurposesEnum

| Name | Value |
| ---- | ----- |
| AGENT | &quot;AGENT&quot; |
| CUSTOMER | &quot;CUSTOMER&quot; |
{: class="table table-striped"}



