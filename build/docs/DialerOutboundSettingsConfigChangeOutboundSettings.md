# DialerOutboundSettingsConfigChangeOutboundSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **maxCallsPerAgent** | **Integer** | The maximum number of calls that can be placed per agent on any campaign |  [optional] |
| **maxLineUtilization** | [**BigDecimal**](BigDecimal) | The maximum percentage of lines that should be used for Outbound, expressed as a decimal in the range [0.0, 1.0] |  [optional] |
| **abandonSeconds** | [**BigDecimal**](BigDecimal) | The number of seconds used to determine if a call is abandoned |  [optional] |
| **complianceAbandonRateDenominator** | [**ComplianceAbandonRateDenominatorEnum**](#Enum--ComplianceAbandonRateDenominatorEnum) | The denominator to be used in determining the compliance abandon rate |  [optional] |
| **automaticTimeZoneMapping** | [**DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings**](DialerOutboundSettingsConfigChangeAutomaticTimeZoneMappingSettings) |  |  [optional] |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The UI-visible name of the object |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |


## Enum: ComplianceAbandonRateDenominatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL_CALLS | &quot;ALL_CALLS&quot; | 
| CALLS_THAT_REACHED_QUEUE | &quot;CALLS_THAT_REACHED_QUEUE&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:220.0.0_
