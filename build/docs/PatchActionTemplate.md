# PatchActionTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | Name of the action template. |  |
| **description** | **String** | Description of the action template's functionality. |  [optional] |
| **version** | **Integer** | The version of the action template. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type of action described by the action template. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Whether the action template is currently active, inactive or deleted. |  [optional] |
| **contentOffer** | [**PatchContentOffer**](PatchContentOffer) | Properties used to configure an action of type content offer |  [optional] |


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WEBCHAT | &quot;webchat&quot; | 
| WEBMESSAGINGOFFER | &quot;webMessagingOffer&quot; | 
| CONTENTOFFER | &quot;contentOffer&quot; | 
| INTEGRATIONACTION | &quot;integrationAction&quot; | 
| ARCHITECTFLOW | &quot;architectFlow&quot; | 
| OPENACTION | &quot;openAction&quot; | 


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| DELETED | &quot;Deleted&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
