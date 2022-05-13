---
title: Site
---
## Site


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the entity. |  |
| **division** | <!----><!---->[**Division**](Division.html)<!----> | The division to which this entity belongs. |  [optional] |
| **description** | <!----><!---->**String**<!----> | The resource's description. |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | The current version of the resource. |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | <!----><!---->**String**<!----> | The ID of the user that last modified the resource. |  [optional] |
| **createdBy** | <!----><!---->**String**<!----> | The ID of the user that created the resource. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Indicates if the resource is active, inactive, or deleted. |  [optional] |
| **modifiedByApp** | <!----><!---->**String**<!----> | The application that last modified the resource. |  [optional] |
| **createdByApp** | <!----><!---->**String**<!----> | The application that created the resource. |  [optional] |
| **primarySites** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> |  |  [optional] |
| **secondarySites** | <!----><!---->[**List&lt;DomainEntityRef&gt;**](DomainEntityRef.html)<!----> |  |  [optional] |
| **primaryEdges** | <!----><!---->[**List&lt;Edge&gt;**](Edge.html)<!----> |  |  [optional] |
| **secondaryEdges** | <!----><!---->[**List&lt;Edge&gt;**](Edge.html)<!----> |  |  [optional] |
| **addresses** | <!----><!---->[**List&lt;Contact&gt;**](Contact.html)<!----> |  |  [optional] |
| **edges** | <!----><!---->[**List&lt;Edge&gt;**](Edge.html)<!----> |  |  [optional] |
| **edgeAutoUpdateConfig** | <!----><!---->[**EdgeAutoUpdateConfig**](EdgeAutoUpdateConfig.html)<!----> | Recurrance rule, time zone, and start/end settings for automatic edge updates for this site |  [optional] |
| **mediaRegionsUseLatencyBased** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **location** | <!----><!---->[**LocationDefinition**](LocationDefinition.html)<!----> | Location |  |
| **managed** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **ntpSettings** | <!----><!---->[**NTPSettings**](NTPSettings.html)<!----> | Network Time Protocol settings for the site |  [optional] |
| **mediaModel** | [**MediaModelEnum**](#MediaModelEnum)<!----> | Media model for the site |  [optional] |
| **coreSite** | <!----><!---->**Boolean**<!----> | Is this site a core site |  [optional] |
| **siteConnections** | <!----><!---->[**List&lt;SiteConnection&gt;**](SiteConnection.html)<!----> | The site connections |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 
{: class="table table-striped"}


<a name="MediaModelEnum"></a>

## Enum: MediaModelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PREMISES | &quot;Premises&quot; | 
| CLOUD | &quot;Cloud&quot; | 
{: class="table table-striped"}



