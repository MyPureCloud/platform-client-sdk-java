# RoutePathResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **queue** | [**QueueReference**](QueueReference) | The ID of the queue associated with the route path |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | The media type of the given queue associated with the route path |  [optional] |
| **language** | [**LanguageReference**](LanguageReference) | The ID of the language associated with the route path |  [optional] |
| **skills** | [**List&lt;RoutingSkillReference&gt;**](RoutingSkillReference) | The set of skills associated with the route path |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VOICE | &quot;Voice&quot; | 
| CHAT | &quot;Chat&quot; | 
| EMAIL | &quot;Email&quot; | 
| CALLBACK | &quot;Callback&quot; | 
| MESSAGE | &quot;Message&quot; | 
| WORKITEM | &quot;Workitem&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:240.0.0_
