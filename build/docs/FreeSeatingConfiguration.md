---
title: FreeSeatingConfiguration
---
## FreeSeatingConfiguration


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **freeSeatingState** | [**FreeSeatingStateEnum**](#FreeSeatingStateEnum)<!----> | The FreeSeatingState for FreeSeatingConfiguration. Can be ON, OFF, or PARTIAL. ON meaning disassociate the user after the ttl expires, OFF meaning never disassociate the user, and PARTIAL meaning only disassociate when a user explicitly clicks log out. |  [optional] |
| **ttlMinutes** | <!----><!---->**Integer**<!----> | The amount of time in minutes until an offline user is disassociated from their station |  [optional] |
{: class="table table-striped"}


<a name="FreeSeatingStateEnum"></a>

## Enum: FreeSeatingStateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ON | &quot;ON&quot; | 
| OFF | &quot;OFF&quot; | 
| PARTIAL | &quot;PARTIAL&quot; | 
{: class="table table-striped"}



