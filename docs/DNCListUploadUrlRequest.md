# DNCListUploadUrlRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **signedUrlTimeoutSeconds** | **Integer** | The number of seconds the presigned URL is valid for (from 1 to 604800 seconds). If none provided, defaults to 600 seconds |  [optional] |
| **contentType** | **String** | The content type of the file to upload. Allows all types are text/csv, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet |  |
| **id** | **String** | Id of your dnc list to upload to |  |
| **phoneColumns** | **String** | The column names from your file from which to upload dnc phone numbers. |  [optional] |
| **emailColumns** | **String** | The column names from your file from which to upload dnc emails. |  [optional] |
| **customExclusionColumns** | **String** | The column names from your file from which to upload dnc custom exclusion column entries. |  [optional] |
| **expirationDateTimeColumn** | **String** | The column name from your file to use as the dnc expiration date time. |  [optional] |
| **whatsAppColumns** | **String** | The column names from your file from which to upload dnc whatsapp. |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:253.1.0_
