# DncListDivisionView


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **division** | [**Division**](Division) | The division to which this entity belongs. |  [optional] |
| **importStatus** | [**ImportStatus**](ImportStatus) | The status of the import process. |  [optional] |
| **size** | **Long** | The number of contacts in the DncList. |  [optional] |
| **dncSourceType** | [**DncSourceTypeEnum**](#Enum--DncSourceTypeEnum) | The type of the DncList. |  [optional] |
| **contactMethod** | [**ContactMethodEnum**](#Enum--ContactMethodEnum) | The contact method. Required if dncSourceType is rds. |  [optional] |
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
| WHATSAPP | &quot;WhatsApp&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:237.0.0_
