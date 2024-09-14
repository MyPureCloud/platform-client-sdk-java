# DnsRecordEntry


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **host** | **String** | the hostname of the DNS entry |  [optional] |
| **recordContents** | **String** | the payload of the DNS entry |  [optional] |
| **verificationStatus** | [**VerificationStatusEnum**](#Enum--VerificationStatusEnum) | the current status of the related verification process |  [optional] |


## Enum: VerificationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| VERIFIED | &quot;Verified&quot; | 
| FAILED | &quot;Failed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:209.1.0_
