# DialerDnclistConfigChangeDncList


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **importStatus** | [**DialerDnclistConfigChangeImportStatus**](DialerDnclistConfigChangeImportStatus) |  |  [optional] |
| **size** | **Long** | the number of phone numbers in the do not call list |  [optional] |
| **dncSourceType** | [**DncSourceTypeEnum**](#Enum--DncSourceTypeEnum) | the type of dnc list being created, rds (csv file), gryphon, or dnc.com |  [optional] |
| **loginId** | **String** | the loginId if the dncSourceType is dnc.com |  [optional] |
| **dncCodes** | **List&lt;String&gt;** | the list of dnc.com codes to be treated as DNC |  [optional] |
| **licenseId** | **String** | the license number if the dncSourceType is gryphon |  [optional] |
| **contactMethod** | [**ContactMethodEnum**](#Enum--ContactMethodEnum) |  |  [optional] |
| **division** | [**DialerDnclistConfigChangeUriReference**](DialerDnclistConfigChangeUriReference) |  |  [optional] |
| **additionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Long** | Required for updates, must match the version number of the most recent update |  [optional] |
| **getAdditionalProperties** | **Map&lt;String, Object&gt;** |  |  [optional] |


## Enum: DncSourceTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RDS | &quot;rds&quot; | 
| DNC_COM | &quot;dnc.com&quot; | 
| GRYPHON | &quot;gryphon&quot; | 


## Enum: ContactMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| PHONE | &quot;PHONE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:243.0.0_
