---
title: ExternalMetricDefinitionCreateRequest
---
## ExternalMetricDefinitionCreateRequest


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **name** | <!----><!---->**String**<!----> | The name of the External Metric Definition |  |
| **unit** | [**UnitEnum**](#UnitEnum)<!----> | The unit of the External Metric Definition |  |
| **unitDefinition** | <!----><!---->**String**<!----> | The unit definition of the External Metric Definition |  [optional] |
| **precision** | <!----><!---->**Integer**<!----> | The decimal precision of the External Metric Definition. Must be at least 0 and at most 5 |  |
| **defaultObjectiveType** | [**DefaultObjectiveTypeEnum**](#DefaultObjectiveTypeEnum)<!----> | The default objective type of the External Metric Definition |  |
| **enabled** | <!----><!---->**Boolean**<!----> | True if the External Metric Definition is enabled |  |
{: class="table table-striped"}


<a name="UnitEnum"></a>

## Enum: UnitEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| SECONDS | &quot;Seconds&quot; | 
| PERCENT | &quot;Percent&quot; | 
| NUMBER | &quot;Number&quot; | 
| CURRENCY | &quot;Currency&quot; | 
{: class="table table-striped"}


<a name="DefaultObjectiveTypeEnum"></a>

## Enum: DefaultObjectiveTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| HIGHERISBETTER | &quot;HigherIsBetter&quot; | 
| LOWERISBETTER | &quot;LowerIsBetter&quot; | 
| TARGETAREA | &quot;TargetArea&quot; | 
{: class="table table-striped"}



