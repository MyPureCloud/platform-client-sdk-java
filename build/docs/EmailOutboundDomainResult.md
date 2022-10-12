---
title: EmailOutboundDomainResult
---
## EmailOutboundDomainResult


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dnsCnameBounceRecord** | <!----><!---->[**DnsRecordEntry**](DnsRecordEntry.html)<!----> |  |  [optional] |
| **dnsTxtSendingRecord** | <!----><!---->[**DnsRecordEntry**](DnsRecordEntry.html)<!----> |  |  [optional] |
| **domainName** | <!----><!---->**String**<!----> |  |  [optional] |
| **senderStatus** | [**SenderStatusEnum**](#SenderStatusEnum)<!----> |  |  [optional] |
| **senderType** | [**SenderTypeEnum**](#SenderTypeEnum)<!----> |  |  [optional] |
{: class="table table-striped"}


<a name="SenderStatusEnum"></a>

## Enum: SenderStatusEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REQUESTRECEIVED | &quot;RequestReceived&quot; | 
| PROVISIONREQUESTSENTVENDOR | &quot;ProvisionRequestSentVendor&quot; | 
| PROVISIONED | &quot;Provisioned&quot; | 
| ERROR | &quot;Error&quot; | 
| DEPROVISIONED | &quot;Deprovisioned&quot; | 
{: class="table table-striped"}


<a name="SenderTypeEnum"></a>

## Enum: SenderTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| EMAILDOMAIN | &quot;EmailDomain&quot; | 
| MOCKEMAILDOMAIN | &quot;MockEmailDomain&quot; | 
{: class="table table-striped"}



