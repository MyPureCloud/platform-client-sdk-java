---
title: DialerContactlistConfigChangeContactList
---
## DialerContactlistConfigChangeContactList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **columnNames** | <!----><!---->**List&lt;String&gt;**<!----> | the contact column names |  [optional] |
| **phoneColumns** | <!----><!---->[**List&lt;DialerContactlistConfigChangeContactPhoneNumberColumn&gt;**](DialerContactlistConfigChangeContactPhoneNumberColumn.html)<!----> | the columns containing phone numbers |  [optional] |
| **emailColumns** | <!----><!---->[**List&lt;DialerContactlistConfigChangeEmailColumn&gt;**](DialerContactlistConfigChangeEmailColumn.html)<!----> | the columns containing email addresses |  [optional] |
| **importStatus** | <!----><!---->[**DialerContactlistConfigChangeImportStatus**](DialerContactlistConfigChangeImportStatus.html)<!----> |  |  [optional] |
| **previewModeColumnName** | <!----><!---->**String**<!----> | the name of the column that holds the indicators for contacts that are to be dialed in preview mode only |  [optional] |
| **previewModeAcceptedValues** | <!----><!---->**List&lt;String&gt;**<!----> | list of user-defined values indicating the contact is to be dialed in preview mode only |  [optional] |
| **size** | <!----><!---->**Integer**<!----> | the number of contacts in the contact list |  [optional] |
| **attemptLimits** | <!----><!---->[**DialerContactlistConfigChangeUriReference**](DialerContactlistConfigChangeUriReference.html)<!----> |  |  [optional] |
| **automaticTimeZoneMapping** | <!----><!---->**Boolean**<!----> | whether or not automatic time zone mapping is enabled on the list |  [optional] |
| **zipCodeColumnName** | <!----><!---->**String**<!----> | zip code column from the contact list to be used optionally with automatic time zone mapping |  [optional] |
| **division** | <!----><!---->[**DialerContactlistConfigChangeUriReference**](DialerContactlistConfigChangeUriReference.html)<!----> | A UriReference for a resource |  [optional] |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The UI-visible name of the object |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
{: class="table table-striped"}



