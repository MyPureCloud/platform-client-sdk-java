---
title: DefaultObjective
---
## DefaultObjective


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **templateId** | <!----><!---->**String**<!----> | The id of this objective&#39;s base template |  [optional] |
| **zones** | <!----><!---->[**List&lt;ObjectiveZone&gt;**](ObjectiveZone.html)<!----> | Objective zone specifies min,max points and values for the associated metric |  [optional] |
| **enabled** | <!----><!---->**Boolean**<!----> | A flag for whether this objective is enabled for the related metric |  [optional] |
| **mediaTypes** | <!---->[**List&lt;MediaTypesEnum&gt;**](#MediaTypesEnum)<!----> | A list of media types for the metric |  [optional] |
| **queues** | <!----><!---->[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.html)<!----> | A list of queues for the metric |  [optional] |
| **topics** | <!----><!---->[**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef.html)<!----> | A list of topic ids for detected topic metrics |  [optional] |
| **topicIdsFilterType** | [**TopicIdsFilterTypeEnum**](#TopicIdsFilterTypeEnum)<!----> | A filter type for topic Ids. It&#39;s only used for objectives with topicIds. Default filter behavior is \&quot;or\&quot;. |  [optional] |
{: class="table table-striped"}


<a name="MediaTypesEnum"></a>

## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| CALLBACK | &quot;callback&quot; |
| CHAT | &quot;chat&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| EMAIL | &quot;email&quot; |
| MESSAGE | &quot;message&quot; |
| SCREENSHARE | &quot;screenshare&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIDEO | &quot;video&quot; |
| VOICE | &quot;voice&quot; |
{: class="table table-striped"}


<a name="TopicIdsFilterTypeEnum"></a>

## Enum: TopicIdsFilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| AND | &quot;and&quot; |
| OR | &quot;or&quot; |
{: class="table table-striped"}



