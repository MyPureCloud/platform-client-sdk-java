# Document


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **changeNumber** | **Integer** |  |  [optional] |
| **dateCreated** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateUploaded** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **contentUri** | **String** |  |  [optional] |
| **workspace** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **createdBy** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **uploadedBy** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **sharingUri** | **String** |  |  [optional] |
| **contentType** | **String** |  |  [optional] |
| **contentLength** | **Long** |  |  [optional] |
| **systemType** | [**SystemTypeEnum**](#Enum--SystemTypeEnum) |  |  [optional] |
| **filename** | **String** |  |  [optional] |
| **pageCount** | **Long** |  |  [optional] |
| **read** | **Boolean** |  |  [optional] |
| **callerAddress** | **String** |  |  [optional] |
| **receiverAddress** | **String** |  |  [optional] |
| **tags** | **List&lt;String&gt;** |  |  [optional] |
| **tagValues** | [**List&lt;TagValue&gt;**](TagValue) |  |  [optional] |
| **attributes** | [**List&lt;DocumentAttribute&gt;**](DocumentAttribute) |  |  [optional] |
| **thumbnails** | [**List&lt;DocumentThumbnail&gt;**](DocumentThumbnail) |  |  [optional] |
| **uploadStatus** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **uploadDestinationUri** | **String** |  |  [optional] |
| **uploadMethod** | [**UploadMethodEnum**](#Enum--UploadMethodEnum) |  |  [optional] |
| **lockInfo** | [**LockInfo**](LockInfo) |  |  [optional] |
| **acl** | **List&lt;String&gt;** | A list of permitted action rights for the user making the request |  [optional] |
| **sharingStatus** | [**SharingStatusEnum**](#Enum--SharingStatusEnum) |  |  [optional] |
| **downloadSharingUri** | **String** |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: SystemTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DOCUMENT | &quot;DOCUMENT&quot; | 
| FAX | &quot;FAX&quot; | 
| RECORDING | &quot;RECORDING&quot; | 


## Enum: UploadMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SINGLE_PUT | &quot;SINGLE_PUT&quot; | 
| MULTIPART_POST | &quot;MULTIPART_POST&quot; | 


## Enum: SharingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;NONE&quot; | 
| LIMITED | &quot;LIMITED&quot; | 
| PUBLIC | &quot;PUBLIC&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:212.0.0_
