---
title: DncList
---

## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the list. |  |
| **dateCreated** | [**Date**](Date.html) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **dateModified** | [**Date**](Date.html) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **importStatus** | [**ImportStatus**](ImportStatus.html) | the status of the import process |  [optional] |
| **size** | **Long** | the number of phone numbers in the do not call list |  [optional] |
| **dncSourceType** | [**DncSourceTypeEnum**](#DncSourceTypeEnum) | the type of dnc list being created, rds (csv file), gryphon, or dnc.com |  [optional] |
| **loginId** | **String** | the loginId if the dncSourceType is dnc.com |  [optional] |
| **dncCodes** | **List&lt;String&gt;** | the list of dnc.com codes to be treated as DNC |  [optional] |
| **licenseId** | **String** | the license number if the dncSourceType is gryphon |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
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


