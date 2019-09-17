---
title: FacebookIntegration
---
## FacebookIntegration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | A unique Integration Id. |  |
| **name** | **String** | The name of the Facebook Integration |  |
| **appId** | **String** | The App Id from Facebook messenger |  |
| **pageId** | **String** | The Page Id from Facebook messenger |  [optional] |
| **status** | **String** | The status of the Facebook Integration |  [optional] |
| **recipient** | [**DomainEntityRef**](DomainEntityRef.html) | The recipient reference associated to the Facebook Integration. This recipient is used to associate a flow to an integration |  [optional] |
| **dateCreated** | [**Date**](Date.html) | Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | [**Date**](Date.html) | Date this Integration was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef.html) | User reference that created this Integration |  [optional] |
| **modifiedBy** | [**DomainEntityRef**](DomainEntityRef.html) | User reference that last modified this Integration |  [optional] |
| **version** | **Integer** | Version number required for updates. |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}



