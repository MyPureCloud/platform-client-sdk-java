# OrphanRecording


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **createdTime** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **recoveredTime** | [**Date**](Date) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **providerType** | [**ProviderTypeEnum**](#Enum--ProviderTypeEnum) |  |  [optional] |
| **mediaSizeBytes** | **Long** |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#Enum--MediaTypeEnum) |  |  [optional] |
| **mediaSubtype** | [**MediaSubtypeEnum**](#Enum--MediaSubtypeEnum) |  |  [optional] |
| **mediaSubject** | **String** |  |  [optional] |
| **fileState** | [**FileStateEnum**](#Enum--FileStateEnum) |  |  [optional] |
| **providerEndpoint** | [**Endpoint**](Endpoint) |  |  [optional] |
| **recording** | [**Recording**](Recording) |  |  [optional] |
| **orphanStatus** | [**OrphanStatusEnum**](#Enum--OrphanStatusEnum) | The status of the orphaned recording's conversation. |  [optional] |
| **sourceOrphaningId** | **String** | An identifier used during recovery operations by the supplying hybrid platform to track back and determine which interaction this recording is associated with |  [optional] |
| **region** | [**RegionEnum**](#Enum--RegionEnum) |  |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ProviderTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| EDGE | &quot;EDGE&quot; | 
| CHAT | &quot;CHAT&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| SCREEN_RECORDING | &quot;SCREEN_RECORDING&quot; | 
| PUREENGAGE | &quot;PUREENGAGE&quot; | 
| PURECONNECT | &quot;PURECONNECT&quot; | 


## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;CALL&quot; | 
| CHAT | &quot;CHAT&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| SCREEN | &quot;SCREEN&quot; | 


## Enum: MediaSubtypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| TRUNK | &quot;Trunk&quot; | 
| STATION | &quot;Station&quot; | 
| CONSULT | &quot;Consult&quot; | 
| SCREEN | &quot;Screen&quot; | 


## Enum: FileStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ARCHIVED | &quot;ARCHIVED&quot; | 
| AVAILABLE | &quot;AVAILABLE&quot; | 
| DELETED | &quot;DELETED&quot; | 
| RESTORED | &quot;RESTORED&quot; | 
| RESTORING | &quot;RESTORING&quot; | 
| UPLOADING | &quot;UPLOADING&quot; | 


## Enum: OrphanStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NO_CONVERSATION | &quot;NO_CONVERSATION&quot; | 
| UNKNOWN_CONVERSATION | &quot;UNKNOWN_CONVERSATION&quot; | 
| CONVERSATION_NOT_COMPLETE | &quot;CONVERSATION_NOT_COMPLETE&quot; | 
| CONVERSATION_NOT_EVALUATED | &quot;CONVERSATION_NOT_EVALUATED&quot; | 
| EVALUATED | &quot;EVALUATED&quot; | 


## Enum: RegionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AF_SOUTH_1 | &quot;af-south-1&quot; | 
| AP_EAST_1 | &quot;ap-east-1&quot; | 
| AP_NORTHEAST_1 | &quot;ap-northeast-1&quot; | 
| AP_NORTHEAST_2 | &quot;ap-northeast-2&quot; | 
| AP_NORTHEAST_3 | &quot;ap-northeast-3&quot; | 
| AP_SOUTH_1 | &quot;ap-south-1&quot; | 
| AP_SOUTHEAST_1 | &quot;ap-southeast-1&quot; | 
| AP_SOUTHEAST_2 | &quot;ap-southeast-2&quot; | 
| AP_SOUTHEAST_3 | &quot;ap-southeast-3&quot; | 
| CA_CENTRAL_1 | &quot;ca-central-1&quot; | 
| EU_CENTRAL_1 | &quot;eu-central-1&quot; | 
| EU_CENTRAL_2 | &quot;eu-central-2&quot; | 
| EU_WEST_1 | &quot;eu-west-1&quot; | 
| EU_WEST_2 | &quot;eu-west-2&quot; | 
| EU_WEST_3 | &quot;eu-west-3&quot; | 
| ME_CENTRAL_1 | &quot;me-central-1&quot; | 
| SA_EAST_1 | &quot;sa-east-1&quot; | 
| US_EAST_1 | &quot;us-east-1&quot; | 
| US_WEST_2 | &quot;us-west-2&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:228.0.0_
