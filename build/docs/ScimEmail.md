---
title: ScimEmail
---
## ScimEmail


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **value** | <!----><!---->**String**<!----> | The email address. Is immutable if \&quot;type\&quot; is set to \&quot;other\&quot;. |  [optional] |
| **type** | [**TypeEnum**](#TypeEnum)<!----> | The type of email address. \&quot;value\&quot; is immutable if \&quot;type\&quot; is set to \&quot;other\&quot;. |  [optional] |
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



