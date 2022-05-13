---
title: Group
---
## Group


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The group name. |  |
| **description** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified date/time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **memberCount** | <!----><!---->**Long**<!----> | Number of members. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Active, inactive, or deleted state. |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Current version for this resource. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Type of group. |  |
| **images** | <!----><!---->[**List&lt;UserImage&gt;**](UserImage.html)<!----> |  |  [optional] |
| **addresses** | <!----><!---->[**List&lt;GroupContact&gt;**](GroupContact.html)<!----> |  |  [optional] |
| **rulesVisible** | <!----><!---->**Boolean**<!----> | Are membership rules visible to the person requesting to view the group |  |
| **visibility** | [**VisibilityEnum**](#VisibilityEnum)<!----> | Who can view this group |  |
| **owners** | <!----><!---->[**List&lt;User&gt;**](User.html)<!----> | Owners of the group |  [optional] |
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


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFFICIAL | &quot;official&quot; | 
| SOCIAL | &quot;social&quot; | 
{: class="table table-striped"}


<a name="VisibilityEnum"></a>

## Enum: VisibilityEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PUBLIC | &quot;public&quot; | 
| OWNERS | &quot;owners&quot; | 
| MEMBERS | &quot;members&quot; | 
{: class="table table-striped"}



