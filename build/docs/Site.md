# Site


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the entity. |  |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **description** | **String** | The resource's description. |  [optional] |
| **version** | **Integer** | The current version of the resource. |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the resource was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The date of the last modification to the resource. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **modifiedBy** | **String** | The ID of the user that last modified the resource. |  [optional] |
| **createdBy** | **String** | The ID of the user that created the resource. |  [optional] |
| **state** | [**StateEnum**](#Enum--StateEnum) | Indicates if the resource is active, inactive, or deleted. |  [optional] |
| **modifiedByApp** | **String** | The application that last modified the resource. |  [optional] |
| **createdByApp** | **String** | The application that created the resource. |  [optional] |
| **primarySites** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) |  |  [optional] |
| **secondarySites** | [**List&lt;DomainEntityRef&gt;**](DomainEntityRef) |  |  [optional] |
| **primaryEdges** | [**List&lt;Edge&gt;**](Edge) |  |  [optional] |
| **secondaryEdges** | [**List&lt;Edge&gt;**](Edge) |  |  [optional] |
| **addresses** | [**List&lt;Contact&gt;**](Contact) |  |  [optional] |
| **edges** | [**List&lt;Edge&gt;**](Edge) |  |  [optional] |
| **edgeAutoUpdateConfig** | [**EdgeAutoUpdateConfig**](EdgeAutoUpdateConfig) | Recurrance rule, time zone, and start/end settings for automatic edge updates for this site |  [optional] |
| **mediaRegionsUseLatencyBased** | **Boolean** |  |  [optional] |
| **location** | [**LocationDefinition**](LocationDefinition) | Location |  |
| **managed** | **Boolean** |  |  [optional] |
| **ntpSettings** | [**NTPSettings**](NTPSettings) | Network Time Protocol settings for the site |  [optional] |
| **mediaModel** | [**MediaModelEnum**](#Enum--MediaModelEnum) | Media model for the site |  [optional] |
| **coreSite** | **Boolean** | Is this site a core site |  [optional] |
| **siteConnections** | [**List&lt;SiteConnection&gt;**](SiteConnection) | The site connections |  [optional] |
| **mediaRegions** | **List&lt;String&gt;** | The ordered list of AWS regions through which media can stream. |  [optional] |
| **callerId** | **String** | The caller ID value for the site. |  [optional] |
| **callerName** | **String** | The caller name for the site. |  [optional] |
| **cloudProxyForceTurn** | **Boolean** | Enables premises Edge Force Turn  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| INACTIVE | &quot;inactive&quot; | 
| DELETED | &quot;deleted&quot; | 


## Enum: MediaModelEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PREMISES | &quot;Premises&quot; | 
| CLOUD | &quot;Cloud&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:210.0.0_
