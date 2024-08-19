# Celebration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **recipient** | [**UserReference**](UserReference) | The Recipient of the celebration |  [optional] |
| **createdBy** | [**UserReference**](UserReference) | The creator of the celebration |  [optional] |
| **dateCreated** | [**Date**](Date) | The date the celebration was created on. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The Celebration Type |  [optional] |
| **title** | **String** | The Celebration title |  [optional] |
| **note** | **String** | The Celebration note |  [optional] |
| **sourceEntity** | [**SourceEntity**](SourceEntity) | The celebration's source entity |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RECOGNITION | &quot;Recognition&quot; | 
{: class="table table-striped"}




_com.mypurecloud.sdk.v2:platform-client-v2:208.0.0_
