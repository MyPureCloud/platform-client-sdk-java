# DefaultObjective


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **templateId** | **String** | The id of this objective's base template |  [optional] |
| **zones** | [**List&lt;ObjectiveZone&gt;**](ObjectiveZone) | Objective zone specifies min,max points and values for the associated metric |  [optional] |
| **enabled** | **Boolean** | A flag for whether this objective is enabled for the related metric |  [optional] |
| **mediaTypes** | [**List<MediaTypesEnum>**](#Enum--MediaTypesEnum) | A list of media types for the metric |  [optional] |
| **queues** | [**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef) | A list of queues for the metric |  [optional] |
| **topics** | [**List&lt;AddressableEntityRef&gt;**](AddressableEntityRef) | A list of topic ids for detected topic metrics |  [optional] |
| **topicIdsFilterType** | [**TopicIdsFilterTypeEnum**](#Enum--TopicIdsFilterTypeEnum) | A filter type for topic Ids. It's only used for objectives with topicIds. Default filter behavior is \"or\". |  [optional] |
| **evaluationFormContextIds** | **List&lt;String&gt;** | The ids of associated evaluation form context, for Quality Evaluation Score metrics |  [optional] |
| **initialDirection** | [**InitialDirectionEnum**](#Enum--InitialDirectionEnum) | The initial direction to filter on |  [optional] |


## Enum: MediaTypesEnum

| Name | Value |
| ---- | ----- |
| CALLBACK | &quot;callback&quot; |
| CHAT | &quot;chat&quot; |
| COBROWSE | &quot;cobrowse&quot; |
| EMAIL | &quot;email&quot; |
| INTERNALMESSAGE | &quot;internalmessage&quot; |
| MESSAGE | &quot;message&quot; |
| SCREENSHARE | &quot;screenshare&quot; |
| UNKNOWN | &quot;unknown&quot; |
| VIDEO | &quot;video&quot; |
| VOICE | &quot;voice&quot; |


## Enum: TopicIdsFilterTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AND | &quot;and&quot; | 
| OR | &quot;or&quot; | 


## Enum: InitialDirectionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| INBOUND | &quot;inbound&quot; | 
| OUTBOUND | &quot;outbound&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
