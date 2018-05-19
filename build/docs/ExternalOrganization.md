---
title: ExternalOrganization
---
## ExternalOrganization


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the company. |  |
| **companyType** | **String** |  |  [optional] |
| **industry** | **String** |  |  [optional] |
| **primaryContactId** | **String** |  |  [optional] |
| **address** | [**ContactAddress**](ContactAddress.html) |  |  [optional] |
| **phoneNumber** | [**PhoneNumber**](PhoneNumber.html) |  |  [optional] |
| **faxNumber** | [**PhoneNumber**](PhoneNumber.html) |  |  [optional] |
| **employeeCount** | **Long** |  |  [optional] |
| **revenue** | **Long** |  |  [optional] |
| **tags** | **List&lt;String&gt;** |  |  [optional] |
| **websites** | **List&lt;String&gt;** |  |  [optional] |
| **tickers** | [**List&lt;Ticker&gt;**](Ticker.html) |  |  [optional] |
| **twitterId** | [**TwitterId**](TwitterId.html) |  |  [optional] |
| **externalSystemUrl** | **String** | A string that identifies an external system-of-record resource that may have more detailed information on the organization. It should be a valid URL (including the HTTP protocol, port, and path [if any]). The value is automatically trimmed of any leading and trailing whitespace. |  [optional] |
| **modifyDate** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **createDate** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **trustor** | [**Trustor**](Trustor.html) |  |  [optional] |
| **externalDataSources** | [**List&lt;ExternalDataSource&gt;**](ExternalDataSource.html) | Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}
{: class="table table-striped"}


