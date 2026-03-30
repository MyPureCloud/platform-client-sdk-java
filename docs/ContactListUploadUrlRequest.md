# ContactListUploadUrlRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **signedUrlTimeoutSeconds** | **Integer** | The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds |  [optional] |
| **contentType** | **String** | The content type of the file to upload. Allows MIME types are text/csv, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet |  |
| **id** | **String** | Id of your contact list to upload to |  [optional] |
| **contactIdName** | **String** | The column name from your file to use as the contact id. |  [optional] |
| **importTemplateId** | **String** | Id of your import template to use. |  [optional] |
| **listNamePrefix** | **String** | String that will replace %N in the listNameFormat specified on the import template. |  [optional] |
| **clearSystemData** | **Boolean** | Whether to clear system data |  [optional] |
| **divisionIdForTargetContactLists** | **String** | Id of the division to be used for the creation of the target contact lists. If not provided, Home division will be used. |  [optional] |
| **fileSpecificationTemplateId** | **String** | File specification template ID |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:250.1.0_
