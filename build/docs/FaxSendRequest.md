---
title: FaxSendRequest
---
## FaxSendRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **addresses** | <!----><!---->**List&lt;String&gt;**<!----> | A list of outbound fax dialing addresses. E.g. +13175555555 or 3175555555 |  |
| **documentId** | <!----><!---->**String**<!----> | DocumentId of Content Management artifact. If Content Management document is not used for faxing, documentId should be null |  [optional] |
| **contentType** | [**ContentTypeEnum**](#ContentTypeEnum)<!----> | The content type that is going to be uploaded. If Content Management document is used for faxing, contentType will be ignored |  [optional] |
| **workspace** | <!----><!---->[**Workspace**](Workspace.html)<!----> | Workspace in which the document should be stored. If Content Management document is used for faxing, workspace will be ignored |  [optional] |
| **coverSheet** | <!----><!---->[**CoverSheet**](CoverSheet.html)<!----> | Data for coversheet generation. |  [optional] |
| **timeZoneOffsetMinutes** | <!----><!---->**Integer**<!----> | Time zone offset minutes from GMT |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ContentTypeEnum"></a>

## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| APPLICATION_PDF | &quot;application/pdf&quot; | 
| IMAGE_TIFF | &quot;image/tiff&quot; | 
| APPLICATION_MSWORD | &quot;application/msword&quot; | 
| APPLICATION_VND_OASIS_OPENDOCUMENT_TEXT | &quot;application/vnd.oasis.opendocument.text&quot; | 
| APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_WORDPROCESSINGML_DOCUMENT | &quot;application/vnd.openxmlformats-officedocument.wordprocessingml.document&quot; | 
{: class="table table-striped"}



