---
title: ConversationEventTopicRecentTransfer
---
## ConversationEventTopicRecentTransfer


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The id of the command. |  [optional] |
| **state** | [**StateEnum**](#StateEnum)<!----> |  |  [optional] |
| **dateIssued** | <!----><!---->[**Date**](Date.html)<!----> | The date/time that this command was issued. |  [optional] |
| **initiator** | <!----><!---->[**ConversationEventTopicInitiator**](ConversationEventTopicInitiator.html)<!----> |  |  [optional] |
| **modifiedBy** | <!----><!---->[**ConversationEventTopicModifiedBy**](ConversationEventTopicModifiedBy.html)<!----> |  |  [optional] |
| **destination** | <!----><!---->[**ConversationEventTopicDestination**](ConversationEventTopicDestination.html)<!----> |  |  [optional] |
| **transferType** | [**TransferTypeEnum**](#TransferTypeEnum)<!----> | The type of transfer to perform. |  [optional] |
{: class="table table-striped"}


<a name="StateEnum"></a>

## Enum: StateEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| PENDING | &quot;pending&quot; | 
| ACTIVE | &quot;active&quot; | 
| COMPLETE | &quot;complete&quot; | 
| CANCELED | &quot;canceled&quot; | 
| FAILED | &quot;failed&quot; | 
| TIMEOUT | &quot;timeout&quot; | 
| UNKNOWN | &quot;unknown&quot; | 
{: class="table table-striped"}


<a name="TransferTypeEnum"></a>

## Enum: TransferTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ATTENDED | &quot;attended&quot; | 
| UNATTENDED | &quot;unattended&quot; | 
{: class="table table-striped"}



