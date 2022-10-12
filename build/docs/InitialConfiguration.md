---
title: InitialConfiguration
---
## InitialConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **audioState** | <!----><!---->[**AudioState**](AudioState.html)<!----> | Indicates the initial audio state for the communication. |  [optional] |
| **alerting** | <!----><!---->**Boolean**<!----> | Indicates that this communication's initial state is alerting. If false, the communication started in a connected state. |  [optional] |
| **inbound** | <!----><!---->**Boolean**<!----> | Indicates the direction of this communication with respect to the contact center. `true` means the communication is INBOUND. `false` means the communication is OUTBOUND. |  [optional] |
| **invitedBy** | <!----><!---->**String**<!----> | The id of the communication (the \"peer\") that \"invited\" this communication, if this occurred. |  [optional] |
| **recordingActive** | <!----><!---->**Boolean**<!----> | Indicates whether recording is active for this communication at creation. |  [optional] |
| **additionalInfo** | <!----><!---->**Map&lt;String, String&gt;**<!----> | Additional metadata about this session which should be recorded by the platform but which will not be indexed or searchable. Primarily for diagnostic value. Any information that needs to be accessible through other components like Analytics should be moved to dedicated fields. |  [optional] |
{: class="table table-striped"}



