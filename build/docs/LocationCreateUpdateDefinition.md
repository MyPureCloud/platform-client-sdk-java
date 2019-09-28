---
title: LocationCreateUpdateDefinition
---
## LocationCreateUpdateDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | **String** | The name of the Location. |  |
| **address** | [**LocationAddress**](LocationAddress.html) |  |  [optional] |
| **emergencyNumber** | [**LocationEmergencyNumber**](LocationEmergencyNumber.html) |  |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | Current activity status of the location. |  [optional] |
| **notes** | **String** |  |  [optional] |
| **contactUser** | **String** | The user id of the location contact |  [optional] |
| **path** | **List&lt;String&gt;** |  |  [optional] |
| **addressVerified** | **Boolean** |  |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
{: class="table table-striped"}



