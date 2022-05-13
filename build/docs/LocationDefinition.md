---
title: LocationDefinition
---
## LocationDefinition


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **contactUser** | <!----><!---->[**AddressableEntityRef**](AddressableEntityRef.html)<!----> | Site contact for the location entity |  [optional] |
| **emergencyNumber** | <!----><!---->[**LocationEmergencyNumber**](LocationEmergencyNumber.html)<!----> | Emergency number for the location entity |  [optional] |
| **address** | <!----><!---->[**LocationAddress**](LocationAddress.html)<!----> |  |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> | Current state of the location entity |  [optional] |
| **notes** | <!----><!---->**String**<!----> | Notes for the location entity |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Current version of the location entity, value to be supplied should be retrieved by a GET or on create/update response |  [optional] |
| **path** | <!----><!---->**List&lt;String&gt;**<!----> | A list of ancestor IDs in order |  [optional] |
| **profileImage** | <!----><!---->[**List&lt;LocationImage&gt;**](LocationImage.html)<!----> | Profile image of the location entity, retrieved with ?expand=images query parameter |  [optional] |
| **floorplanImage** | <!----><!---->[**List&lt;LocationImage&gt;**](LocationImage.html)<!----> | Floorplan images of the location entity, retrieved with ?expand=images query parameter |  [optional] |
| **addressVerificationDetails** | <!----><!---->[**LocationAddressVerificationDetails**](LocationAddressVerificationDetails.html)<!----> | Address verification information, retrieve dwith the ?expand=addressVerificationDetails query parameter |  [optional] |
| **addressVerified** | <!----><!---->**Boolean**<!----> | Boolean field which states if the address has been verified as an actual address |  [optional] |
| **addressStored** | <!----><!---->**Boolean**<!----> | Boolean field which states if the address has been stored for E911 |  [optional] |
| **images** | <!----><!---->**String**<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVE | &quot;active&quot; | 
| DELETED | &quot;deleted&quot; | 
{: class="table table-striped"}



