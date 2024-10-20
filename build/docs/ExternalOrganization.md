# ExternalOrganization


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the company. |  |
| **companyType** | **String** |  |  [optional] |
| **industry** | **String** |  |  [optional] |
| **primaryContactId** | **String** |  |  [optional] |
| **address** | [**ContactAddress**](ContactAddress) |  |  [optional] |
| **phoneNumber** | [**PhoneNumber**](PhoneNumber) |  |  [optional] |
| **faxNumber** | [**PhoneNumber**](PhoneNumber) |  |  [optional] |
| **employeeCount** | **Long** |  |  [optional] |
| **revenue** | **Long** |  |  [optional] |
| **tags** | **List&lt;String&gt;** |  |  [optional] |
| **websites** | **List&lt;String&gt;** |  |  [optional] |
| **tickers** | [**List&lt;Ticker&gt;**](Ticker) |  |  [optional] |
| **twitterId** | [**TwitterId**](TwitterId) |  |  [optional] |
| **externalSystemUrl** | **String** | A string that identifies an external system-of-record resource that may have more detailed information on the organization. It should be a valid URL (including the http/https protocol, port, and path [if any]). The value is automatically trimmed of any leading and trailing whitespace. |  [optional] |
| **modifyDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createDate** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **trustor** | [**Trustor**](Trustor) |  |  [optional] |
| **schema** | [**DataSchema**](DataSchema) | The schema defining custom fields for this contact |  [optional] |
| **customFields** | **Map&lt;String, Object&gt;** | Custom fields defined in the schema referenced by schemaId and schemaVersion. |  [optional] |
| **externalDataSources** | [**List&lt;ExternalDataSource&gt;**](ExternalDataSource) | Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:212.0.0_
