---
title: OutboundSettings
---
## OutboundSettings


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | <!----><!---->**String**<!----> | The globally unique identifier for the object. |  [optional] |
| **name** | <!----><!---->**String**<!----> |  |  [optional] |
| **dateCreated** | <!----><!---->[**Date**](Date.html)<!----> | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | <!----><!---->[**Date**](Date.html)<!----> | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | <!----><!---->**Integer**<!----> | Required for updates, must match the version number of the most recent update |  [optional] |
| **maxCallsPerAgent** | <!----><!---->**Integer**<!----> | The maximum number of calls that can be placed per agent on any campaign |  [optional] |
| **maxConfigurableCallsPerAgent** | <!----><!---->**Integer**<!----> | The maximum number of calls that can be configured to be placed per agent on any campaign |  [optional] |
| **maxLineUtilization** | <!----><!---->**Double**<!----> | The maximum percentage of lines that should be used for Outbound, expressed as a decimal in the range [0.0, 1.0] |  [optional] |
| **abandonSeconds** | <!----><!---->**Double**<!----> | The number of seconds used to determine if a call is abandoned |  [optional] |
| **complianceAbandonRateDenominator** | [**ComplianceAbandonRateDenominatorEnum**](#ComplianceAbandonRateDenominatorEnum)<!----> | The denominator to be used in determining the compliance abandon rate |  [optional] |
| **automaticTimeZoneMapping** | <!----><!---->[**AutomaticTimeZoneMappingSettings**](AutomaticTimeZoneMappingSettings.html)<!----> | The settings for automatic time zone mapping. Note that changing these settings will change them for both voice and messaging campaigns. |  [optional] |
| **selfUri** | <!----><!---->**String**<!----> | The URI for this object |  [optional] |
{: class="table table-striped"}


<a name="ComplianceAbandonRateDenominatorEnum"></a>

## Enum: ComplianceAbandonRateDenominatorEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| ALL_CALLS | &quot;ALL_CALLS&quot; | 
| CALLS_THAT_REACHED_QUEUE | &quot;CALLS_THAT_REACHED_QUEUE&quot; | 
{: class="table table-striped"}



