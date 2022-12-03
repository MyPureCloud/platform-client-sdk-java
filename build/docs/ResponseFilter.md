---
title: ResponseFilter
---
## ResponseFilter


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | Field to filter on. Allowed values are 'name', 'libraryId', 'text.contentType', 'messagingTemplate' and 'responseType' |  |
| **operator** | [**OperatorEnum**](#OperatorEnum)<!----> | Filter operation: IN, EQUALS, NOTEQUALS. |  |
| **values** | <!----><!---->**List&lt;String&gt;**<!----> | Values to filter on. If name is 'responseType' then allowed values are 'CampaignSmsTemplate', 'CampaignEmailTemplate', 'Footer' and 'Signature' |  |
{: class="table table-striped"}


<a name="OperatorEnum"></a>

## Enum: OperatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| IN | &quot;IN&quot; | 
| EQUALS | &quot;EQUALS&quot; | 
| NOTEQUALS | &quot;NOTEQUALS&quot; | 
{: class="table table-striped"}



