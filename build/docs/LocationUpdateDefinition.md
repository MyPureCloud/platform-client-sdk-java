---
title: LocationUpdateDefinition
---
## LocationUpdateDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Location. |  [optional] |
| **address** | [**LocationAddress**](LocationAddress.html) |  |  [optional] |
| **addressVerified** | **Boolean** |  |  [optional] |
| **emergencyNumber** | [**LocationEmergencyNumber**](LocationEmergencyNumber.html) |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | Current activity status of the location. |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **path** | **List&lt;String&gt;** |  |  [optional] |
| **notes** | **String** |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
{: class="table table-striped"}



