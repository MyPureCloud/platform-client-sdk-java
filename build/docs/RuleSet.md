---
title: RuleSet
---
## RuleSet


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | [**Date**](Date.html) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **contactList** | [**UriReference**](UriReference.html) | The identifier of an example contact list that provides user-interface suggestions for contact-based conditions and actions |  [optional] |
| **queue** | [**UriReference**](UriReference.html) | The identifier of an example queue that provides user-interface suggestions for wrap-up associated conditions |  [optional] |
| **rules** | [**List&lt;DialerRule&gt;**](DialerRule.html) | The list of rules |  |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


