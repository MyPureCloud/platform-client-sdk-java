# ExternalEventSummary


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **schemaId** | **String** | The schema ID of the external event |  [optional] |
| **eventName** | **String** | The name of the external event |  [optional] |
| **displayName** | **String** | The display name of the external event |  [optional] |
| **rank** | **Integer** | The rank of the external event |  [optional] |
| **activationStatus** | [**ActivationStatusEnum**](#Enum--ActivationStatusEnum) | The activation status of the external event |  [optional] |
| **systemStatus** | [**SystemStatusEnum**](#Enum--SystemStatusEnum) | The system status of the external event |  [optional] |
| **dateCreated** | [**Date**](Date) | The timestamp when the external event was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | The timestamp when the external event was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateFirstActivated** | [**Date**](Date) | The timestamp when the external event was first activated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |


## Enum: ActivationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ACTIVATED | &quot;Activated&quot; | 
| DEACTIVATED | &quot;Deactivated&quot; | 


## Enum: SystemStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NEW | &quot;New&quot; | 
| UPDATED | &quot;Updated&quot; | 
| ACTIVE | &quot;Active&quot; | 
| INACTIVE | &quot;Inactive&quot; | 
| ERROR | &quot;Error&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:262.0.0_
