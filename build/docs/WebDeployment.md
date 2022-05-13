---
title: WebDeployment
---
## WebDeployment


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The deployment ID |  [optional] |
| **name** | <!----><!---->**String**<!----> | The deployment name |  |
| **description** | <!----><!---->**String**<!----> | The description of the config |  [optional] |
| **_configuration** | <!----><!---->[**WebDeploymentConfigurationVersionEntityRef**](WebDeploymentConfigurationVersionEntityRef.html)<!----> | The config version this deployment uses |  |
| **allowAllDomains** | <!----><!---->**Boolean**<!----> | Property indicates whether all domains are allowed or not. allowedDomains must be empty when this is set as true. |  [optional] |
| **allowedDomains** | <!----><!---->**List&lt;String&gt;**<!----> | The list of domains that are approved to use this deployment; the list will be added to CORS headers for ease of web use. |  [optional] |
| **snippet** | <!----><!---->**String**<!----> | Javascript snippet used to load the config |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date the deployment was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The date the deployment was most recently modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **lastModifiedUser** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | A reference to the user who most recently modified the deployment |  [optional] |
| **flow** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | A reference to the inboundshortmessage flow used by this deployment |  [optional] |
| **status** | [**StatusEnum**](#StatusEnum)<!----> | The current status of the deployment |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StatusEnum"></a>

## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| ERROR | &quot;Error&quot; | 
| DELETING | &quot;Deleting&quot; | 
{: class="table table-striped"}



