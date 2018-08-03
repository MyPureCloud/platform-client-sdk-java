---
title: OrphanRecording
---
## OrphanRecording


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** |  |  [optional] |
| **createdTime** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **recoveredTime** | [**Date**](Date.html) | Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ |  [optional] |
| **providerType** | [**ProviderTypeEnum**](#ProviderTypeEnum) |  |  [optional] |
| **mediaSizeBytes** | **Long** |  |  [optional] |
| **mediaType** | [**MediaTypeEnum**](#MediaTypeEnum) |  |  [optional] |
| **fileState** | [**FileStateEnum**](#FileStateEnum) |  |  [optional] |
| **providerEndpoint** | [**Endpoint**](Endpoint.html) |  |  [optional] |
| **recording** | [**Recording**](Recording.html) |  |  [optional] |
| **orphanStatus** | [**OrphanStatusEnum**](#OrphanStatusEnum) | The status of the orphaned recording&#39;s conversation. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
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



