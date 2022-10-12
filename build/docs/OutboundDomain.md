---
title: OutboundDomain
---
## OutboundDomain


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | Unique Id of the domain such as: example.com |  |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **cnameVerificationResult** | <!----><!---->[**VerificationResult**](VerificationResult.html)<!----> | CNAME registration Status |  [optional] |
| **dkimVerificationResult** | <!----><!---->[**VerificationResult**](VerificationResult.html)<!----> | DKIM registration Status |  [optional] |
| **senderType** | [**SenderTypeEnum**](#SenderTypeEnum)<!----> | Sender Type |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
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



