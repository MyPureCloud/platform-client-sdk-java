---
title: UpdateUser
---
## UpdateUser


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **chat** | [**Chat**](Chat.html) |  |  [optional] |
| **department** | **String** |  |  [optional] |
| **email** | **String** |  |  [optional] |
| **primaryContactInfo** | [**List&lt;Contact&gt;**](Contact.html) |  |  [optional] |
| **addresses** | [**List&lt;Contact&gt;**](Contact.html) | Email addresses and phone numbers for this user |  [optional] |
| **title** | **String** |  |  [optional] |
| **username** | **String** |  |  [optional] |
| **manager** | **String** |  |  [optional] |
| **images** | [**List&lt;UserImage&gt;**](UserImage.html) |  |  [optional] |
| **version** | **Integer** | Required when updating a user, this value should be the current version of the user.  The current version can be obtained with a GET on the user before doing a PATCH. |  [optional] |
| **profileSkills** | **List&lt;String&gt;** | Skills possessed by the user |  [optional] |
| **locations** | [**List&lt;Location&gt;**](Location.html) | The user placement at each site location. |  [optional] |
| **groups** | [**List&lt;Group&gt;**](Group.html) | The groups the user is a member of |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


