---
title: ImportForecastUploadResponse
---
## ImportForecastUploadResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **uploadKey** | <!----><!---->**String**<!----> | The key to pass to the secondary request to start processing of the upload |  [optional] |
| **url** | <!----><!---->**String**<!----> | The url to which to PUT the upload body |  [optional] |
| **headers** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Required headers for the PUT request to the url |  [optional] |
| **uploadBodySchema** | <!----><!---->[**BuImportShortTermForecastSchema**](BuImportShortTermForecastSchema.html)<!----> | Always null. Defines the schema of the json body to be PUT to the url. The json body should be gzip encoded before uploading |  [optional] |
{: class="table table-striped"}



