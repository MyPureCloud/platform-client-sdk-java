# PatchAction


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) | Media type of action. |  |
| **actionTemplate** | [**ActionMapActionTemplate**](ActionMapActionTemplate) | Action template associated with the action map. |  [optional] |
| **actionTargetId** | **String** | Action target ID. |  [optional] |
| **isPacingEnabled** | **Boolean** | Whether this action should be throttled. |  [optional] |
| **props** | [**PatchActionProperties**](PatchActionProperties) | Additional properties. |  [optional] |
| **architectFlowFields** | [**ArchitectFlowFields**](ArchitectFlowFields) | Architect Flow Id and input contract. |  [optional] |
| **webMessagingOfferFields** | [**PatchWebMessagingOfferFields**](PatchWebMessagingOfferFields) | Admin-configurable fields of a web messaging offer action. |  [optional] |
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




_com.mypurecloud.sdk.v2:platform-client-v2:218.0.0_
