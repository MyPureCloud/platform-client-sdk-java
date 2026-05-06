# DmarcResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **status** | [**StatusEnum**](#Enum--StatusEnum) | The DMARC status of this domain |  |
| **detectedPolicy** | [**DetectedPolicyEnum**](#Enum--DetectedPolicyEnum) | The DMARC policy that was detected in the associated DNS record, if one is present |  [optional] |
| **dateChecked** | [**Date**](Date) | The date of the most recent check of the domain's DMARC DNS record. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  |
| **records** | [**List&lt;Record&gt;**](Record) | The minimum DMARC DNS record that Genesys Cloud recommends |  |


## Enum: StatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| NOTPRESENT | &quot;NotPresent&quot; | 
| INVALID | &quot;Invalid&quot; | 
| VALID | &quot;Valid&quot; | 


## Enum: DetectedPolicyEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
| NONE | &quot;none&quot; | 
| QUARANTINE | &quot;quarantine&quot; | 
| REJECT | &quot;reject&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:252.1.0_
