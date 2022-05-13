---
title: ScimEmail
---
## ScimEmail


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **value** | <!----><!---->**String**<!----> | The email address. Is immutable if \"type\" is set to \"other\". |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of email address. \"value\" is immutable if \"type\" is set to \"other\". |  [optional] |
| **primary** | <!----><!---->**Boolean**<!----> | Indicates whether the email address is the primary email address. |  [optional] |
{: class="table table-striped"}


<a name="TypeEnum"></a>

## Enum: TypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| WORK | &quot;work&quot; | 
| OTHER | &quot;other&quot; | 
{: class="table table-striped"}



