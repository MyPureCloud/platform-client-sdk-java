# AddAdherenceExplanationAdminRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#Enum--TypeEnum) | The type of the adherence explanation |  |
| **startDate** | [**Date**](Date) | The start timestamp of the adherence explanation in ISO-8601 format |  |
| **lengthMinutes** | **Integer** | The length of the adherence explanation in minutes |  |
| **notes** | **String** | Notes about the adherence explanation |  [optional] |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The status of the adherence explanation |  [optional] |


## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LATE | &quot;Late&quot; | 


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| APPROVED | &quot;Approved&quot; | 
| DENIED | &quot;Denied&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:229.1.0_
