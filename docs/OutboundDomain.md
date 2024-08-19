# OutboundDomain


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | Unique Id of the domain such as: example.com |  |
| **name** | **String** |  |  [optional] |
| **cnameVerificationResult** | [**VerificationResult**](VerificationResult) | CNAME registration Status |  [optional] |
| **dkimVerificationResult** | [**VerificationResult**](VerificationResult) | DKIM registration Status |  [optional] |
| **senderType** | [**SenderTypeEnum**](#Enum--SenderTypeEnum) | Sender Type |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |
{: class="table table-striped"}


## Enum: SenderTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| UNKNOWN | &quot;Unknown&quot; | 
| EMAILDOMAIN | &quot;EmailDomain&quot; | 
| MOCKEMAILDOMAIN | &quot;MockEmailDomain&quot; | 
{: class="table table-striped"}



