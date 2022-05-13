---
title: GroupUpdate
---
## GroupUpdate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The group name. |  [optional] |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | State of the group. |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Current version for this resource. |  |
| **images** | <!----><!---->[**List&lt;UserImage&gt;**](UserImage.html)<!----> |  |  [optional] |
| **addresses** | <!----><!---->[**List&lt;GroupContact&gt;**](GroupContact.html)<!----> |  |  [optional] |
| **rulesVisible** | <!----><!---->**Boolean**<!----> | Are membership rules visible to the person requesting to view the group |  [optional] |
| **visibility** | [**VisibilityEnum**](#VisibilityEnum)<!----> | Who can view this group |  [optional] |
| **ownerIds** | <!----><!---->**List&lt;String&gt;**<!----> | Owners of the group |  [optional] |
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


<a name="VisibilityEnum"></a>

## Enum: VisibilityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLIC | &quot;public&quot; | 
| OWNERIDS | &quot;ownerIds&quot; | 
| MEMBERS | &quot;members&quot; | 
{: class="table table-striped"}



