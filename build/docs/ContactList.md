# ContactList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **division** | [**DomainEntityRef**](DomainEntityRef) | The division this entity belongs to. |  [optional] |
| **columnNames** | **List&lt;String&gt;** | The names of the contact data columns. |  |
| **phoneColumns** | [**List&lt;ContactPhoneNumberColumn&gt;**](ContactPhoneNumberColumn) | Indicates which columns are phone numbers. |  [optional] |
| **emailColumns** | [**List&lt;EmailColumn&gt;**](EmailColumn) | Indicates which columns are email addresses |  [optional] |
| **importStatus** | [**ImportStatus**](ImportStatus) | The status of the import process. |  [optional] |
| **previewModeColumnName** | **String** | A column to check if a contact should always be dialed in preview mode. |  [optional] |
| **previewModeAcceptedValues** | **List&lt;String&gt;** | The values in the previewModeColumnName column that indicate a contact should always be dialed in preview mode. |  [optional] |
| **size** | **Long** | The number of contacts in the ContactList. |  [optional] |
| **attemptLimits** | [**DomainEntityRef**](DomainEntityRef) | AttemptLimits for this ContactList. |  [optional] |
| **automaticTimeZoneMapping** | **Boolean** | Indicates if automatic time zone mapping is to be used for this ContactList. |  [optional] |
| **zipCodeColumnName** | **String** | The name of contact list column containing the zip code for use with automatic time zone mapping. Only allowed if 'automaticTimeZoneMapping' is set to true. |  [optional] |
| **columnDataTypeSpecifications** | [**List&lt;ColumnDataTypeSpecification&gt;**](ColumnDataTypeSpecification) | The settings of the columns selected for dynamic queueing |  [optional] |
| **trimWhitespace** | **Boolean** | Whether to trim white space when importing a contactlist csv file, default value = true |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:217.0.0_
