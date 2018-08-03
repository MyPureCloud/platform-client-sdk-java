---
title: OutboundSettingsNotification
---
## OutboundSettingsNotification


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** |  |  [optional] |
| **name** | **String** |  |  [optional] |
| **dateCreated** | [**Date**](Date.html) |  |  [optional] |
| **dateModified** | [**Date**](Date.html) |  |  [optional] |
| **version** | **Integer** |  |  [optional] |
| **maxCallsPerAgent** | **Integer** |  |  [optional] |
| **maxLineUtilization** | [**BigDecimal**](BigDecimal.html) |  |  [optional] |
| **abandonSeconds** | [**BigDecimal**](BigDecimal.html) |  |  [optional] |
| **complianceAbandonRateDenominator** | [**ComplianceAbandonRateDenominatorEnum**](#ComplianceAbandonRateDenominatorEnum) |  |  [optional] |
{: class="table table-striped"}


<a name="ComplianceAbandonRateDenominatorEnum"></a>

## Enum: ComplianceAbandonRateDenominatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; |
| ALL_CALLS | &quot;ALL_CALLS&quot; |
| CALLS_THAT_REACHED_QUEUE | &quot;CALLS_THAT_REACHED_QUEUE&quot; |
{: class="table table-striped"}



