---
title: Edge
---
## Edge


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
| **interfaces** | <!----><!---->[**List&lt;EdgeInterface&gt;**](EdgeInterface.html)<!----> | The list of interfaces for the edge. (Deprecated) Replaced by configuring trunks/ip info on the logical interface instead |  [optional] |
| **make** | <!----><!---->**String**<!----> |  |  [optional] |
| **model** | <!----><!---->**String**<!----> |  |  [optional] |
| **apiVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **softwareVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **softwareVersionTimestamp** | <!----><!---->**String**<!----> |  |  [optional] |
| **softwareVersionPlatform** | <!----><!---->**String**<!----> |  |  [optional] |
| **softwareVersionConfiguration** | <!----><!---->**String**<!----> |  |  [optional] |
| **fullSoftwareVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **pairingId** | <!----><!---->**String**<!----> | The pairing Id for a hardware Edge in the format: 00000-00000-00000-00000-00000. This field is only required when creating an Edge with a deployment type of HARDWARE. |  [optional] |
| **fingerprint** | <!----><!---->**String**<!----> |  |  [optional] |
| **fingerprintHint** | <!----><!---->**String**<!----> |  |  [optional] |
| **currentVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **stagedVersion** | <!----><!---->**String**<!----> |  |  [optional] |
| **patch** | <!----><!---->**String**<!----> |  |  [optional] |
| **statusCode** | [**StatusCodeEnum**](#StatusCodeEnum)<!----> | The current status of the Edge. |  [optional] |
| **edgeGroup** | <!----><!---->[**EdgeGroup**](EdgeGroup.html)<!----> |  |  [optional] |
| **site** | <!----><!---->[**Site**](Site.html)<!----> | The Site to which the Edge is assigned. |  [optional] |
| **softwareStatus** | <!----><!---->[**DomainEdgeSoftwareUpdateDto**](DomainEdgeSoftwareUpdateDto.html)<!----> | Details about an in-progress or recently in-progress Edge software upgrade. This node appears only if a software upgrade was recently initiated for this Edge. |  [optional] |
| **onlineStatus** | [**OnlineStatusEnum**](#OnlineStatusEnum)<!----> |  |  [optional] |
| **serialNumber** | <!----><!---->**String**<!----> |  |  [optional] |
| **physicalEdge** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **managed** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **edgeDeploymentType** | [**EdgeDeploymentTypeEnum**](#EdgeDeploymentTypeEnum)<!----> |  |  [optional] |
| **callDrainingState** | [**CallDrainingStateEnum**](#CallDrainingStateEnum)<!----> | The current state of the Edge's call draining process before it can be safely rebooted or updated. |  [optional] |
| **conversationCount** | <!----><!---->**Integer**<!----> | The remaining number of conversations the Edge has to drain before it can be safely rebooted or updated. When an Edge is not draining conversations, this will be NULL or 0. |  [optional] |
| **proxy** | <!----><!---->**String**<!----> | Edge HTTP proxy configuration for the WAN port. The field can be a hostname, FQDN, IPv4 or IPv6 address. If port is not included, port 80 is assumed. |  [optional] |
| **offlineConfigCalled** | <!----><!---->**Boolean**<!----> | True if the offline edge configuration endpoint has been called for this edge. |  [optional] |
| **osName** | <!----><!---->**String**<!----> | The name provided by the operating system of the Edge. |  [optional] |
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


<a name="StatusCodeEnum"></a>

## Enum: StatusCodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEW | &quot;NEW&quot; | 
| AWAITING_CONNECTION | &quot;AWAITING_CONNECTION&quot; | 
| AWAITING_FINGERPRINT | &quot;AWAITING_FINGERPRINT&quot; | 
| AWAITING_FINGERPRINT_VERIFICATION | &quot;AWAITING_FINGERPRINT_VERIFICATION&quot; | 
| FINGERPRINT_VERIFIED | &quot;FINGERPRINT_VERIFIED&quot; | 
| AWAITING_BOOTSTRAP | &quot;AWAITING_BOOTSTRAP&quot; | 
| ACTIVE | &quot;ACTIVE&quot; | 
| INACTIVE | &quot;INACTIVE&quot; | 
| RMA | &quot;RMA&quot; | 
| UNPAIRING | &quot;UNPAIRING&quot; | 
| UNPAIRED | &quot;UNPAIRED&quot; | 
| INITIALIZING | &quot;INITIALIZING&quot; | 
{: class="table table-striped"}


<a name="OnlineStatusEnum"></a>

## Enum: OnlineStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ONLINE | &quot;ONLINE&quot; | 
| OFFLINE | &quot;OFFLINE&quot; | 
{: class="table table-striped"}


<a name="EdgeDeploymentTypeEnum"></a>

## Enum: EdgeDeploymentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HARDWARE | &quot;HARDWARE&quot; | 
| LDM | &quot;LDM&quot; | 
| CDM | &quot;CDM&quot; | 
| CHS | &quot;CHS&quot; | 
| INVALID | &quot;INVALID&quot; | 
{: class="table table-striped"}


<a name="CallDrainingStateEnum"></a>

## Enum: CallDrainingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;NONE&quot; | 
| WAIT | &quot;WAIT&quot; | 
| WAIT_TIMEOUT | &quot;WAIT_TIMEOUT&quot; | 
| TERMINATE | &quot;TERMINATE&quot; | 
| COMPLETE | &quot;COMPLETE&quot; | 
{: class="table table-striped"}



