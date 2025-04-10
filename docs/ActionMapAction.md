# ActionMapAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **actionTemplate** | [**ActionMapActionTemplate**](ActionMapActionTemplate) | Action template associated with the action map. |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type of action. |  [optional] |
| **actionTargetId** | **String** | Action target ID. |  [optional] |
| **isPacingEnabled** | **Boolean** | Whether this action should be throttled. |  [optional] |
| **props** | [**ActionProperties**](ActionProperties) | Additional properties. |  [optional] |
| **architectFlowFields** | [**ArchitectFlowFields**](ArchitectFlowFields) | Architect Flow Id and input contract. |  [optional] |
| **webMessagingOfferFields** | [**WebMessagingOfferFields**](WebMessagingOfferFields) | Admin-configurable fields of a web messaging offer action. |  [optional] |
| **openActionFields** | [**OpenActionFields**](OpenActionFields) | Admin-configurable fields of an open action. |  [optional] |


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




_com.mypurecloud.sdk.v2:platform-client-v2:223.0.0_
