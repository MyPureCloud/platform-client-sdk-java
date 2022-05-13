---
title: Document
---
## Document


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **changeNumber** | <!----><!---->**Integer**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateUploaded** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **contentUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **workspace** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **createdBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **uploadedBy** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **sharingUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **contentType** | <!----><!---->**String**<!----> |  |  [optional] |
| **contentLength** | <!----><!---->**Long**<!----> |  |  [optional] |
| **systemType** | [**SystemTypeEnum**](#SystemTypeEnum)<!----> |  |  [optional] |
| **filename** | <!----><!---->**String**<!----> |  |  [optional] |
| **pageCount** | <!----><!---->**Long**<!----> |  |  [optional] |
| **read** | <!----><!---->**Boolean**<!----> |  |  [optional] |
| **callerAddress** | <!----><!---->**String**<!----> |  |  [optional] |
| **receiverAddress** | <!----><!---->**String**<!----> |  |  [optional] |
| **tags** | <!----><!---->**List&lt;String&gt;**<!----> |  |  [optional] |
| **tagValues** | <!----><!---->[**List&lt;TagValue&gt;**](TagValue.html)<!----> |  |  [optional] |
| **attributes** | <!----><!---->[**List&lt;DocumentAttribute&gt;**](DocumentAttribute.html)<!----> |  |  [optional] |
| **thumbnails** | <!----><!---->[**List&lt;DocumentThumbnail&gt;**](DocumentThumbnail.html)<!----> |  |  [optional] |
| **uploadStatus** | <!----><!---->[**DomainEntityRef**](DomainEntityRef.html)<!----> |  |  [optional] |
| **uploadDestinationUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **uploadMethod** | [**UploadMethodEnum**](#UploadMethodEnum)<!----> |  |  [optional] |
| **lockInfo** | <!----><!---->[**LockInfo**](LockInfo.html)<!----> |  |  [optional] |
| **acl** | <!----><!---->**List&lt;String&gt;**<!----> | A list of permitted action rights for the user making the request |  [optional] |
| **sharingStatus** | [**SharingStatusEnum**](#SharingStatusEnum)<!----> |  |  [optional] |
| **downloadSharingUri** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="SystemTypeEnum"></a>

## Enum: SystemTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| DOCUMENT | &quot;DOCUMENT&quot; | 
| FAX | &quot;FAX&quot; | 
| RECORDING | &quot;RECORDING&quot; | 
{: class="table table-striped"}


<a name="UploadMethodEnum"></a>

## Enum: UploadMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SINGLE_PUT | &quot;SINGLE_PUT&quot; | 
| MULTIPART_POST | &quot;MULTIPART_POST&quot; | 
{: class="table table-striped"}


<a name="SharingStatusEnum"></a>

## Enum: SharingStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NONE | &quot;NONE&quot; | 
| LIMITED | &quot;LIMITED&quot; | 
| PUBLIC | &quot;PUBLIC&quot; | 
{: class="table table-striped"}



