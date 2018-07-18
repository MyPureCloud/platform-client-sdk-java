---
title: RouteGroupAttributes
---
## RouteGroupAttributes


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueReference**](QueueReference.html) | The queue to which the associated route group applies |  |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) | The media type to which the associated route group applies |  |
| **language** | [**LanguageReference**](LanguageReference.html) | The language to which the associated route group applies |  [optional] |
| **skills** | [**List&lt;RoutingSkillReference&gt;**](RoutingSkillReference.html) | The skill set to which the associated route group applies |  [optional] |
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| VOICE | &quot;Voice&quot; |
| CHAT | &quot;Chat&quot; |
| EMAIL | &quot;Email&quot; |
| CALLBACK | &quot;Callback&quot; |
| MESSAGE | &quot;Message&quot; |
{: class="table table-striped"}


