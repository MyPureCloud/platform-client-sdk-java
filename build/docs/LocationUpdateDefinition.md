---
title: LocationUpdateDefinition
---
## LocationUpdateDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the Location. Required for creates, not required for updates |  |
| **version** | <!----><!---->**Integer**<!----> | Current version of the location |  |
| **state** | [**StateEnum**](#StateEnum)<!----> | Current activity status of the location. |  [optional] |
| **path** | <!----><!---->**List&lt;String&gt;**<!----> | A list of ancestor ids |  [optional] |
| **notes** | <!----><!---->**String**<!----> | Notes for the location |  [optional] |
| **contactUser** | <!----><!---->**String**<!----> | The user id of the location contact |  [optional] |
| **emergencyNumber** | <!----><!---->[**LocationEmergencyNumber**](LocationEmergencyNumber.html)<!----> | Emergency number for the location |  [optional] |
| **address** | <!----><!---->[**LocationAddress**](LocationAddress.html)<!----> | Address of the location |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| DELETED | &quot;deleted&quot; | 
{: class="table table-striped"}



