---
title: WrapUpCodeMapping
---
## WrapUpCodeMapping


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **defaultSet** | <!---->[**List&lt;DefaultSetEnum&gt;**](#DefaultSetEnum)<!----> | The default set of wrap-up flags. These will be used if there is no entry for a given wrap-up code in the mapping. |  [optional] |
| **mapping** | <!----><!---->[**Map&lt;String, List&lt;String&gt;&gt;**](List.html)<!----> | A map from wrap-up code identifiers to a set of wrap-up flags. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="DefaultSetEnum"></a>

## Enum: DefaultSetEnum

| Name | Value |
| ---- | ----- |
| CONTACT_UNCALLABLE | &quot;CONTACT_UNCALLABLE&quot; |
| NUMBER_UNCALLABLE | &quot;NUMBER_UNCALLABLE&quot; |
| RIGHT_PARTY_CONTACT | &quot;RIGHT_PARTY_CONTACT&quot; |
{: class="table table-striped"}



