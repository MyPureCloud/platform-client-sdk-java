---
title: ExternalContact
---
## ExternalContact


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **firstName** | <!----><!---->**String**<!----> | The first name of the contact. |  |
| **middleName** | <!----><!---->**String**<!----> |  |  [optional] |
| **lastName** | <!----><!---->**String**<!----> | The last name of the contact. |  |
| **salutation** | <!----><!---->**String**<!----> |  |  [optional] |
| **title** | <!----><!---->**String**<!----> |  |  [optional] |
| **workPhone** | <!----><!---->[**PhoneNumber**](PhoneNumber.html)<!----> |  |  [optional] |
| **cellPhone** | <!----><!---->[**PhoneNumber**](PhoneNumber.html)<!----> |  |  [optional] |
| **homePhone** | <!----><!---->[**PhoneNumber**](PhoneNumber.html)<!----> |  |  [optional] |
| **otherPhone** | <!----><!---->[**PhoneNumber**](PhoneNumber.html)<!----> |  |  [optional] |
| **workEmail** | <!----><!---->**String**<!----> |  |  [optional] |
| **personalEmail** | <!----><!---->**String**<!----> |  |  [optional] |
| **otherEmail** | <!----><!---->**String**<!----> |  |  [optional] |
| **address** | <!----><!---->[**ContactAddress**](ContactAddress.html)<!----> |  |  [optional] |
| **twitterId** | <!----><!---->[**TwitterId**](TwitterId.html)<!----> |  |  [optional] |
| **lineId** | <!----><!---->[**LineId**](LineId.html)<!----> |  |  [optional] |
| **whatsAppId** | <!----><!---->[**WhatsAppId**](WhatsAppId.html)<!----> |  |  [optional] |
| **facebookId** | <!----><!---->[**FacebookId**](FacebookId.html)<!----> |  |  [optional] |
| **modifyDate** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **createDate** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **externalOrganization** | <!----><!---->[**ExternalOrganization**](ExternalOrganization.html)<!----> |  |  [optional] |
| **surveyOptOut** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **externalSystemUrl** | <!----><!---->**String**<!----> | A string that identifies an external system-of-record resource that may have more detailed information on the contact. It should be a valid URL (including the http/https protocol, port, and path [if any]). The value is automatically trimmed of any leading and trailing whitespace. |  [optional] |
| **schema** | <!----><!---->[**DataSchema**](DataSchema.html)<!----> | The schema defining custom fields for this contact |  [optional] |
| **customFields** | <!----><!---->**Map&lt;String, Object&gt;**<!----> | Custom fields defined in the schema referenced by schemaId and schemaVersion. |  [optional] |
| **externalDataSources** | <!----><!---->[**List&lt;ExternalDataSource&gt;**](ExternalDataSource.html)<!----> | Links to the sources of data (e.g. one source might be a CRM) that contributed data to this record.  Read-only, and only populated when requested via expand param. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of contact |  [optional] |
| **canonicalContact** | <!----><!---->[**ContactAddressableEntityRef**](ContactAddressableEntityRef.html)<!----> | The contact at the head of the merge tree. If null, this contact is not a part of any merge. |  [optional] |
| **mergeSet** | <!----><!---->[**List&lt;ContactAddressableEntityRef&gt;**](ContactAddressableEntityRef.html)<!----> | The set of all contacts that are a part of the merge tree. If null, this contact is not a part of any merge. |  [optional] |
| **mergeOperation** | <!----><!---->[**MergeOperation**](MergeOperation.html)<!----> | Information about the merge history of this contact. If null, this contact is not a part of any merge. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EPHEMERAL | &quot;Ephemeral&quot; | 
| IDENTIFIED | &quot;Identified&quot; | 
| CURATED | &quot;Curated&quot; | 
{: class="table table-striped"}



