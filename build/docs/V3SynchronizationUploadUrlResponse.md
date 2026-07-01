# V3SynchronizationUploadUrlResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fileId** | **String** | The unique identifier for the upload object. |  [optional] |
| **fileName** | **String** | Name of the uploaded file. |  [optional] |
| **metadata** | [**V3SynchronizationUploadMetadata**](V3SynchronizationUploadMetadata) | The metadata of the uploaded file |  [optional] |
| **synchronization** | [**V3SynchronizationRef**](V3SynchronizationRef) | The synchronization of the file upload. |  [optional] |
| **url** | **String** | Pre-signed URL to PUT the file to. |  [optional] |
| **headers** | **Map&lt;String, String&gt;** | Required headers when uploading a file through PUT request to the URL. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:257.0.0_
