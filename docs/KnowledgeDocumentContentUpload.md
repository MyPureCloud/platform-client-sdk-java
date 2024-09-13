# KnowledgeDocumentContentUpload


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **contentType** | [**ContentTypeEnum**](#Enum--ContentTypeEnum) | Type of Article Content. |  |
| **fileName** | **String** | Name of the file to upload. It must not start with a dot and not end with a forward slash. Whitespace and the following characters are not allowed: \\{^}%`]\">[~<#| |  |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | Status of the upload operation |  [optional] |
| **uploadKey** | **String** | Key that identifies the file in the storage including the file name |  [optional] |
| **url** | **String** | Presigned URL to PUT the file to |  [optional] |
| **headers** | **Map&lt;String, String&gt;** | Required headers when uploading a file through PUT request to the URL |  [optional] |
| **document** | [**AddressableEntityRef**](AddressableEntityRef) | ID of the document for which article content is to be uploaded |  [optional] |
| **errorMessage** | **String** | Error message when upload fails |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ContentTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BODY | &quot;Body&quot; | 
| ATTACHMENT | &quot;Attachment&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| VALIDATIONFAILED | &quot;ValidationFailed&quot; | 
| INPROGRESS | &quot;InProgress&quot; | 
| COMPLETED | &quot;Completed&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.0.1_
