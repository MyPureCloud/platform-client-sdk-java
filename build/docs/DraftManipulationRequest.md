---
title: DraftManipulationRequest
---
## DraftManipulationRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **translate** | <!----><!---->[**HistoryHeadersTranslation**](HistoryHeadersTranslation.html)<!----> | A set of definitions to translate email attributes and correctly display date and time, for a given language |  [optional] |
| **draftType** | [**DraftTypeEnum**](#DraftTypeEnum)<!----> | The kind of draft that as to be treated. Used to prefix response subject or auto-include information |  [optional] |
{: class="table table-striped"}


<a name="DraftTypeEnum"></a>

## Enum: DraftTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| REPLY | &quot;Reply&quot; | 
| REPLYALL | &quot;ReplyAll&quot; | 
| FORWARD | &quot;Forward&quot; | 
{: class="table table-striped"}



