# ExpandableWebDeployment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The deployment ID |  [optional] |
| **name** | **String** | The deployment name |  |
| **description** | **String** | The description of the config |  [optional] |
| **allowAllDomains** | **Boolean** | Property indicates whether all domains are allowed or not. allowedDomains must be empty when this is set as true. |  [optional] |
| **allowedDomains** | **List&lt;String&gt;** | The list of domains that are approved to use this deployment; the list will be added to CORS headers for ease of web use. |  [optional] |
| **supportedContent** | [**SupportedContentReference**](SupportedContentReference) | The supported content profile for a deployment |  [optional] |
| **snippet** | **String** | Javascript snippet used to load the config |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the deployment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date the deployment was most recently modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lastModifiedUser** | [**AddressableEntityRef**](AddressableEntityRef) | A reference to the user who most recently modified the deployment |  [optional] |
| **flow** | [**WebDeploymentFlowEntityRef**](WebDeploymentFlowEntityRef) | A reference to the inboundshortmessage flow used by this deployment |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The current status of the deployment |  [optional] |
| **pushIntegrations** | [**List&lt;PushIntegration&gt;**](PushIntegration) | The push integration objects associated with the deployment |  [optional] |
| **_configuration** | [**WebDeploymentConfigurationVersionResponse**](WebDeploymentConfigurationVersionResponse) | The config version this deployment uses |  |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| ERROR | &quot;Error&quot; | 
| DELETING | &quot;Deleting&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.0.0_
