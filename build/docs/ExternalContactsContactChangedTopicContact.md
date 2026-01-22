# ExternalContactsContactChangedTopicContact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **division** | [**ExternalContactsContactChangedTopicDivision**](ExternalContactsContactChangedTopicDivision) |  |  [optional] |
| **externalOrganization** | [**ExternalContactsContactChangedTopicExternalOrganization**](ExternalContactsContactChangedTopicExternalOrganization) |  |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) |  |  [optional] |
| **firstName** | **String** |  |  [optional] |
| **middleName** | **String** |  |  [optional] |
| **lastName** | **String** |  |  [optional] |
| **salutation** | **String** |  |  [optional] |
| **title** | **String** |  |  [optional] |
| **workPhone** | [**ExternalContactsContactChangedTopicPhoneNumber**](ExternalContactsContactChangedTopicPhoneNumber) |  |  [optional] |
| **cellPhone** | [**ExternalContactsContactChangedTopicPhoneNumber**](ExternalContactsContactChangedTopicPhoneNumber) |  |  [optional] |
| **homePhone** | [**ExternalContactsContactChangedTopicPhoneNumber**](ExternalContactsContactChangedTopicPhoneNumber) |  |  [optional] |
| **otherPhone** | [**ExternalContactsContactChangedTopicPhoneNumber**](ExternalContactsContactChangedTopicPhoneNumber) |  |  [optional] |
| **workEmail** | **String** |  |  [optional] |
| **personalEmail** | **String** |  |  [optional] |
| **otherEmail** | **String** |  |  [optional] |
| **address** | [**ExternalContactsContactChangedTopicContactAddress**](ExternalContactsContactChangedTopicContactAddress) |  |  [optional] |
| **surveyOptOut** | **Boolean** |  |  [optional] |
| **externalSystemUrl** | **String** |  |  [optional] |
| **twitterId** | [**ExternalContactsContactChangedTopicTwitterId**](ExternalContactsContactChangedTopicTwitterId) |  |  [optional] |
| **lineId** | [**ExternalContactsContactChangedTopicLineId**](ExternalContactsContactChangedTopicLineId) |  |  [optional] |
| **whatsAppId** | [**ExternalContactsContactChangedTopicWhatsAppId**](ExternalContactsContactChangedTopicWhatsAppId) |  |  [optional] |
| **facebookId** | [**ExternalContactsContactChangedTopicFacebookId**](ExternalContactsContactChangedTopicFacebookId) |  |  [optional] |
| **instagramId** | [**ExternalContactsContactChangedTopicInstagramId**](ExternalContactsContactChangedTopicInstagramId) |  |  [optional] |
| **externalIds** | [**List&lt;ExternalContactsContactChangedTopicExternalId&gt;**](ExternalContactsContactChangedTopicExternalId) |  |  [optional] |
| **appleOpaqueIds** | [**List&lt;ExternalContactsContactChangedTopicAppleOpaqueId&gt;**](ExternalContactsContactChangedTopicAppleOpaqueId) |  |  [optional] |
| **canonicalContactId** | **String** |  |  [optional] |
| **schema** | [**ExternalContactsContactChangedTopicDataSchema**](ExternalContactsContactChangedTopicDataSchema) |  |  [optional] |
| **customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **mergeSet** | **List&lt;String&gt;** |  |  [optional] |
| **mergedFrom** | **List&lt;String&gt;** |  |  [optional] |
| **mergedTo** | **String** |  |  [optional] |
| **mergeOperation** | [**ExternalContactsContactChangedTopicMergeOperation**](ExternalContactsContactChangedTopicMergeOperation) |  |  [optional] |
| **createDate** | [**Date**](Date) |  |  [optional] |
| **modifyDate** | [**Date**](Date) |  |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EPHEMERAL | &quot;Ephemeral&quot; | 
| IDENTIFIED | &quot;Identified&quot; | 
| CURATED | &quot;Curated&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:245.0.0_
