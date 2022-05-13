---
title: VoicemailRetentionPolicy
---
## VoicemailRetentionPolicy


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **voicemailRetentionPolicyType** | [**VoicemailRetentionPolicyTypeEnum**](#VoicemailRetentionPolicyTypeEnum)<!----> | The retention policy type |  [optional] |
| **numberOfDays** | <!----><!---->**Integer**<!----> | If retentionPolicyType == RETAIN_WITH_TTL, then this value represents the number of days for the TTL |  [optional] |
{: class="table table-striped"}


<a name="VoicemailRetentionPolicyTypeEnum"></a>

## Enum: VoicemailRetentionPolicyTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| RETAIN_INDEFINITELY | &quot;RETAIN_INDEFINITELY&quot; | 
| RETAIN_WITH_TTL | &quot;RETAIN_WITH_TTL&quot; | 
| IMMEDIATE_DELETE | &quot;IMMEDIATE_DELETE&quot; | 
{: class="table table-striped"}



