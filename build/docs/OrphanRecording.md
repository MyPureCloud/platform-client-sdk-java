---
title: OrphanRecording
---
## OrphanRecording


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **createdTime** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **recoveredTime** | <!----><!---->[**Date**](Date.html)<!----> | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **providerType** | [**ProviderTypeEnum**](#ProviderTypeEnum)<!----> |  |  [optional] |
| **mediaSizeBytes** | <!----><!---->**Long**<!----> |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum)<!----> |  |  [optional] |
| **fileState** | [**FileStateEnum**](#FileStateEnum)<!----> |  |  [optional] |
| **providerEndpoint** | <!----><!---->[**Endpoint**](Endpoint.html)<!----> |  |  [optional] |
| **recording** | <!----><!---->[**Recording**](Recording.html)<!----> |  |  [optional] |
| **orphanStatus** | [**OrphanStatusEnum**](#OrphanStatusEnum)<!----> | The status of the orphaned recording's conversation. |  [optional] |
| **sourceOrphaningId** | <!----><!---->**String**<!----> | An identifier used during recovery operations by the supplying hybrid platform to track back and determine which interaction this recording is associated with |  [optional] |
| **region** | [**RegionEnum**](#RegionEnum)<!----> |  |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ProviderTypeEnum"></a>

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
{: class="table table-striped"}


<a name="MediaTypeEnum"></a>

## Enum: MediaTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| CALL | &quot;CALL&quot; | 
| CHAT | &quot;CHAT&quot; | 
| EMAIL | &quot;EMAIL&quot; | 
| SCREEN | &quot;SCREEN&quot; | 
{: class="table table-striped"}


<a name="FileStateEnum"></a>

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
{: class="table table-striped"}


<a name="OrphanStatusEnum"></a>

## Enum: OrphanStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NO_CONVERSATION | &quot;NO_CONVERSATION&quot; | 
| UNKNOWN_CONVERSATION | &quot;UNKNOWN_CONVERSATION&quot; | 
| CONVERSATION_NOT_COMPLETE | &quot;CONVERSATION_NOT_COMPLETE&quot; | 
| CONVERSATION_NOT_EVALUATED | &quot;CONVERSATION_NOT_EVALUATED&quot; | 
| EVALUATED | &quot;EVALUATED&quot; | 
{: class="table table-striped"}


<a name="RegionEnum"></a>

## Enum: RegionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| AF_SOUTH_1 | &quot;af-south-1&quot; | 
| AP_NORTHEAST_1 | &quot;ap-northeast-1&quot; | 
| AP_NORTHEAST_2 | &quot;ap-northeast-2&quot; | 
| AP_SOUTH_1 | &quot;ap-south-1&quot; | 
| AP_SOUTHEAST_2 | &quot;ap-southeast-2&quot; | 
| CA_CENTRAL_1 | &quot;ca-central-1&quot; | 
| EU_CENTRAL_1 | &quot;eu-central-1&quot; | 
| EU_WEST_1 | &quot;eu-west-1&quot; | 
| EU_WEST_2 | &quot;eu-west-2&quot; | 
| SA_EAST_1 | &quot;sa-east-1&quot; | 
| US_EAST_1 | &quot;us-east-1&quot; | 
| US_WEST_2 | &quot;us-west-2&quot; | 
{: class="table table-striped"}



