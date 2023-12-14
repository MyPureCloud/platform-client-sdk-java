---
title: ContactListTemplate
---
## ContactListTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **columnNames** | <!----><!---->**List&lt;String&gt;**<!----> | The names of the contact data columns. |  |
| **phoneColumns** | <!----><!---->[**List&lt;ContactPhoneNumberColumn&gt;**](ContactPhoneNumberColumn.html)<!----> | Indicates which columns are phone numbers. |  [optional] |
| **emailColumns** | <!----><!---->[**List&lt;EmailColumn&gt;**](EmailColumn.html)<!----> | Indicates which columns are email addresses |  [optional] |
| **previewModeColumnName** | <!----><!---->**String**<!----> | A column to check if a contact should always be dialed in preview mode. |  [optional] |
| **previewModeAcceptedValues** | <!----><!---->**List&lt;String&gt;**<!----> | The values in the previewModeColumnName column that indicate a contact should always be dialed in preview mode. |  [optional] |
| **attemptLimits** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | AttemptLimits for this ContactListTemplate. |  [optional] |
| **automaticTimeZoneMapping** | <!----><!---->**Boolean**<!----> | Indicates if automatic time zone mapping is to be used for this ContactListTemplate. |  [optional] |
| **zipCodeColumnName** | <!----><!---->**String**<!----> | The name of ContactListTemplate column containing the zip code for use with automatic time zone mapping. Only allowed if 'automaticTimeZoneMapping' is set to true. |  [optional] |
| **columnDataTypeSpecifications** | <!----><!---->[**List&lt;ColumnDataTypeSpecification&gt;**](ColumnDataTypeSpecification.html)<!----> | The settings of the columns selected for dynamic queueing |  [optional] |
| **trimWhitespace** | <!----><!---->**Boolean**<!----> | Whether to trim white space when importing a ContactListTemplate csv file, default value = true |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}



