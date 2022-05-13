---
title: ContactList
---
## ContactList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **division** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The division this entity belongs to. |  [optional] |
| **columnNames** | <!----><!---->**List&lt;String&gt;**<!----> | The names of the contact data columns. |  |
| **phoneColumns** | <!----><!---->[**List&lt;ContactPhoneNumberColumn&gt;**](ContactPhoneNumberColumn.html)<!----> | Indicates which columns are phone numbers. |  [optional] |
| **importStatus** | <!----><!---->[**ImportStatus**](ImportStatus.html)<!----> | The status of the import process. |  [optional] |
| **previewModeColumnName** | <!----><!---->**String**<!----> | A column to check if a contact should always be dialed in preview mode. |  [optional] |
| **previewModeAcceptedValues** | <!----><!---->**List&lt;String&gt;**<!----> | The values in the previewModeColumnName column that indicate a contact should always be dialed in preview mode. |  [optional] |
| **size** | <!----><!---->**Long**<!----> | The number of contacts in the ContactList. |  [optional] |
| **attemptLimits** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | AttemptLimits for this ContactList. |  [optional] |
| **automaticTimeZoneMapping** | <!----><!---->**Boolean**<!----> | Indicates if automatic time zone mapping is to be used for this ContactList. |  [optional] |
| **zipCodeColumnName** | <!----><!---->**String**<!----> | The name of contact list column containing the zip code for use with automatic time zone mapping. Only allowed if 'automaticTimeZoneMapping' is set to true. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



