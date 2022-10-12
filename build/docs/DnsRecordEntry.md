---
title: DnsRecordEntry
---
## DnsRecordEntry


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **host** | <!----><!---->**String**<!----> | the hostname of the DNS entry |  [optional] |
| **recordContents** | <!----><!---->**String**<!----> | the payload of the DNS entry |  [optional] |
| **verificationStatus** | [**VerificationStatusEnum**](#VerificationStatusEnum)<!----> | the current status of the related verification process |  [optional] |
{: class="table table-striped"}


<a name="VerificationStatusEnum"></a>

## Enum: VerificationStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;Pending&quot; | 
| VERIFIED | &quot;Verified&quot; | 
| FAILED | &quot;Failed&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
{: class="table table-striped"}



