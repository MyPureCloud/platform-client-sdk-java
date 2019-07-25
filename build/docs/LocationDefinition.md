---
title: LocationDefinition
---
## LocationDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the Location. |  |
| **address** | [**LocationAddress**](LocationAddress.html) |  |  [optional] |
| **addressVerified** | **Boolean** |  |  [optional] |
| **emergencyNumber** | [**LocationEmergencyNumber**](LocationEmergencyNumber.html) |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | Current activity status of the location. |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **path** | **List&lt;String&gt;** |  |  [optional] |
| **notes** | **String** |  |  [optional] |
| **profileImage** | [**List&lt;LocationImage&gt;**](LocationImage.html) | Profile image set for the location |  [optional] |
| **floorplanImage** | [**List&lt;LocationImage&gt;**](LocationImage.html) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
{: class="table table-striped"}



