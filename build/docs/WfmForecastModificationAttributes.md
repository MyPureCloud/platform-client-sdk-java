---
title: WfmForecastModificationAttributes
---
## WfmForecastModificationAttributes


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queues** | <!----><!---->[**List&lt;QueueReference&gt;**](QueueReference.html)<!----> | The queues to which to apply a modification |  [optional] |
| **mediaTypes** | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!----> | The media types to which to apply a modification |  [optional] |
| **languages** | <!----><!---->[**List&lt;LanguageReference&gt;**](LanguageReference.html)<!----> | The languages to which to apply a modification |  [optional] |
| **skillSets** | <!----><!---->[**List&lt;List&lt;RoutingSkillReference&gt;&gt;**](List.html)<!----> | The skill sets to which to apply a modification |  [optional] |
{: class="table table-striped"}


<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| VOICE | &quot;Voice&quot; |
| CHAT | &quot;Chat&quot; |
| EMAIL | &quot;Email&quot; |
| CALLBACK | &quot;Callback&quot; |
| MESSAGE | &quot;Message&quot; |
{: class="table table-striped"}



