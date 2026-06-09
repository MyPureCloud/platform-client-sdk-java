# ExternalEventChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **changeCategory** | [**ChangeCategoryEnum**](#Enum--ChangeCategoryEnum) | The category of the change |  [optional] |
| **schemaId** | **String** | The unique identifier for the schema |  [optional] |
| **eventName** | **String** | The name of the event |  [optional] |
| **dateDetected** | [**Date**](Date) | The timestamp when the change was detected. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **systemStatus** | [**SystemStatusEnum**](#Enum--SystemStatusEnum) | The status of the change |  [optional] |
| **errorCode** | **String** | A code representing the error, only present for ERROR category changes |  [optional] |
| **errorDescription** | **String** | A description of the error, only present for ERROR category changes |  [optional] |


## Enum: ChangeCategoryEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ERROR | &quot;Error&quot; | 
| UPDATED | &quot;Updated&quot; | 
| NEW | &quot;New&quot; | 


## Enum: SystemStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEW | &quot;New&quot; | 
| UPDATED | &quot;Updated&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:255.0.0_
