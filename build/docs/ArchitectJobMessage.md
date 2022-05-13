---
title: ArchitectJobMessage
---
## ArchitectJobMessage


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dateTime** | <!----><!---->[**Date**](Date.html)<!----> | The DateTime when the message was generated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The message type. |  [optional] |
| **text** | <!----><!---->**String**<!----> | The text of the message. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ERROR | &quot;Error&quot; | 
| WARNING | &quot;Warning&quot; | 
{: class="table table-striped"}



