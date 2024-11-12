# DncList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the DncList. |  |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **importStatus** | [**ImportStatus**](ImportStatus) | The status of the import process |  [optional] |
| **size** | **Long** | The total number of phone numbers in the DncList. |  [optional] |
| **dncSourceType** | [**DncSourceTypeEnum**](#Enum--DncSourceTypeEnum) | The type of the DncList. |  |
| **contactMethod** | [**ContactMethodEnum**](#Enum--ContactMethodEnum) | The contact method. Required if dncSourceType is rds. |  [optional] |
| **loginId** | **String** | A dnc.com loginId. Required if the dncSourceType is dnc.com. |  [optional] |
| **campaignId** | **String** | A dnc.com campaignId. Optional if the dncSourceType is dnc.com. |  [optional] |
| **dncCodes** | **List&lt;String&gt;** | The list of dnc.com codes to be treated as DNC. Required if the dncSourceType is dnc.com. |  [optional] |
| **licenseId** | **String** | A gryphon license number. Required if the dncSourceType is gryphon. |  [optional] |
| **division** | [**DomainEntityRef**](DomainEntityRef) | The division this DncList belongs to. |  [optional] |
| **customExclusionColumn** | **String** | The column to evaluate exclusion against. Required if the dncSourceType is rds_custom. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: DncSourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RDS | &quot;rds&quot; | 
| RDS_CUSTOM | &quot;rds_custom&quot; | 
| DNC_COM | &quot;dnc.com&quot; | 
| GRYPHON | &quot;gryphon&quot; | 


## Enum: ContactMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;Email&quot; | 
| PHONE | &quot;Phone&quot; | 
| ANY | &quot;Any&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:214.0.0_
