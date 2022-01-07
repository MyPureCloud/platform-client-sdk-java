---
title: DialerWrapupcodemappingConfigChangeWrapUpCodeMapping
---
## DialerWrapupcodemappingConfigChangeWrapUpCodeMapping


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The UI-visible name of the object |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **defaultSet** | <!---->[**List&lt;DefaultSetEnum&gt;**](#DefaultSetEnum)<!----> |  |  [optional] |
| **mapping** | <!----><!---->[**Map&lt;String, List&lt;String&gt;&gt;**](List.html)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="DefaultSetEnum"></a>

## Enum: DefaultSetEnum

| Name | Value |
| ---- | ----- |
| CONTACT_UNCALLABLE | &quot;CONTACT_UNCALLABLE&quot; |
| NUMBER_UNCALLABLE | &quot;NUMBER_UNCALLABLE&quot; |
| RIGHT_PARTY_CONTACT | &quot;RIGHT_PARTY_CONTACT&quot; |
{: class="table table-striped"}



