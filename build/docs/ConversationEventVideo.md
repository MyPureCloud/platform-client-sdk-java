---
title: ConversationEventVideo
---
## ConversationEventVideo


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | Describes the type of Video event. |  |
| **offeringId** | <!----><!---->**String**<!----> | The Video offering ID. |  [optional] |
| **jwt** | <!----><!---->**String**<!----> | The Video offering JWT token. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| OFFERING | &quot;Offering&quot; | 
| OFFERINGEXPIRED | &quot;OfferingExpired&quot; | 
| OFFERINGACCEPTED | &quot;OfferingAccepted&quot; | 
| OFFERINGREJECTED | &quot;OfferingRejected&quot; | 
{: class="table table-striped"}



