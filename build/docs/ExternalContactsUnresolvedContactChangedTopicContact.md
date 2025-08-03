# ExternalContactsUnresolvedContactChangedTopicContact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **division** | [**ExternalContactsUnresolvedContactChangedTopicDivision**](ExternalContactsUnresolvedContactChangedTopicDivision) |  |  [optional] |
| **externalOrganization** | [**ExternalContactsUnresolvedContactChangedTopicExternalOrganization**](ExternalContactsUnresolvedContactChangedTopicExternalOrganization) |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **firstName** | **String** |  |  [optional] |
| **middleName** | **String** |  |  [optional] |
| **lastName** | **String** |  |  [optional] |
| **salutation** | **String** |  |  [optional] |
| **title** | **String** |  |  [optional] |
| **workPhone** | [**ExternalContactsUnresolvedContactChangedTopicPhoneNumber**](ExternalContactsUnresolvedContactChangedTopicPhoneNumber) |  |  [optional] |
| **cellPhone** | [**ExternalContactsUnresolvedContactChangedTopicPhoneNumber**](ExternalContactsUnresolvedContactChangedTopicPhoneNumber) |  |  [optional] |
| **homePhone** | [**ExternalContactsUnresolvedContactChangedTopicPhoneNumber**](ExternalContactsUnresolvedContactChangedTopicPhoneNumber) |  |  [optional] |
| **otherPhone** | [**ExternalContactsUnresolvedContactChangedTopicPhoneNumber**](ExternalContactsUnresolvedContactChangedTopicPhoneNumber) |  |  [optional] |
| **workEmail** | **String** |  |  [optional] |
| **personalEmail** | **String** |  |  [optional] |
| **otherEmail** | **String** |  |  [optional] |
| **address** | [**ExternalContactsUnresolvedContactChangedTopicContactAddress**](ExternalContactsUnresolvedContactChangedTopicContactAddress) |  |  [optional] |
| **surveyOptOut** | **Boolean** |  |  [optional] |
| **externalSystemUrl** | **String** |  |  [optional] |
| **twitterId** | [**ExternalContactsUnresolvedContactChangedTopicTwitterId**](ExternalContactsUnresolvedContactChangedTopicTwitterId) |  |  [optional] |
| **lineId** | [**ExternalContactsUnresolvedContactChangedTopicLineId**](ExternalContactsUnresolvedContactChangedTopicLineId) |  |  [optional] |
| **whatsAppId** | [**ExternalContactsUnresolvedContactChangedTopicWhatsAppId**](ExternalContactsUnresolvedContactChangedTopicWhatsAppId) |  |  [optional] |
| **facebookId** | [**ExternalContactsUnresolvedContactChangedTopicFacebookId**](ExternalContactsUnresolvedContactChangedTopicFacebookId) |  |  [optional] |
| **instagramId** | [**ExternalContactsUnresolvedContactChangedTopicInstagramId**](ExternalContactsUnresolvedContactChangedTopicInstagramId) |  |  [optional] |
| **externalIds** | [**List&lt;ExternalContactsUnresolvedContactChangedTopicExternalId&gt;**](ExternalContactsUnresolvedContactChangedTopicExternalId) |  |  [optional] |
| **appleOpaqueIds** | [**List&lt;ExternalContactsUnresolvedContactChangedTopicAppleOpaqueId&gt;**](ExternalContactsUnresolvedContactChangedTopicAppleOpaqueId) |  |  [optional] |
| **canonicalContactId** | **String** |  |  [optional] |
| **schema** | [**ExternalContactsUnresolvedContactChangedTopicDataSchema**](ExternalContactsUnresolvedContactChangedTopicDataSchema) |  |  [optional] |
| **customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **mergeSet** | **List&lt;String&gt;** |  |  [optional] |
| **mergedFrom** | **List&lt;String&gt;** |  |  [optional] |
| **mergedTo** | **String** |  |  [optional] |
| **mergeOperation** | [**ExternalContactsUnresolvedContactChangedTopicMergeOperation**](ExternalContactsUnresolvedContactChangedTopicMergeOperation) |  |  [optional] |
| **createDate** | [**Date**](Date) |  |  [optional] |
| **modifyDate** | [**Date**](Date) |  |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EPHEMERAL | &quot;Ephemeral&quot; | 
| IDENTIFIED | &quot;Identified&quot; | 
| CURATED | &quot;Curated&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
