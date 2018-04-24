---
title: IntegrationType
---
## IntegrationType


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the integration type. |  |
| **name** | **String** |  |  [optional] |
| **description** | **String** | Description of the integration type. |  [optional] |
| **provider** | **String** | PureCloud provider of the integration type. |  [optional] |
| **category** | **String** | Category describing the integration type. |  [optional] |
| **images** | [**List&lt;UserImage&gt;**](UserImage.html) | Collection of logos. |  [optional] |
| **configPropertiesSchemaUri** | **String** | URI of the schema describing the key-value properties needed to configure an integration of this type. |  [optional] |
| **configAdvancedSchemaUri** | **String** | URI of the schema describing the advanced JSON document needed to configure an integration of this type. |  [optional] |
| **helpUri** | **String** | URI of a page with more information about the integration type |  [optional] |
| **credentials** | [**Map&lt;String, CredentialSpecification&gt;**](CredentialSpecification.html) | Map of credentials for integrations of this type. The key is the name of a credential that can be provided in the credentials property of the integration configuration. |  [optional] |
| **nonInstallable** | **Boolean** | Indicates if the integration type is installable or not. |  [optional] |
| **maxInstances** | **Integer** | The maximum number of integration instances allowable for this integration type |  [optional] |
| **userPermissions** | **List&lt;String&gt;** | List of permissions required to permit user access to the integration type. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


