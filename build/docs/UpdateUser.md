---
title: UpdateUser
---
## UpdateUser


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **chat** | <!----><!---->[**Chat**](Chat.html)<!----> |  |  [optional] |
| **department** | <!----><!---->**String**<!----> |  |  [optional] |
| **email** | <!----><!---->**String**<!----> |  |  [optional] |
| **primaryContactInfo** | <!----><!---->[**List&lt;Contact&gt;**](Contact.html)<!----> | The address(s) used for primary contact. Updates to the corresponding address in the addresses list will be reflected here. |  [optional] |
| **addresses** | <!----><!---->[**List&lt;Contact&gt;**](Contact.html)<!----> | Email address, phone number, and/or extension for this user. One entry is allowed per media type |  [optional] |
| **title** | <!----><!---->**String**<!----> |  |  [optional] |
| **username** | <!----><!---->**String**<!----> |  |  [optional] |
| **manager** | <!----><!---->**String**<!----> |  |  [optional] |
| **images** | <!----><!---->[**List&lt;UserImage&gt;**](UserImage.html)<!----> |  |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | This value should be the current version of the user. The current version can be obtained with a GET on the user before doing a PATCH. |  |
| **profileSkills** | <!----><!---->**List&lt;String&gt;**<!----> | Profile skills possessed by the user |  [optional] |
| **locations** | <!----><!---->[**List&lt;Location&gt;**](Location.html)<!----> | The user placement at each site location. |  [optional] |
| **groups** | <!----><!---->[**List&lt;Group&gt;**](Group.html)<!----> | The groups the user is a member of |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | The state of the user. This property can be used to restore a deleted user or transition between active and inactive. If specified, it is the only modifiable field. |  [optional] |
| **acdAutoAnswer** | <!----><!---->**Boolean**<!----> | The value that denotes if acdAutoAnswer is set on the user |  [optional] |
| **certifications** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **biography** | <!----><!---->[**Biography**](Biography.html)<!----> |  |  [optional] |
| **employerInfo** | <!----><!---->[**EmployerInfo**](EmployerInfo.html)<!----> |  |  [optional] |
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



