---
title: EmailInitialConfiguration
---
## EmailInitialConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **to** | <!----><!---->**String**<!----> | An email address that this email is to. |  |
| **from** | <!----><!---->**String**<!----> | An email address that this email is from. |  |
| **cc** | <!----><!---->**List&lt;String&gt;**<!----> | An email addresses that this email is carbon copied to. |  [optional] |
| **bcc** | <!----><!---->**List&lt;String&gt;**<!----> | An email addresses that this email is blind carbon copied to. |  [optional] |
| **subject** | <!----><!---->**String**<!----> | The subject for this email. |  [optional] |
| **previousEmailId** | <!----><!---->**String**<!----> | UUID identifying the most recent previous email communication ID from the same participant on this email conversation. Will be null if this is a new participant. |  [optional] |
| **held** | <!----><!---->**Boolean**<!----> | Indicates that this communication's initial state is held. |  [optional] |
| **alerting** | <!----><!---->**Boolean**<!----> | Indicates that this communication's initial state is alerting. If false, the communication started in a connected state. |  [optional] |
| **inbound** | <!----><!---->**Boolean**<!----> | Indicates the direction of this communication with respect to the contact center. `true` means the communication is INBOUND. `false` means the communication is OUTBOUND. |  [optional] |
| **invitedBy** | <!----><!---->**String**<!----> | The id of the communication (the \"peer\") that \"invited\" this communication, if this occurred. |  [optional] |
| **additionalInfo** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Additional metadata about this session which should be recorded by the platform but which will not be indexed or searchable. Primarily for diagnostic value. Any information that needs to be accessible through other components like Analytics should be moved to dedicated fields. |  [optional] |
{: class="table table-striped"}



