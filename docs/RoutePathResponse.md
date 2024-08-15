# RoutePathResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueReference**](QueueReference) | The ID of the queue associated with the route path |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type of the given queue associated with the route path |  [optional] |
| **language** | [**LanguageReference**](LanguageReference) | The ID of the language associated with the route path |  [optional] |
| **skills** | [**List&lt;RoutingSkillReference&gt;**](RoutingSkillReference) | The set of skills associated with the route path |  [optional] |
{: class="table table-striped"}


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



