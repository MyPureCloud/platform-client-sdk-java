---
title: AvailableTopic
---
## AvailableTopic


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **id** | <!----><!---->**String**<!----> |  |  [optional] |
| **permissionDetails** | <!----><!---->[**List&lt;PermissionDetails&gt;**](PermissionDetails.html)<!----> | Full detailed permissions required to subscribe to the topic |  [optional] |
| **requiresPermissions** | <!----><!---->**List&lt;String&gt;**<!----> | Permissions required to subscribe to the topic |  [optional] |
| **requiresDivisionPermissions** | <!----><!---->**Boolean**<!----> | True if the subscribing user must belong to the same division as the topic object ID |  [optional] |
| **requiresAnyValidator** | <!----><!---->**Boolean**<!----> | If multiple permissions are required for this topic, such as both requiresCurrentUser and requiresDivisionPermissions, then true here indicates that meeting any one condition will satisfy the requirements; false indicates all conditions must be met. |  [optional] |
| **enforced** | <!----><!---->**Boolean**<!----> | Whether or not the permissions on this topic are enforced |  [optional] |
| **visibility** | [**VisibilityEnum**](#VisibilityEnum)<!----> | Visibility of this topic (Public or Preview) |  [optional] |
| **schema** | <!----><!---->**Map&lt;String, Object&gt;**<!----> |  |  [optional] |
| **requiresCurrentUser** | <!----><!---->**Boolean**<!----> | True if the topic user ID is required to match the subscribing user ID |  [optional] |
| **requiresCurrentUserOrPermission** | <!----><!---->**Boolean**<!----> | True if permissions are only required when the topic user ID does not match the subscribing user ID |  [optional] |
| **transports** | <!---->[**List&lt;TransportsEnum&gt;**](#TransportsEnum)<!----> | Transports that support events for the topic |  [optional] |
| **publicApiTemplateUriPaths** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **topicParameters** | <!----><!---->**List&lt;String&gt;**<!----> | Parameters in the topic name that can be substituted, in the order they appear in the topic name |  [optional] |
{: class="table table-striped"}


<a name="VisibilityEnum"></a>

## Enum: VisibilityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLIC | &quot;Public&quot; | 
| PREVIEW | &quot;Preview&quot; | 
{: class="table table-striped"}


<a name="TransportsEnum"></a>

## Enum: TransportsEnum

| Name | Value |
| ---- | ----- |
| ALL | &quot;All&quot; |
| WEBSOCKET | &quot;Websocket&quot; |
| EVENTBRIDGE | &quot;EventBridge&quot; |
| PROCESSAUTOMATION | &quot;ProcessAutomation&quot; |
{: class="table table-striped"}



