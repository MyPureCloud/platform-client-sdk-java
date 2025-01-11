# EmailOutboundDomainResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dnsCnameBounceRecord** | [**DnsRecordEntry**](DnsRecordEntry) |  |  [optional] |
| **dnsTxtSendingRecord** | [**DnsRecordEntry**](DnsRecordEntry) |  |  [optional] |
| **domainName** | **String** |  |  [optional] |
| **senderStatus** | [**SenderStatusEnum**](#Enum--SenderStatusEnum) |  |  [optional] |
| **senderType** | [**SenderTypeEnum**](#Enum--SenderTypeEnum) |  |  [optional] |


## Enum: SenderStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REQUESTRECEIVED | &quot;RequestReceived&quot; | 
| PROVISIONREQUESTSENTVENDOR | &quot;ProvisionRequestSentVendor&quot; | 
| PROVISIONED | &quot;Provisioned&quot; | 
| ERROR | &quot;Error&quot; | 
| DEPROVISIONED | &quot;Deprovisioned&quot; | 


## Enum: SenderTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| EMAILDOMAIN | &quot;EmailDomain&quot; | 
| MOCKEMAILDOMAIN | &quot;MockEmailDomain&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:217.1.0_
