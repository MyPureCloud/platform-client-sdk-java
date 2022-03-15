---
title: DncList
---
## DncList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> | The name of the DncList. |  |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **importStatus** | <!----><!---->[**ImportStatus**](ImportStatus.html)<!----> | The status of the import process |  [optional] |
| **size** | <!----><!---->**Long**<!----> | The total number of phone numbers in the DncList. |  [optional] |
| **dncSourceType** | [**DncSourceTypeEnum**](#DncSourceTypeEnum)<!----> | The type of the DncList. |  |
| **contactMethod** | [**ContactMethodEnum**](#ContactMethodEnum)<!----> | The contact method. Required if dncSourceType is rds. |  [optional] |
| **loginId** | <!----><!---->**String**<!----> | A dnc.com loginId. Required if the dncSourceType is dnc.com. |  [optional] |
| **dncCodes** | <!----><!---->**List&lt;String&gt;**<!----> | The list of dnc.com codes to be treated as DNC. Required if the dncSourceType is dnc.com. |  [optional] |
| **licenseId** | <!----><!---->**String**<!----> | A gryphon license number. Required if the dncSourceType is gryphon. |  [optional] |
| **division** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> | The division this DncList belongs to. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="DncSourceTypeEnum"></a>

## Enum: DncSourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| RDS | &quot;rds&quot; |
| DNC_COM | &quot;dnc.com&quot; |
| GRYPHON | &quot;gryphon&quot; |
{: class="table table-striped"}


<a name="ContactMethodEnum"></a>

## Enum: ContactMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| EMAIL | &quot;Email&quot; |
| PHONE | &quot;Phone&quot; |
{: class="table table-striped"}



