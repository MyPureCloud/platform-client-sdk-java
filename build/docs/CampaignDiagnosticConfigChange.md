# CampaignDiagnosticConfigChange


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **date** | [**Date**](Date) | Timestamp when the configuration change occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **field** | **String** | Field name that was changed |  [optional] |
| **value** | **String** | New value assigned to the configuration field |  [optional] |
| **action** | [**ActionEnum**](#Enum--ActionEnum) | Type of operation applied |  [optional] |


## Enum: ActionEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UPDATE | &quot;Update&quot; | 
| CREATE | &quot;Create&quot; | 
| DELETE | &quot;Delete&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:253.2.0_
