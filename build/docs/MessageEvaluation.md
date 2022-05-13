---
title: MessageEvaluation
---
## MessageEvaluation


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **contactColumn** | <!----><!---->**String**<!----> | The name of the contact column that was wrapped up |  [optional] |
| **contactAddress** | <!----><!---->**String**<!----> | The address (phone or email) that was wrapped up |  [optional] |
| **messageType** | [**MessageTypeEnum**](#MessageTypeEnum)<!----> | The type of message sent |  [optional] |
| **wrapupCodeId** | <!----><!---->**String**<!----> | The id of the wrap-up code |  [optional] |
| **timestamp** | <!----><!---->[**Date**](Date.html)<!----> | The time that the wrap-up was applied. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
{: class="table table-striped"}


<a name="MessageTypeEnum"></a>

## Enum: MessageTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SMS | &quot;Sms&quot; | 
| EMAIL | &quot;Email&quot; | 
{: class="table table-striped"}



