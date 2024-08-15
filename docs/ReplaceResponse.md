# ReplaceResponse


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **changeNumber** | **Integer** |  |  [optional] |
| **uploadStatus** | [**DomainEntityRef**](DomainEntityRef) |  |  [optional] |
| **uploadDestinationUri** | **String** |  |  [optional] |
| **uploadMethod** | [**UploadMethodEnum**](#Enum--UploadMethodEnum) |  |  [optional] |
{: class="table table-striped"}


## Enum: UploadMethodEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SINGLE_PUT | &quot;SINGLE_PUT&quot; | 
| MULTIPART_POST | &quot;MULTIPART_POST&quot; | 
{: class="table table-striped"}



