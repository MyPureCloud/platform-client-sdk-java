---
title: Reason
---
## Reason


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **code** | [**CodeEnum**](#CodeEnum)<!----> | The reason code for the failed message receipt. |  [optional] |
| **message** | <!----><!---->**String**<!----> | Description of the reason for the failed message receipt. |  |
{: class="table table-striped"}


<a name="CodeEnum"></a>

## Enum: CodeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| MESSAGEEXPIRED | &quot;MessageExpired&quot; | 
| RATELIMITED | &quot;RateLimited&quot; | 
| MESSAGENOTALLOWED | &quot;MessageNotAllowed&quot; | 
| GENERALERROR | &quot;GeneralError&quot; | 
| UNSUPPORTEDMESSAGE | &quot;UnsupportedMessage&quot; | 
| UNKNOWNMESSAGE | &quot;UnknownMessage&quot; | 
| INVALIDMESSAGESTRUCTURE | &quot;InvalidMessageStructure&quot; | 
| INVALIDDESTINATION | &quot;InvalidDestination&quot; | 
| SERVERERROR | &quot;ServerError&quot; | 
| MEDIATYPENOTALLOWED | &quot;MediaTypeNotAllowed&quot; | 
| INVALIDMEDIACONTENTLENGTH | &quot;InvalidMediaContentLength&quot; | 
| RECIPIENTOPTEDOUT | &quot;RecipientOptedOut&quot; | 
{: class="table table-striped"}



