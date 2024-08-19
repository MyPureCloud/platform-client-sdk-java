# WebChatRoutingTarget


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **targetType** | [**TargetTypeEnum**](#Enum--TargetTypeEnum) | The target type of the routing target, such as 'QUEUE'. |  |
| **targetAddress** | **String** | The target of the route, in the format appropriate given the 'targetType'. |  |
| **skills** | **List&lt;String&gt;** | The list of skill names to use for routing. |  [optional] |
| **language** | **String** | The language name to use for routing. |  [optional] |
| **priority** | **Long** | The priority to assign to the conversation for routing. |  [optional] |
{: class="table table-striped"}


## Enum: TargetTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| QUEUE | &quot;QUEUE&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
