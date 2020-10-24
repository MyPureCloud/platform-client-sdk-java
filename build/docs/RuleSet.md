---
title: RuleSet
---
## RuleSet


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the RuleSet. |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **contactList** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | A ContactList to provide user-interface suggestions for contact columns on relevant conditions and actions. |  [optional] |
| **queue** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | A Queue to provide user-interface suggestions for wrap-up codes on relevant conditions and actions. |  [optional] |
| **rules** | <!----><!---->[**List&lt;DialerRule&gt;**](DialerRule.html)<!----> | The list of rules. |  |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



